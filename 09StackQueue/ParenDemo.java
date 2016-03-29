public class ParenDemo{

    public boolean isMatching(String s){
	String open = "({[";
	String close = ")}]";
	MyStack<String> data = new MyStack<String>();
	

    }

    public String opposite(String s){
	if(s.equals("(")){
	    return ")";}
	if(s.equals("{")){
	    return "}";}
	if(s.equals("[")){
	    return "]";}
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
