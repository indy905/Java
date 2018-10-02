package com.indy905.java.problems.solving;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceTest {

public static void main(String[] args) {
	try {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
		ScheduledFuture<?> future = executor.schedule(task, 3, TimeUnit.SECONDS);
		TimeUnit.MILLISECONDS.sleep(1001);	
		long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
		System.out.println("Remaining Delay: " + remainingDelay + " ms");
		
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
}

}
