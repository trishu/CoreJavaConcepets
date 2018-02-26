package com.thread.synchronization.waitnotify;

import java.util.LinkedList;

public class ProducerConsumerWithWaitNotify {
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	int LIMIT = 10;

	public void producer() throws InterruptedException{
		
		int i = 0;
		while(true){
			
			synchronized (this) {
				while(list.size() == LIMIT){
					System.out .println("Queue is full Producer thread waiting for "
                            + "consumer to take something from queue");
					wait();
				}
				
				list.add(i++);
				notify();
			}
			
		}
		
	}
	
	public void consumer() throws InterruptedException {
		Thread.sleep(2000);
		
		while(true){
			
			synchronized (this) {
				while(list.size() == 0){
					System.out.println("list is empty Consumer thread is waiting for producer");
					wait();
				}
				
				System.out.println("Consuming value : " + list.removeFirst());
				
				notify();
			}
		}
		
		
	}
	
}
