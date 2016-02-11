public class Recursion implements hw01{
    public String name(){
	return "Pan,Katherine";
    }
    public double sqrt(double n){
	if(n<0){
	    throw new IllegalArgumentException();
	}
	else{
	    return helper(n, n/2);
	}
    }
    public double helper(double n, double guess){
	if(Math.abs(n-guess*guess)< 0.000000000001){
	    return guess;}
	else{
	    return helper(n,(n/guess+guess)/2);
	}
    }
}
