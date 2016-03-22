public class MyLinkedList<T>{
    private class LNode<T>{
	private T value;
	private LNode<T> next;
	public LNode(T v){
	    value = v;}
	public T getValue(){
	    return value;}
	public void setValue(T v){
	    value=v;}
	public LNode<T> getNext(){
	    return next;}
	public void setNext(LNode n){
	    next=n;}

    }

    private LNode<T> head;
    private int size;
    private LNode<T> end;


    public boolean add(int index,int value){
	LNode<T> p = head;
	for(int i=0;i<index;i++){
	    p=p.getNext();
	}
	LNode current = p.getValue();
	p.setNext(current);
	p= new LNode(value);
	size++;
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
	LNode<T> p = head;
	for(int i=0;i<index;i++){
	    p=p.getNext();
	}
	return p.getValue();
    }


    public T set(int index,T newValue){
	LNode<T> p = head;
	for(int i =0;i<index;i++){
	    p=p.getNext();}
	T num = p.getValue();
	p.setValue(newValue);
	return num;
    }

	    
    
    public T remove(int index){
	LNode<T> p = head;
	for(int i=0;i<index;i++){
	    p=p.getNext();}
	T num = p.getValue();
	if(p==head){
	    head=p.getNext();}
	else{
	    p=p.getNext();
	}
	size-=1;
	return num;}
	    

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


}
