import java.util.*; 
import java.io.*;  
public class Driver{ 
    public static void main(String[] arg){ 
	BetterMaze m = new BetterMaze("data1.txt"); 
	m.setAnimate(true); 
	m.solveBFS(); 
 
     } 
    
 
 }
