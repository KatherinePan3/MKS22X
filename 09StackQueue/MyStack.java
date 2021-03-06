import java.util.*;
public class MyStack<T>{
    private MyLinkedList<T> data;
    public MyStack(){
	data = new MyLinkedList<T>();
    }
    /**
     * Adds the given item to the top of the stack.
     */
    public void push(T item){
	data.add(0,item);
    }
    
    /**
     * Removes the top item from the stack and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T pop(){
	if(isEmpty()){
	    throw new NoSuchElementException();}
	return data.remove(0);
    }

    /**
     * Returns the top item from the stack without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T peek(){
	if(isEmpty()){
	    throw new NoSuchElementException();}

	return data.get(0);
    }
 

    /**
     * Returns the number of items currently in the stack.
     */
    public int size(){
	return data.size();
    }

    /**
     * Returns whether the stack is empty or not.
     */
    public boolean isEmpty(){
	return size()==0;
    }

    public String toString(){
	return data.toString();
    }

    public static void main(String[]args){
	MyStack<Integer> data = new MyStack<Integer>();
	MyStack<Integer> data2 = new MyStack<Integer>();
	
	System.out.println("testing peek and pop on empty stack: ");
	System.out.println(data.peek());
	data.pop();
	System.out.println(data);
       
	
	
	for(int i=0;i<10;i++){
	    data.add(i);
	    data2.add(i);
	}
	System.out.println("added numbers 1-9 to both stacks");
	System.out.println(data+"size: "+data.size());
	System.out.println(data2+"size: "+data2.size());
	
	System.out.println("remove: ");
	data.remove();
	data2.remove();
	System.out.println(data);
	System.out.println(data2);


	

	
    }
}

