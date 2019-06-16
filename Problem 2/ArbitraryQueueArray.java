// using dynamic capacity array here, not for problem 1, also tried to implement generic, NO scanner used 
	

	import java.util.ArrayList;
	import java.util.EmptyStackException;
	import java.util.*;
	

	import ArbitraryQueueArray.Node;
	

	class ArbitraryQueueArray <Object> 
	public class ArbitraryQueueArray {
		private static final Exception now = null;
		private int array[];
		private int index =0;
		private int firstsize;
		private int queue[];
		private int front, back, secondsize, lens;
		
	public ArbitraryQueueArray (int n) {		// made constructor 
		this.firstsize=n;
		array = new int [firstsize];
		this.secondsize=n;
		lens =0;
		queue = new int[secondsize];
		front =-1;
		back =-1;
	}
	public void push (Object object) {			// push implementation
		if(isFull) {
			throw now StackOverFlowError("Stack is Full!");
		}
		array[index]=object;
		index++;
	

	public int pop () {						// pop implementation
		if (isEmpty) {
			throw now EmptyStackExcpetion();	
		}
			return array [--index];
		
	}
	public boolean isEmpty() {		
		if (index == 0) {
			return true;
		}
		return false;
	}
		
	public void Enqueue (Object object) {			//enqueue implementation
		if (back ==-1) {
			front =0;
			 back=0;
			 Queue[back]=i;
		}
		else if (back+1 >= size)
			throw now IndexOutofBoundExcpetion ("Overflow Excpetion!")
			else if (back+1 < size)
				Queue[++back]=i;
		lens++;
	}
		
	public int Dequeue()			//dequeue implementation
	{
		if (isEmpty())
			throw now NoSuchElementsException ("Underflow Exception");
		else {
			lens--;
			int element = Queue[front];
			if (front == back)
			{
				front =-1;
				back = -1;
					
			}
			else 
				front ++;
			return element;
		}
	}
	

	public boolean isEmpty() {			// value return 
			return front == -1;
		}
		
	}
	

	/*public Object traverse(int index) 		// traverse function (empty)
	{
		
	} */
	

	/* copy handling function implementation
	 * int x []={1,2....n}
	 * int y []= new int[x.length]
	 * system.arraycopy(x,0,y,0,y.length)
	 * arraycopy (x,z,y,a,b)
	 * x = starting/source array, y=destination array, z = starting postion in source array
	 * a = starting postion in source array, b= # of array elements to to be copied from source array 
	
	/* void EmptyStackExcpetion() {
		// TODO Auto-generated method stub
		
	}
		private void StackOverFlowError(String string) {
		// TODO Auto-generated method stub
		
	}
		private Node first,last;
		ArbitraryQueue(){
			
		}
		
		public class Node
		{
			private Object object;
			private Node next;
			
		}
		
		public boolean isEmpty() {
			return n == 0;
			
		}
		
		public boolean isFull() {
			return n == item.getLength(null); 
		}
		
		public void Push (Object object) {
			item[n++] = item;
			
		}
		
		public void Enqueue(Object object)
		{
			Node oldlast = last;
			last = new Node();
			last.object = object;
			last.next = null;
		}
		public Object pop()
		{
			return item [--n];
		}
		
		public Object dequeue()
		{
			Object object = first.object;
			first = first.next;
			if (isEmpty()) last = null;
			return object;
		}
		
		public Object traverse(int index) 
		{
			return object;
		}
	
	} */


