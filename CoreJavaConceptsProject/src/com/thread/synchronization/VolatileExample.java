package com.thread.synchronization;

import java.util.Scanner;

class MyThread2 extends Thread{
	
	private volatile boolean flag = true;
	
	public void run(){
		while(flag){
			System.out.println("Hello");
		}
	}
	
	public void shutdown(){
		this.flag= false;
	}
}

public class VolatileExample {

	public static void main(String[] args) {
		
		MyThread2 thread = new MyThread2();
		thread.start();
		
		System.out.println("press keyto stop the thread execution...");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		thread.shutdown();
	}
	
}
