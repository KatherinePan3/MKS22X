import java.util.*;
import java.io.*;
public class Silver{
    private int row;
    private int col;
    private int seconds;
    private int[][] grid;
    private int[][] commands;
    
    public Silver(String filename){
	try{
	    Scanner sc = new Scanner(new File(filename));
	    row = sc.nextInt();
	    col = sc.nextInt();
	    seconds = sc.nextInt();
	    grid = new int[row][col];

	    for(int i=0;i<row;i++){
		String str = sc.next();
		for(int j=0;j<col;j++){
		    if(str.charAt(j)=='.'){
			grid[i][j]=0;}
		    if(str.charAt(j)=='*'){
			grid[i][j]=-1;}
		}
	    }
	    commands= new int[2][2];
	    for(int a=0;a<2;a++){
		for(int b=0;b<2;b++){
		    commands[a][b]=sc.nextInt();
		}
	    }
	}catch(FileNotFoundException e){
	    System.out.println("file not found");
	}
    }
    

    public int solve(){
	int x= commands[0][0]-1;
	int y= commands[0][1]-1;
	int a= commands[1][0]-1;
	int b= commands[1][1]-1;
	grid[x][y]=1;
        for(int i=0;i<seconds;i++){
	    grid= solveH();
	    //	    System.out.println(toString());
	}
	return grid[a][b];
    }

    public int[][] solveH(){
	int[][] other = new int[row][col];
	    for(int a=0;a<row;a++){
		for(int b=0;b<col;b++){
		    if(grid[a][b]!=-1){
			other[a][b]=addsur(a,b);
		    }
		    else{
			other[a][b]=-1;}
		}
	    }
	    return other;
	
    }

    public int  addsur(int x,int y){
	int sum = 0;
	if(isSafe(x+1,y)&& grid[x+1][y]>=0){
	    sum+=grid[x+1][y];
	}
	if(isSafe(x,y+1)&& grid[x][y+1]>=0){
	    sum+=grid[x][y+1];
	}
	if(isSafe(x-1,y) && grid[x-1][y]>=0){
	    sum+=grid[x-1][y];
	}
	if(isSafe(x,y-1)&& grid[x][y-1]>=0){
	    sum+=grid[x][y-1];
	}
	return sum;

    }

    public boolean isSafe(int x,int y){
	if(x>=row || y>=col || x<0 ||y<0){
	    return false;
	}
	return true;
    }

    /* public String toString(){
	String str = "";
	for(int i=0;i<row;i++){
	    for(int j=0;j<col;j++){
		str+=grid[i][j]+" ";
	    }
	    str+="\n";
	}
	return str;
	}*/

    public static void main(String[]args){
	Silver b = new Silver("datas.txt");

        System.out.println(b.solve());

    }

    
}
