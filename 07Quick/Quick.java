import java.util.*;
public class Quick{
    private static int partition(int[] data,int left,int right){
	int rnd = new Random().nextInt(data.length);
	int temp=0;
	temp = data[rnd];
	data[rnd]=data[right];
	data[right]=temp;
	right--;
	int num=0;
	while(right>=left){
	    if(data[left]>=temp){
		num=data[left];
		data[left]=data[right];
		data[right]=num;
		right--;}
	    if(data[right]<=temp){
		num=data[right];
		data[right]=data[left];
		data[left]=num;
		left++;}
	    if(data[left]<=temp){
		left++;}
	    if(data[right]>=temp){
		right++;}
	}

	data[right]=num;
	return right;
    }

    public static void main(String[]args){
	Quick q = new Quick();
	int[] data = {2,3,5,6,3,4,7,8};
	System.out.println(q.partition(data,0,7));
    }
}
