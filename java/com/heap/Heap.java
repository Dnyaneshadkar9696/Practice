package com.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {
	
	
	// find the kth largest element using the heap data structure 
	
	public void priorityQue() {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		pq.offer(5);
		pq.offer(2);
		pq.offer(10);
		pq.offer(19);
		pq.offer(47);
		
		// The offer and add elements add the elements in the priority queue 
		// just that the remove method remove the smallest element and
		// the peek just returns the smallerst element in the priority queue
		// the poll method removes the smallest element and returns it
		
		// now we want to find the kth largest element in the priority queue
		
		// for that we can use a min heap of size k to keep track of the k largest elements in the priority queue
		
		// first largest element in the priority queue is 47 and the second largest element is 19 and the third largest element is 10 and the fourth largest element is 5 and the fifth largest element is 2
    System.out.println("This is the largest element: ");		
	System.out.println(pq.peek());

	// remove the top element now largest is the second largest element
	
//	pq.poll();
//	System.out.println("This is the second largest element: " + pq.peek());
	
	// we assume the min value as 
	int largest = pq.peek(); // it does not delete just returns the largest value.
	int secondLargest = Integer.MIN_VALUE;
	
	for(Integer num : pq) {
		if(num != largest && num > secondLargest) {
			secondLargest = num;
		}
	}
	
	System.out.println("Second Largest element is : " + secondLargest);
		
		//poll removes the largest element and returns it
	// as we have reversed the order of the priority queue so the largest element is at the top and the smallest element is at the bottom
		// so poll removes the top element
	}

}
