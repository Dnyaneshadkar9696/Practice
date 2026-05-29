package com.controller;

import com.questions.Questions;

public class Controller {
	
	public static void main(String[] args) {
		
		Questions q = new Questions(5);
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		System.out.println(q.Front());
		System.out.println(q.Rear());
		q.deQueue();  // removes the first element 
		System.out.println(q.Front());
		
			
		
	}

}
