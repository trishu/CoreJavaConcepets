package com.thread.synchronization.waitnotify;

import java.util.Scanner;

//to test this use the wait notify client class
public class Processor {
	
	public void producer() throws InterruptedException{
		synchronized (this) {
			System.out.println("producer is running...");
			wait();
			
			System.out.println("resumed..");
		}
	}
	
	public void consumer() throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		Thread.sleep(2000);
		synchronized (this) {
			System.out.println("press enter to release the lock");
			sc.nextLine();
			notify();
		}
	}

}
