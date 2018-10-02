package com.indy905.java.problems.solving;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorInvokeAllTest {
public static void main(String ...strings) {
	ExecutorService executor = Executors.newWorkStealingPool();
	
	List<Callable<String>> callables = Arrays.asList(
			() -> "task1",
			() -> "task2",
			() -> "task3");
	
	try {
		executor.invokeAll(callables).stream().map(future -> {
			String result = "";
			try {
				 result = future.get();
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
			return result;
		}).forEach(System.out::println);
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}
}
