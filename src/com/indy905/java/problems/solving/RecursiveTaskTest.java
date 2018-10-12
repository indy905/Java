package com.indy905.java.problems.solving;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class RecursiveTaskTest extends RecursiveTask<Integer> {
	private int[] arr;

    private static final int THRESHOLD = 4;

    public RecursiveTaskTest(int[] arr) {
        this.arr = arr;
    }

    @Override
    protected Integer compute() {
        if (arr.length > THRESHOLD) {
            return ForkJoinTask.invokeAll(createSubtasks())
                    .stream()
                    .mapToInt(ForkJoinTask::join)
                    .sum();
        } else {
            return processing(arr);
        }
    }

    private Collection<RecursiveTaskTest> createSubtasks() {
        List<RecursiveTaskTest> dividedTasks = new ArrayList<>();
        dividedTasks.add(new RecursiveTaskTest(
                Arrays.copyOfRange(arr, 0, arr.length / 2)));
        dividedTasks.add(new RecursiveTaskTest(
                Arrays.copyOfRange(arr, arr.length / 2, arr.length)));
        return dividedTasks;
    }

    private Integer processing(int[] arr) {
        return Arrays.stream(arr)
                .map(a -> a * 10)
                .sum();
    }

    public static void main(String[] args) {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        RecursiveTaskTest task = new RecursiveTaskTest(arr);

        System.out.println(task.compute());
    }
}
