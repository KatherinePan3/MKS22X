public class MyLinkedList<T>{
    private class LNode{
	private int value;
	private LNode next;
	public LNode(int v){
	    value = v;}
	public int getValue(){
	    return value;}
	public void setValue(int v){
	    value=v;}
	public LNode getNext(){
	    return next;}
	public void setNext(LNode n){
	    next=n;}

    }

    private LNode head;
    private int size;
    private LNode end;

    public boolean add(int value){
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
    
    public int get(int index){
	LNode p = head;
	for(int i=0;i<index;i++){
	    p=p.getNext();
	}
	return p.getValue();
    }


    public int set(int index,int newValue){
	LNode p = head;
	for(int i =0;i<index;i++){
	    p=p.getNext();}
	int num = p.getValue();
	p.setValue(newValue);
	return num;
    }

	    
    
    public boolean remove(int index){
	LNode p = head;
	for(int i=0;i<index;i++){
	    p=p.getNext();}
	int num = p.getValue();
	if(p==head){
	    head=p.getNext();}
	else{
	    p=p.getNext();
	}
	size-+1;
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
