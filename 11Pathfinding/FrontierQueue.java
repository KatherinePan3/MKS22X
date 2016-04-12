import java.util.*;
public class FrontierQueue<T> implements Frontier<T>{
    /***Make This Work This Weekend!***/
    /***You can use your classes or built in ones***/
    /***You can extend another class OR wrap around it***/
    public Queue<T> frontier;
    public FrontierQueue(){
	frontier= new LinkedList<T>();
    }
    public void add(T element){
	frontier.add(element);
    }
    public boolean hasNext(){
	return !frontier.isEmpty();}
     public T next(){
	if(!hasNext()){
	    throw new NoSuchElementException();}
	return frontier.remove();
    
    }
}
