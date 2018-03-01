package com.thread.synchronization.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class InterviewProcessor implements Runnable {

private BlockingQueue<String> queue;
	
	InterviewProcessor(BlockingQueue<String> queue){
		this.queue = queue;
	}

	@Override
	public void run() {
		
		try {
			Thread.sleep(10000);
			String msg = queue.take();
			while(!(msg = queue.take()).equals("stop")){
				
				System.out.println(msg+" interview complelted!");
				Thread.sleep(10000);
			}
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		System.out.println("All Candidates interview has completed!");
	}


}
