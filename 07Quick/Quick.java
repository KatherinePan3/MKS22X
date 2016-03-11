import java.util.*;
public class Quick{

    private static int[] partition(int[] data,int left,int right){
	int rnd = (int)(Math.random()*(right-left)+left);
	System.out.println(data[rnd]);
	int[] newAry = new int[data.length];
	int temp=data[rnd];
	int start = left;
	int end = right;
	for(int i=left;i<right;i++){
	    if(data[i]<temp){
		newAry[start]=data[i];
		start++;}
	    if(data[i]>temp){
		newAry[end]=data[i];
		end--;}
	}
	int[] ans={start,end}; 
	for(int j=start;j<end;j++){
	    newAry[start]=temp;
	}
	
	data=newAry;
	System.out.println(Arrays.toString(data));
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
	if(right - left >0){
	    int num = partitionOld(data,left,right);
	    quickSort(data,left,num-1);
	    quickSort(data,num+1,right);
	}
    }

    public static int quickselect(int[] data,int k){
	return quickselect(data,k,0,data.length-1);
    }

    public static int quickselect(int[] data,int k,int start,int end){
	if(start<end){
	    int num = partitionOld(data,start,end);
	    if(num==k){
		return data[num];}
	    if(num>k){
		return quickselect(data,k,start,num);}
	    if(num<k){
		return quickselect(data,k,num+1,end);}
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
	int[] data = {2,10,5,2,4,4,10,10,4,-1,5,2};
	System.out.println(Arrays.toString(q.partition(data,0,11)));
	//	System.out.println(q.quickselect(data,4));
	//	q.quickSort(data);
	// 	System.out.println(Arrays.toString(data));

    }
}
