package com.indy905.java.problems.solving;

public class RunnableTest {

	public static void main(String[] args) {
		/*
		 * Runnable test
		 */
		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Thread name : " + threadName);
		};
		
		task.run();
		
		Thread thread = new Thread(task);
		thread.start();
		
		System.out.println("Program is done!");
	}

}
