import java.util.*;
public class Quick{

    private static int[] partition(int[] data ,int left,int right){
	int rnd = (int)(Math.random()*(right-left)+left);
	int length = right-left+1;
	int[] newAry = new int[length];
	int temp=data[rnd];
	int start = left;
	int end = right;
	int newLeft=0;
	int newRight=length-1;
	for(int i=left;i<=right;i++){
	    if(data[i]<temp){
		newAry[newLeft]=data[i];
		newLeft++;
		start++;}
	    if(data[i]>temp){
		newAry[newRight]=data[i];
		newRight--;
		end--;}
	}
	int[] ans={start,end}; 
	for(int j=newLeft;j<=newRight;j++){
	  newAry[j]=temp;
		}
	int count =0;
	int a =left;
	while(a<=right&&count<length-1){
	    data[a]=newAry[count];
	    a++;
	    count++;
	    }
	return ans;
    }
    private static int partitionOld(int[] data,int left,int right){
	int rnd = (int)(Math.random()*(right-left)+left);
	int temp=data[rnd];
	int end = right;
	swap(data,rnd,right);
	right--;
	while(right>left){
	    if(data[left]>temp){
		swap(data,left,right);
		right--;
	    }
	    if(data[left]<=temp){
		left++;
	    }
	    if(data[right]<temp){
		swap(data,right,left);
		left++;
	    }
	    }
	    if(data[right]>=temp){
		right--;
	    }
  
    
	if(data[left]>=temp){
	    swap(data,left,end);
	    return left;
	}
	else{
	    swap(data,left+1,end);
	    return left+1;}

	
    }
  public static void quickSort(int[] data){
	quickSort(data,0,data.length-1);
    }
    
    public static void quickSort(int[] data,int left,int right){
	if(left<right){
	    int[] num = partition(data,left,right);
	    quickSort(data,left,num[0]-1);
	    quickSort(data,num[1]+1,right);
	}
    }


    
    public static void quickSortOld(int[] data){
	quickSortOld(data,0,data.length-1);
    }
    
    public static void quickSortOld(int[] data,int left,int right){
	if(right - left >0){
	    int num = partitionOld(data,left,right);
	    quickSortOld(data,left,num-1);
	    quickSortOld(data,num+1,right);
	}
    }

    public static int quickSelectOld(int[] data,int k){
	return quickSelectOld(data,k,0,data.length-1);
    }

    public static int quickSelectOld(int[] data,int k,int start,int end){
	if(start<end){
	    int num = partitionOld(data,start,end);
	    if(num==k){
		return data[num];}
	    if(num>k){
		return quickSelectOld(data,k,start,num);}
	    if(num<k){
		return quickSelectOld(data,k,num+1,end);}
	}
	return data[k];
    }

    public static void swap(int[] data,int a,int b){
	int temp = 0;
	temp = data[a];
	data[a]=data[b];
	data[b]=temp;
    }

    public static String name(){
	return "7,Pan,Katherine";
    }

    public static void main(String[]args){
	Quick q = new Quick();
	int[] d = new int[4000000];
	int[] c = new int[d.length];
	int[] e = new int[d.length];
	for(int i=0;i<d.length;i++){
	    d[i]=(int)(Math.random()*3);
	    c[i]=d[i];
	    e[i]=d[i];
	}

	long startTime2=System.currentTimeMillis();
	Arrays.sort(c);
	long endTime2=System.currentTimeMillis();
	System.out.println("Arrays "+(endTime2-startTime2));


	long startTime=System.currentTimeMillis();
	q.quickSort(d);
	long endTime=System.currentTimeMillis();
	System.out.println("quicksort "+(endTime-startTime));



	long startTime3=System.currentTimeMillis();
	q.quickSortOld(e);;
	long endTime3=System.currentTimeMillis();
	System.out.println("old "+(endTime3-startTime3));
    }
}
