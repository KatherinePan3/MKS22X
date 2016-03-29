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
	return data.remove(0);
    }

    /**
     * Returns the top item from the stack without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T peek(){
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
}

