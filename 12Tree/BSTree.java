public class BSTree<T extends comparable<T>>{
    private class Node{
	T data;
	Node left;
	Node right;
	public Node(T d, Node l, Node r){
	    data=d;
	    left=l;
	    right=r;
	}
	public Node(T d){
	    data=d;
	}
	// set/get: data/left/right
	public T getData(){
	    return data;
	}
	public Node getLeft(){
	    return left;}
	public Node getRight(){
	    return right;}
	public void setData(T d){
	    data=d;}
	public void setLeft(Node n){
	    left=n;}
	public void setRight(Node n){
	    right=n;}
	    

	//real methods here
	public int height(){ 
	    if(getLeft().height()>getRight().height()){
		return left.height()+1;
	    }
	    else if(getRight().height()>getLeft().height()){
		return getRight().height()+1;}
	    retuen getLeft().height()+1;}
	    
	}
	public void add(T value){
	    if(data==null){
		data=value;}
	    if(value.compareTo(getData())<=0){
		if(getLeft()==null){
		    setLeft(new Node(value));}
		if(getRight()==null){
		    setRight(new Node(value));}
	    }else{
		if(getRight()==null){
		    setRight(new Node(value));}
		else{getRight().add(value);}
	    }
	}
	public String toString(){
	    String str = "";
	    str= str +getData()+left.getData()+right.getData();
	    return str;
	    
	}
	public boolean contains(T value){
	    if(data==null){
		return false;}
	    return true;
	}
    
    }

	private Node root;

	//OUTER methods here are wrapper methods for the root
	public getHeight(){
	    //call the root's methods
	    //check for empty first!
	    return root.height();
	}

	public void add(T value){
	    //check for empty before you do things with root.
	    if(root.getData()==null){
		root = new Node(value);}
	    root.add(value);
	}
	public String toString(){
	    //check for empty before you do things with root.
	    return "";
	}
	public boolean contains(T value){
	    //check for empty before you do things with root.
	    return root.contains(value);
	}
    }
