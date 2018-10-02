package com.indy905.java.problems.solving;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorInvokeAnyTest {

public static void main(String[] args) {
	Callable<String> task1 = () -> {
        Thread.sleep(2000);
        return "Result of Task1";
    };

    Callable<String> task2 = () -> {
        Thread.sleep(1000);
        return "Result of Task2";
    };

    Callable<String> task3 = () -> {
        Thread.sleep(5000);
        return "Result of Task3";
    };
	
	ExecutorService executor = Executors.newWorkStealingPool();

	List<Callable<String>> callables = Arrays.asList(
			task1,
			task2,
			task3);

	String result = "";
	try {
		result = executor.invokeAny(callables);
	} catch (InterruptedException | ExecutionException e) {
		e.printStackTrace();
	}
	System.out.println(result);
}
}
