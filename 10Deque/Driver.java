import java.util.*;
public class Driver{
    public static void main(String[]args){
	MyDeque<Integer> r = new MyDeque<Integer>();
	Deque<Integer> n = new ArrayDeque<Integer>();
	
	for(int i=0;i<100;i++){
	    r.addFirst(i);
	    n.addFirst(i);
	}
	System.out.println(r);
	System.out.println(n);
    }
    
}
