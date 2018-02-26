package com.thread.synchronization;

import java.util.concurrent.CountDownLatch;

class Service implements Runnable{
	
	private String serviceName;
	private int timeToExecute;
	private CountDownLatch latch;
	
	public Service(String serviceName, int timeToExecute, CountDownLatch latch) {
		super();
		this.serviceName = serviceName;
		this.timeToExecute = timeToExecute;
		this.latch = latch;
	}

	public void run(){
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(serviceName +" is Up");
		
		latch.countDown();
	}
}

public class CountDownLatchExample {

	
	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(3);
		
		Thread firstService = new Thread(new Service("fistService", 1000, latch));
		Thread secondService = new Thread(new Service("secondService", 1000, latch));
		Thread thirdService = new Thread(new Service("thirdService", 1000, latch));
		
		firstService.start();
		secondService.start();
		thirdService.start();
		
		try {
			latch.await();
		} catch (InterruptedException e) {
		}
		
		System.out.println("all service are Up. Now main thread can start processing");
	}
}
