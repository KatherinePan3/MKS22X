import java.util.*;
import java.io.*;

public class Bronze{
    private int row;
    private int col;
    private int finalElevation;
    private int commandNum;
    private int[][] grid;
    private int[][] commands;

    public Bronze(String filename){
	try{
	    Scanner sc = new Scanner(new File(filename));
	    row = sc.nextInt();
	    col = sc.nextInt();
	    finalElevation = sc.nextInt();
	    commandNum = sc.nextInt();
	    grid = new int[row][col];
	    for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
		    grid[i][j]=sc.nextInt();
		}
	    }
	    commands = new int[commandNum][3];
	    for(int a=0;a<commandNum;a++){
		for(int b=0;b<3;b++){
		    commands[a][b]=sc.nextInt();
		}
	    }
	}catch(FileNotFoundException e){
	    System.out.println("file not found");
	}
    }
    

    public void  printout(){
	System.out.println("row:"+row);
	System.out.println("col:"+col);
	System.out.println("finalElevation:"+finalElevation);
	System.out.println("grid:"+gridtoString());
	System.out.println("commandnum:"+commandNum);
	System.out.println("commands:" + commandgridtoString());
    }
    public String gridtoString(){
	String str = "";
	for(int i=0;i<row;i++){
	    for(int j=0;j<col;j++){
		str+=grid[i][j]+",";
		    }
	    str+="\n";
	}
	return str;
    }

     public String commandgridtoString(){
	String str = "";
	for(int i=0;i<commandNum;i++){
	    for(int j=0;j<3;j++){
		str+=commands[i][j]+",";
		    }
	    str+="\n";
	}
	return str;
    } 

    public void stomp(int x,int y,int depth){
	int highest =0;
	for(int i=x-1;i<x+2;i++){
	    for(int j=y-1;j<y+2;j++){
		if(grid[i][j]>highest){
		    highest = grid[i][j];
		}
	    }
	}
	for(int a=x-1;a<x+2;a++){
	    for(int b=y-1;b<y+2;b++){
		if(grid[a][b]== highest){
		    grid[a][b]=highest - depth;
		}
		if(grid[a][b]>highest - depth){
		    int num = grid[a][b];
		    grid[a][b]= num-(depth-(highest-num));
		}
	    }
	}
    }

    public void FinalElevation(){
	for(int i=0;i<row;i++){
	    for(int j=0;j<col;j++){
		if(grid[i][j]>=finalElevation){
		    grid[i][j]=0;
		}
		else{
		    grid[i][j]=finalElevation - grid[i][j];
		}
	    }
	}
    }

    public int calculate(){
	int depth = 0;
	for(int i=0;i<commandNum;i++){
	    stomp(commands[i][0],commands[i][1],commands[i][2]);
	}
	FinalElevation();
	for(int a=0;a<row;a++){
	    for(int b=0;b<col;b++){
		depth+=grid[a][b];
	    }
	}
	return(depth * 72 * 72);
    }
    
    public static void main(String[]args){
	String file = args[0];
	Bronze b = new Bronze(file);
	//	b.printout();
	System.out.println(b.calculate()+ ",7,Pan,Katherine");
    }
}


