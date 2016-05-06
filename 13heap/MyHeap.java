import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>>
{
   private int size;
   private T[] data;

   public MyHeap(){
       size=0;
       data=new T[1];
   }
   public MyHeap(T[] array){
       data=array;
       size=array.length;
       heapify();
   }
   private void pushDown(int k){
       if(hasChildren(k)){
	   if(data[k]<data[k*2]){
	       swap(k,k*2);}
	   if(data[k]<data[k*2+1]){
	       swap(k,k*2+1);}
       }
   }
   private void pushUp(int k){
       if(data[k/2]<data[k]){
	   swap(k/2,k);
       }
   }
   private void heapify(){
   }
   public T delete(){
   }
   public void add(T x){
   }
   private void doubleSize(){
   }
   public String toString(){
   }
 
   public void swap(int x,int y){
       T temp;
       temp=data[x];
       data[x]=data[y];
       data[y]=temp;
   }
   
   public boolean hasChildren(int k){
       if(K <= size/2){
	   return true;}
       return false;
   }
   //do this last
   public MyHeap(boolean isMax)
   public MyHeap(T[] array, boolean isMax)

}

