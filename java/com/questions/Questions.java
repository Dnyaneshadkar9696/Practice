package com.questions;

public class Questions {
	
	// The Pune test Questions. 
	
   // understanding the concept of circular queue by implementation
	
	private int[] q;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    
    
    
    // use constructor to initialize the global variables
    
    public Questions(int k) {
    	
    	q = new int[k];  // get the array to store the elements of the queue.
    	front = 0;   // gives the first element of the queue
    	rear = -1; // gives the last element of the queue
    	capacity = k; // tells what will be the capacity to store elements in the queue.
    	size = 0;  // tells how many elements are currently in the queue
    	
    }
	

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean enQueue(int value) { // enqueue means to add an element to the rear of the queue and return true if the operation is successful, otherwise return false.
        if (isFull()) {
            return false;
        }

        rear = (rear + 1) % capacity;
        q[rear] = value;
        size++;
        return true;
    }

    public boolean deQueue() {  // dequeue means to remove the first element of the queue and return true if the operation is successful, otherwise return false.
        if (isEmpty()) {
            return false;
        }

        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return q[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return q[rear];
    }
}
