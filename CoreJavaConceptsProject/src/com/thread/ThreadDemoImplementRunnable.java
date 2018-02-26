package com.thread;

class MyThread1 implements Runnable{

	@Override
	public void run() {
		for(int i =0; i<10; i++){
			System.out.println("Hello "+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadDemoImplementRunnable {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThread1());
		Thread t2 = new Thread(new MyThread1());
		t1.start();
		t2.start();
		
	}
}
