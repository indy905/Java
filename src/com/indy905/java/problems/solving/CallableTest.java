package com.indy905.java.problems.solving;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableTest {
	public static void main(String ... args) {
		Callable<Integer> task = () -> {
			try {
				TimeUnit.SECONDS.sleep(3);
				return 999;
			} catch (InterruptedException ex) {
				throw ex;
			}
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<Integer> future = executor.submit(task);
		System.out.println("Future done (1) : " + future.isDone());
		try {
			Integer result = future.get(1, TimeUnit.SECONDS);
			System.out.println("Future done (2) : " + future.isDone());
			System.out.println("Result : " + result);
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}
	}
}
