package com.thread.synchronization.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class InterviewScheduler implements Runnable {
	
	private BlockingQueue<String> queue;
	
	InterviewScheduler(BlockingQueue<String> queue){
		this.queue = queue;
	}

	@Override
	public void run() {
		System.out.println("10 candidates have arrieved!");
		for(int i=1; i<11; i++){
			
			try {
				System.out.println("Candidate "+i+" interview scheduled!");
				queue.put("Candidate "+i);
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			queue.put("stop");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("All Candidates interview has scheduled!");
	}

}
