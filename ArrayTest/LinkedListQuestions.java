package ArrayTest;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListQuestions {

	public void calling() {
		this.reverLinkedList();

		System.out.println();
		this.addTwoNumbers();
		
		System.out.println();
		this.findMiddlenode();
		
	}

	// Reverse Linked List
	public void reverLinkedList() {

		LinkedList<String> li = new LinkedList();

		li.add("ram");
		li.add("sham");
		li.add("ganesh");
		li.add("suraj");
		li.add("rangan");
		li.add("viraj");

		System.out.println("Reversing the list: ");
		Collections.reverse(li);
		System.out.println(li);
	}

	// 2nd question add two numbers

	public void addTwoNumbers() {

		LinkedList<Integer> ti = new LinkedList<Integer>();

		ti.add(2);
		ti.add(5);
		ti.add(8);

		LinkedList<Integer> t = new LinkedList<Integer>();

		t.add(9);
		t.add(8);
		t.add(2);

		// we use here methods such as size and get
		int num1 = 0;
		int num2 = 0;
		// we declared this values so that to store the actual values

		for (int i = 0; i < ti.size(); i++) {

			num1 = num1 * 10 + ti.get(i);
			// this will give 258
		}

		for (int j = 0; j < t.size(); j++) {

			num2 = num2 * 10 + t.get(j);

			// this will give 982
		}

		int sum = num1 + num2;

		// to store this number in the linkedlist

		LinkedList<Integer> str = new LinkedList<Integer>();

		String ss = String.valueOf(sum);

		// This value of helps to convert into string and then we can operate on it

		for (int h = 0; h < ss.length(); h++) {
			
			str.add(ss.charAt(h) - '0');

			// its like '8' - '0' so it will be 8 it will be convert to the integer
		}
		
		System.out.println(str);
	}
	
	
	//3rd Question 
	
	public void findMiddlenode()
	{
		LinkedList<Integer> sfd = new LinkedList<Integer>();
		
		sfd.add(34);
		sfd.add(56);
		sfd.add(433);
		sfd.add(87);
		sfd.add(98);
		sfd.add(76);
		
		int div = sfd.size() /2;
		
		System.out.println(sfd.get(div));
		
		// to get value we use the get method and index are already present
	}

}
