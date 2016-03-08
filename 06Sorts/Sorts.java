import java.util.Arrays;
public class Sorts{
    public static void SelectionSort(int[] num){
	int first;
	int temp;
	for(int i=num.length-1;i>0;i--){
	    first = 0;
	    for(int k=1;k<=i;k++){
		if(num[k]<num[first]){
		    first=k;}
	    }
	    temp = num[first];
	    num[first]=num[i];
	    num[i]=temp;
	}
    }
    public static void InsertionSort(int[] num){
	int toInsert;
	int k;
	for(int i=1;i<num.length;i++){
	    toInsert=num[i];
	    for(k=i-1;(k>=0)&&(num[k]<toInsert);k--){
		num[k+1]=num[k];}
	    num[k+1]=toInsert;
	}
    }

    public static void BubbleSort(int[]num){
	boolean flag = true;
	int temp;
	while(flag){
	    flag=false;
	    for(int i=0;i<num.length-1;i++){
		if(num[i]<num[i+1]){
		    temp=num[i];
		    num[i]=num[i+1];
		    num[i+1]=temp;
		    flag=true;
		}
	    }
	}
    }
    

    public static void mergesort(int[] data){
	mergesort(data,0,data.length - 1);
    }

    public static void mergesort(int[] data,int start,int end){
	if (start<end){
	    int center =(start+end) /2;
	    mergesort(data,start,center);
	    mergesort(data,center+1,end);
	    merge(data,start,center,center+1,end);
	}
    }


    public static void merge(int[] data,int Sa,int Ea, int Sb,int Eb){
	int length = Eb-Sa+1;
	int[] num = new int[length];
	int count = 0;
	int start = Sa;
	while(Sa <= Ea && Sb <= Eb && count < length){
	    if(data[Sa]<=data[Sb]){
		num[count]=data[Sa];
		Sa++;
		count++;}
	    else{
		num[count]=data[Sb];
		Sb++;
		count++;
	    }
	}
	while(Sa<=Ea){
	    num[count]=data[Sa];
	    Sa++;
	    count++;
	}
	while(Sb<=Eb){
	    num[count]=data[Sb];
	    Sb++;
	    count++;
	}
	
	for(int k=0;k<length;k++){
	    data[start]=num[k];
	    start++;
	}
    }

}
