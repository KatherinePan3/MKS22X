public class MyLinkedList{
    private class LNode{
	int value;
	LNode next;
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

    LNode head;
    int size;

    public boolean add(int value){
	if(head==null){
	    head = new LNode(value);}
	else{
	    LNode p = head;
	    while(p.getNext()!=null){
		p=p.getNext();}
	    p.setNext(new LNode(value));}
	size+=1;
	return true;}


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
