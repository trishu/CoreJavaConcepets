package com.thread.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable{

	private int i;
	
	Worker(int i){
		this.i = i;
	}
	
	@Override
	public void run() {
		
		System.out.println("Thread name: "+i+ " started");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread name: "+i+ " completed");
	}
	
	
}

public class ThreadPoolExample {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<10; i++){
			executorService.execute(new Worker(i));
		}
		
		executorService.shutdown();
		
		while (!executorService.isTerminated()) {
        }
        System.out.println("Finished all threads");
	}
}
