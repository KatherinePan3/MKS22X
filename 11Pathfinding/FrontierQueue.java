import java.util.*;
public class FrontierQueue<T> implements Frontier<T>{
    /***Make This Work This Weekend!***/
    /***You can use your classes or built in ones***/
    /***You can extend another class OR wrap around it***/
    public MyQueue<T> frontier;
    public T current;
    public FrontierQueue(){
	frontier= new MyQueue<t>();
    }
    public void add(T element){
	frontier.enqueue(elment);
    }
    public boolean hasNext(){
	return frontier.isEmpty();}
   public T next(){
	if(hasNext()){
	    return current;}
	else{
	    throw new NoSuchElementException();}
    }
}
