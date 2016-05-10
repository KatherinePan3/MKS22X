import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>>
{
   private int size;
   private T[] data;

   public MyHeap(){
       size=0;
       data= (T[])new Comparable[5];
   }
   public MyHeap(T[] array){
       data=array;
       size=array.length;
       heapify();
   }
   private void pushDown(int k){
       if(hasChildren(k)){
	   if(data[k].compareTo(data[k*2])<0){
	       swap(k,k*2);
	       
	   }
	   if(data[k].compareTo(data[k*2+1])<0){
	       swap(k,k*2+1);}
       }
   }
   private void pushUp(int k){
       if(data[k/2].compareTo(data[k])<0){
	   swap(k/2,k);
       }
   }
   private void heapify(){
       if(size>0){
	   heapHelp(1);
       }	   
   }
   private void heapHelp(int k){
       if(hasChildren(k)){
	   if(data[k].compareTo(data[k*2])<0){
	       pushDown(k);
	       heapHelp(k*2);
	   }
	   if(data[k].compareTo(data[k*2+1])<0){
	       pushDown(k);
	       heapHelp(k*2+1);
	   }
       }
   }
	   
   public T delete(){
       T value = data[1];
       swap(1,size);
       for(int i=0;i<size;i=i*2+1){
	   pushDown(i);}
       size--;
       return value;
   }
   public void add(T x){
       if(size==data.length-1){
	   doubleSize();}
       else{
	   data[size+1]=x;
	   heapify();
	   size++;}
       
   }
   private void doubleSize(){
       T[] newStuff = (T[])new Comparable[size*2];
       for(int i=0;i<size;i++){
	   newStuff[1]=data[1];
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
}

