// dynamic capacity array is used for problem 2, also tried to implement generic, NO scanner used 
	

	 class ArbitraryQueue<Object>   	// generic 
	public class ArbitraryQueue {
		private Node head,first,last;
		ArbitraryQueue(){			//ArbitraryQueue constructor
		first = null;
		last = null;
		}
		public class Node			// node pointer
		{
			private Object object;
			private Node next;
			int data;
			
		}
		public void push(Object object)		// push implementation which inserts @ the head of the ArbitraryQueue
		{
			System.out.println("Enter a word" );
			Node old = first;
			first = new Node();
			first.object=object;
			first.next = old;
			
		}
		public Object pop()			// pop implementation which removes the Object at the head of the ArbitraryQueue and returns it    
		{
			Object object = first.object;
			first = first.next;
			return object;
		}
		
		public boolean isEmpty()		// boolean value implementation 
		{ return first == null;}
		
		public void Enqueue(Object object)		// enqueue implemenetation which inserts @ the tail of the ArbitraryQueue 
		{	
			System.out.println("Enter a word" );
			Node oldlast = last;
			last = new Node();
			last.object = object;
			last.next = null;
		if (isEmpty()) first = last;
		else oldlast.next = last;
		}
		public Object dequeue()				// dequeue implemenetation which removes the Object at the head of the ArbitraryQueue and returns it    
		{
			Object object = first.object;
			first = first.next;
			if (isEmpty()) last = null;
			return object;
		}
		public Object traverse(int index) 		// implement traverse (int index) funtion which retrieves an object at the required lovation and returns it
		{
			
		}
		
		// exception handling with try/catch blocks
		
		try {
			null value;
		} catch (NullPointerException p) {		// appropriate exception --> access a null in order to return a NullPointerException
		NullPointerException
		} catch (Exception p) {
			
		
		}
		public NullPointerException("can not access null pointer")		//using error message to describe the problem to the user
		
		/*
		{
			new Exception().printStackTrace();			// attempt to print out a stack trace for the exception 
		}
		{	System.out.println("Printing stack trace:");
	  	StackTraceElement[] elements = Thread.currentThread().getStackTrace();
	  		for (int i = 1; i < elements.length; i++) {
	    		StackTraceElement s = elements[i];
	    		
	  	}
	  	try {throw new exception();		// attempt to try and catch for stack trace excpetion 
		} catch(Exception e)			// e = error
		{e.printstacktrace();}
		
		}
		*/
		
		
		

	}
