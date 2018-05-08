package com.demo.container;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		for(int i=0; i<intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		
		Queue<String> queue = new LinkedList<String>();
		queue.offer("a");
		queue.offer("b");
		queue.offer("c");
		while (queue.peek() !=null)
			System.out.println(queue.poll());
	}

}
