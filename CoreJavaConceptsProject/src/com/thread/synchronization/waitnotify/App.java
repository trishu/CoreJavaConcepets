package com.thread.synchronization.waitnotify;

public class App {

	public static void main(String[] args) throws InterruptedException {
		
		//Processor proc = new Processor();
		//ProducerConsumerWithWaitNotify proc = new ProducerConsumerWithWaitNotify();
		ReentrantLockExample proc = new ReentrantLockExample();
		
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					proc.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					proc.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
}
