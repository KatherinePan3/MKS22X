import java.io.*;
public class ParenDemo{

    public static boolean isMatching(String s){
	MyStack<String> data = new MyStack<String>();
	for(int i=0;i<s.length();i++){
	    if(isOpen(s.substring(i,i+1))){
		data.push(s.substring(i,i+1));}
	    if(isClose(s.substring(i,i+1))){
		if(opposite(s.substring(i,i+1)).equals(data.peek())){
		    data.pop();}
		else{return false;}
	    }
	}
	return true;
    }
		
		    

    
    public static boolean isOpen(String s){
	if(s.equals("{") || s.equals("(") || s.equals("[")){
	    return true;}
	return false;
    }
    public static boolean isClose(String s){
	if(s.equals("}") || s.equals(")") || s.equals("]")){
	    return true;}
	return false;
    }
    public static String opposite(String s){
	if(s.equals(")")){
	    return "(";}
	if(s.equals("}")){
	    return "{";}
	if(s.equals("]")){
	    return "[";}
	return " ";
    }

    
    public static void main(String[]args){
	String input = "()()(([[]]))";
	if(args.length > 0){
	    input = args[0];
	    System.out.println( isMatching(input)); 
	}else{
	    System.out.println("Usage:"); 
	    System.out.println("java ParenDemo \"text\""); 
	}
    }

}
