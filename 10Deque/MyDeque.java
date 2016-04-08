import java.util.*; 
public class MyDeque<T>{
    private T[] data;
    private int size,start,end;
    @SuppressWarnings("unchecked")
	public MyDeque(){
	data = (T[]) new Object[10];
	size=0;
	start =0;
	end =0;
    }
    @SuppressWarnings("unchecked")
	
	private void grow(){
	T[] newData = (T[]) new Object[data.length*2];
	int num = start;
	for(int i=0;i<size;i++){
	    if(num==size){
		num=0;}
	    newData[i]=data[num];
	    num++;
	}
	start=0;
	end=size-1;
	data=newData;
    }

    public void addFirst(T value){
	if(size==data.length){
	    grow();}
	if(data[start]==null){
	    data[start]=value;}
	if(start==0){
	    start=size-1;
	    data[start]=value;}
	else if(start>=1){
	    start--;
	    data[start]=value;}
	size++;
    }

    public void addLast(T value){
	if(size==data.length){
	    grow();}
	if(data[end]==null){
	    data[end]=value;}
	if(end==size-1){
	    end=0;
	    data[end]=value;}
	else if(end<size){
	    end++;
	    data[end]=value;}
	size++;
    }


    public T removeFirst(){
	if(size==0){
	    throw new NoSuchElementException();}
	T obj = data[start];
	data[start]=null;
	if(start==size-1){
	    start=0;}
	else{
	    start++;}
	return obj;
    }

    public T removeLast(){
	if(size==0){
	    throw new NoSuchElementException();
	}
	T obj=data[end];
	data[end]=null;
	if(end==0){
	    end=size-1;}
	else{
	    end--;}
	return obj;}
    
    public T getFirst(){
	if(size==0){
	    throw new NoSuchElementException();}
	return data[start];
    }
    public T getLast(){
	if(size==0){
	    throw new NoSuchElementException();}
	return data[end];
    }
	
	
}
