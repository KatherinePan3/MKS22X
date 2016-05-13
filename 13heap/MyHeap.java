import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>>
{
   private int size;
   private T[] data;
   private boolean max;

   public MyHeap(){
       size=0;
       data= (T[])new Comparable[5];
       max=true;
   }
   public MyHeap(T[] array){
       data=array;
       size=array.length;
       max=true;
       heapify();
   }
   private void pushDown(int k){
       if(hasChildren(k)){
	   if(compareTo(data[k],data[k*2])<0){
	       swap(k,k*2);
	       pushDown(k*2);
	       
	   }
	   if(compareTo(data[k],data[k*2+1])<0){
	       swap(k,k*2+1);
	       pushDown(k*2);
	   }
       }
   }
   private void pushUp(int k){
       if(k>1 && compareTo(data[k/2],data[k])<0){
	       swap(k/2,k);
	       pushUp(k/2);
	   }
      
   }
   private void heapify(){
       for(int i= size/2;i>0;i--){
	   pushDown(i);
       }
   }
	   
   public T delete(){
       if(size==0){
	   throw new NoSuchElementException();
       }
       T value = peek();
       swap(1,size);
       data[size]=null;
       size--;
       pushDown(1);
       return value;
   }
   public void add(T x){
       if(size==data.length-1){
	   doubleSize();}
       else{
	   data[size+1]=x;
	   pushUp(size+1);
	   size++;}
       
   }
   private void doubleSize(){
       T[] newStuff = (T[])new Comparable[size*2];
       for(int i=0;i<size;i++){
	   newStuff[i]=data[i];
       }
       data=newStuff;
   }
   public String toString(){
       String str = "[";
       for(int i=1;i<size-1;i++){
	   str+=data[i]+",";
	       }
       str+=data[size]+"]";
       return str;
   }
 
   public T peek(){
       if(size==0){
	   throw new NoSuchElementException();}
       return data[1];
   }
   public void swap(int x,int y){
       T temp;
       temp=data[x];
       data[x]=data[y];
       data[y]=temp;
   }
   
   public boolean hasChildren(int k){
       if(k <= size/2){
	   return true;}
       return false;
   }

   public MyHeap(boolean isMax){
       data=(T[]) new Comparable[5];
       max=isMax;
   }
   public MyHeap(T[] array, boolean isMax){
       data=array;
       size=array.length;
       max=isMax;
       heapify();
   }

   public int compareTo(T child, T otherChild){
       if(max){
	   return child.compareTo(otherChild);}
       else{
	   return -1*(child.compareTo(otherChild));
       }
   }

}

