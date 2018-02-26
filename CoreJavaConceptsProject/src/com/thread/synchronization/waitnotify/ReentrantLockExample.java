package com.thread.synchronization.waitnotify;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// this reentrant lock is the subtitute of synchronized lock
public class ReentrantLockExample {
	
	private  Lock lock = new ReentrantLock();
	
	//to use wait and notify, here we have await and signal method of Condition class
	private Condition cond = lock.newCondition();

	
	public void producer() throws InterruptedException{
		lock.lock();
		System.out.println("producer is running...");
		cond.await();
		
		lock.unlock();
		
		System.out.println("resumed..");
	}
	
	public void consumer() throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		Thread.sleep(2000);
		lock.lock();
		System.out.println("press enter to release the lock");
		sc.nextLine();
		cond.signal();
		
		lock.unlock();
	}
	

}
