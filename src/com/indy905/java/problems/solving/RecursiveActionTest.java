package com.indy905.java.problems.solving;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class RecursiveActionTest extends RecursiveAction{
	private long workLoad = 0;

    public RecursiveActionTest(long workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    protected void compute() {
        // 16개 이상이면 분할
        if(this.workLoad > 16) {
            System.out.println("Splitting workLoad : " + this.workLoad);
            List<RecursiveActionTest> subtasks = new ArrayList<RecursiveActionTest>();

            subtasks.addAll(createSubtasks());

            for(RecursiveAction subtask : subtasks){
                subtask.fork(); // 로컬 큐로 던지면 쓰레드들이 달려 들어서 일을 가져 갈 것이다.
            }

        } else {
            // 16개 이하면 작업 실행
            System.out.println("Doing workLoad myself: " + this.workLoad);
        }
    }

    private List<RecursiveActionTest> createSubtasks() {
        List<RecursiveActionTest> subtasks = new ArrayList<RecursiveActionTest>();

        RecursiveActionTest subtask1 = new RecursiveActionTest(this.workLoad / 2); 
        RecursiveActionTest subtask2 = new RecursiveActionTest(this.workLoad / 2);

        subtasks.add(subtask1);
        subtasks.add(subtask2);

        return subtasks;
    }
    
    public static void main(String[] args) {
    	ForkJoinPool forkJoinPool = new ForkJoinPool();
    	RecursiveActionTest myRecursiveAction = new RecursiveActionTest(36); // 24개의 일을 가진 잡을 만들어서
    	forkJoinPool.invoke(myRecursiveAction); //풀에 던진다.
    }
}
