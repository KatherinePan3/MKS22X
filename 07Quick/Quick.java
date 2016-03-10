import java.util.*;
public class Quick{
    private static int partition(int[] data,int left,int right){
	int rnd = (int)(Math.random()*(right-left)+left);
	int temp=data[rnd];
	int end = right;
	//	System.out.println("random num is: "+ data[rnd]);
	//	System.out.println(Arrays.toString(data));
	swap(data,rnd,right);
	//	System.out.println(Arrays.toString(data));
	right--;
	//	System.out.println("initialLeft: "+ left+" initialRight: "+right);
	while(right>left){
	    if(data[left]>temp){
		swap(data,left,right);
		//	System.out.println("swaped "+left+" and "+right);
		right--;
		//	System.out.println("changed right: "+right);
		//	System.out.println(Arrays.toString(data));
	    }
	    if(data[left]<=temp){
		left++;
		//	System.out.println("changed left: "+left);
		//	System.out.println(Arrays.toString(data));
	    }
	    if(data[right]<temp){
		swap(data,right,left);
		//	System.out.println("swaped "+left+" and "+right);
		left++;
		//	System.out.println("changed left: "+left);
		//	System.out.println(Arrays.toString(data));
	    }
	    }
	    if(data[right]>=temp){
		right--;
		//	System.out.println("changed right: "+right);
		//	System.out.println(Arrays.toString(data));
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
	    int num = partition(data,left,right);
	    quickSort(data,left,num-1);
	    quickSort(data,num+1,right);
	}
    }

    public static int quickselect(int[] data,int k){
	return quickselect(data,k,0,data.length-1);
    }

    public static int quickselect(int[] data,int k,int start,int end){
	if(start<end){
	    int num = partition(data,start,end);
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
	int[] data = {2,10,5,-22,48,4,7,8,34,-1,89,-30};
	System.out.println(q.partition(data,0,11));
		System.out.println(q.quickselect(data,4));
	 	q.quickSort(data);
	       	System.out.println(Arrays.toString(data));

    }
}
