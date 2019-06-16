// tried to implement generic, NO scanner used 
	

	import java.util.*;
	

	import ArbitraryQueue.Node;
	

	class Integers<object> 			// generic
	public class Integers {
	Integers() // insertion sort
	{
		System.out.print("swapped a with b");
	}
	}
	{ Public object void Push (int data)		// push implementation in order to push values to the head of the stack 
		push head stack; // head of stack
		array =i;
		System.out.print(i);
		System.out.print("sort finished!");
	}
		
	{	Public void push (int data);		// using the node pointer
	

	class Node<object> 			//generic 
		
	 public class Node
	{
		private Object object;
		private Node next;
		
	}
		
		Node old = first;	
		first = new Node();
		first.object=object;
		first.next = old;
	}
	

		{public Object pop() 			// pop function, pops value from head function and removes it 
		Object object = first.object;
		first = first.next;
		return object; }
	

		public Object peek();{ 				// peek function, returns value from head of stack given input 
		for (int i = 1; i < input.length; i++) {
	        for(int j = i ; j > 0 ; j--){
	            if(input[j] < input[j-1]){
	                temp = input[j];
	                input[j] = input[j-1];
	                input[j-1] = temp;
	}
	        }
		}
		}
	            
	            {public object pastPeek() // past peek function, updated of always peeking the head of the stack prior to sort taking place 
	            	{
	            		Stack<ArrayList> Stack = new Stack <array> (); // array list
	            		int [] array;
	            		int temp;
	            		for (int i = 1; i < array.length; i++) {
	            		    for (int j = i; j > 0; j--) {
	            		     if (array[j] < array [j - 1]) {
	            		      temp = array[j];
	            		      array[j] = array[j - 1];
	            		      array[j - 1] = temp;
	            		     } 
	            		    }
	            		   }
	            		   for (int i = 0; i < array.length; i++) {
	            		     System.out.println(array[i]);   		     
	            		
	            }
	        }
		     
		     /* public class Problem 3{			// side notes of implementation of push, pop 
		     private node first = null;
		     private class node{
		     private int val;
		     private node nxt;
		     }
		     public void push(int val){			
			node oldlast = first;
			first = new node();
			first.value = value;
			first.nxt = old;
			}
			public int pop() {
			int val = first.value;
			first = first.next;
			return val;
