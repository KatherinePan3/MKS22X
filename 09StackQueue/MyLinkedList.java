import java.util.*;
public class MyLinkedList<T> implements Iterable<T>{
    private class LNode{
	private T value;
	private LNode next;
	public LNode(T v){
	    value = v;}
	public T getValue(){
	    return value;}
	public void setValue(T v){
	    value=v;}
	public LNode getNext(){
	    return next;}
	public void setNext(LNode n){
	    next=n;}

    }
    
  

    private LNode head;
    private int size;
    private LNode end;


    public boolean add(int index,T value){
	if(!(0<=index &&  index<=size)){
	    throw new IndexOutOfBoundsException("index out of bound");}
        LNode p = head;
	LNode temp = new LNode(value);
	if(index==0){
	    temp.setNext(head);
	    head = temp;
	}
	else{
	    for(int i=0;i<index-1;i++){
		p=p.getNext();}
	    temp.setNext(p.getNext());
	    p.setNext(temp);
	}
	size++;
	return true;
    }

    public boolean add(T value){
	if(head==null){
	    head = new LNode(value);
	    end = new LNode(value);
	    size+=1;
	}
	else{
	    LNode p = head;
	    while(p.getNext()!=null){
		p=p.getNext();}
	    end = new LNode(value);
	    p.setNext(end);
	    size+=1;}
	return true;}
    
    public T get(int index){
	if(!(0<=index && index<size)){
	    throw new IndexOutOfBoundsException("index out of bound");}
	LNode p = head;
	for(int i=0;i<index;i++){
	    p=p.getNext();
	}
	return p.getValue();
    }


    public T set(int index,T newValue){
	if(!(0<=index && index<size)){
	    throw new IndexOutOfBoundsException("index out of bound");}
	LNode p = head;
	for(int i =0;i<index;i++){
	    p=p.getNext();}
	T num = p.getValue();
	p.setValue(newValue);
	return num;
    }

	    
    
    public T remove(int index){
	if(!(0<=index && index<size)){
	    throw new IndexOutOfBoundsException("index out of bound");}	
	LNode p = head;
	T num;
	if(index == 0){
	    num = head.getValue();
	    head=p.getNext();}
	else if(index == (size-1)){
	    for(int i=0;i<index-1;i++){
		p=p.getNext();}
	    num = p.getNext().getValue();
	    p.setNext(p.getNext().getNext());
	    end = p;
	}
	    
	else{
	    for(int i=0;i<index-1;i++){
		p=p.getNext();}
	    num = p.getNext().getValue();
	    p.setNext(p.getNext().getNext());
	}
	size-=1;
	return num;}

    public String getHead(){
	String ans = "";
	ans+=head.getValue();
	return ans;
    }
    public String getEnd(){
	String ans = "";
	ans+=end.getValue();
	return ans;
    }
	    

    public String toString(){
	String ans = "[";
	LNode p=head;
	while(p!=null){
	    ans+=p.getValue();
	    if(p.getNext()!=null){
		ans+=", ";
	    }
	    p=p.getNext();
	}
	return ans + "]";
    }


    public int size(){
	return size;}


  public Iterator<T> iterator(){
	return new LLiterator();
    }

    public class LLiterator implements Iterator<T>{
	LNode next;
	public LLiterator(){
	    next = head;}

	public boolean hasNext(){
	    return next != null; 
	}
	public T next(){
	    if(!hasNext()){
		throw new NoSuchElementException();
	    }
	    T temp = next.getValue();
	    next = next.getNext();
	    return temp;
	}

	public void remove(){
	    throw new UnsupportedOperationException("Invalid operation");
	}
    }


    }
