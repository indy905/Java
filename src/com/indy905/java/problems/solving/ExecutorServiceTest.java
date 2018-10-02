package com.indy905.java.problems.solving;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest {
	public static void main(String...args) {
		/*
		 * ExecutorService test
		 */
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(() -> {
			String threadname = Thread.currentThread().getName();
			System.out.println("Thread name : " + threadname);
		});
		
		try {
			System.out.println("Not yet!");
			executor.shutdown();
			executor.awaitTermination(5, TimeUnit.SECONDS);
		} catch (InterruptedException ex) {
			System.out.println("Tasks interrupted");
		} finally {
			if (!executor.isTerminated()) {
				System.out.println("Can not finished task");
			}
			executor.shutdownNow();
			System.out.println("Shutdown fininsh");
		}
		
		System.out.println("Program is done!");
	}
}
