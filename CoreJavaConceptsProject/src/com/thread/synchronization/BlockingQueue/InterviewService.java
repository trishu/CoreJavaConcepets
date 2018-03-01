package com.thread.synchronization.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/* This is the interview service which using BlockingQueue. 
 * BlockingQueue has fix size of queue with takes N number of elements(using put(Object o) method) and it blocks when count is reaches for example 3. 
 * then using take method() it will take out the element. it will block the queue if the takes out all the element. 
 * synchrnization is done by blocking queue itself.
 * 
 * Problem statment:: I need to design an interview application which takes 3 participents to the interview hall and only 1 can go beyond to have F2F
 * dicussion with interviewer. we will be having 2 modules, Interview scheduler and interview processor.
 * Below is the implementation of this problem.
 * 
 * 
 * */
public class InterviewService {

	public static void main(String[] args) throws InterruptedException{
		
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
		
		InterviewScheduler producer = new InterviewScheduler(queue);
		InterviewProcessor consumer = new InterviewProcessor(queue);
		
		new Thread(producer).start();
		new Thread(consumer).start();
	}

}
