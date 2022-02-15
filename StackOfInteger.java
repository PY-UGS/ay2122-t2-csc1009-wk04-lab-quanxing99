import java.util.EmptyStackException;

public class StackOfInteger {
	
	private int[] elements;
	
	private int size;
	
	private int index = 0;
	
	public StackOfInteger(){
		this.size = 10;
		this.elements = new int[10];
	}
	
	public StackOfInteger( int capacity){
		this.size = capacity;
		this.elements = new int[capacity];
	}
	
	public int peek() { return this.elements[this.elements.length - 1]; }
	
	public void push(int value) 
	{
	 
		this.elements[index] = value;
	    index++;

	}
	
	
	public int pop() 
	{
		 if (empty()) {
	            throw new EmptyStackException();
	        }
		 
		 return this.elements[--index];

		
	}

	public int getSize() {
		return size;
	}

	public Boolean empty() {
		 if (index == 0) {
	            return true;
	        }
	        return false;
		
	}
	
	
	
	

}
