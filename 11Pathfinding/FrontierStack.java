import java.util.*;
public class FrontierStack<T> implements Frontier<T>{
    /***Make This Work This Weekend!***/
    /***You can use your classes or built in ones***/
    /***You can extend another class OR wrap around it***/

    public Stack<T> frontier;
    public T current;
    public FrontierStack(){
	frontier=new Stack<T>();}
    public void add(T element){
	frontier.push(element);}
    public boolean hasNext()
    {return frontier.isEmpty();}
    public T next(){
	if(hasNext()){
	    frontier.peek();}
	else{
	    throw new NoSuchElementException();}
    }
}
