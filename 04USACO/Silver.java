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
	solveH(x,y);
	return grid[a][b];
    }

    public void solveH(int x,int y){
	for(int i=0;i<seconds;i++){
	    for(int a=0;a<row;a++){
		for(int b=0;b<col;b++){
		    addsur(a,b);}
	    }
	}
    }

    public void  addsur(int x,int y){
	int sum = 0;
	if(isSafe(x+1,y)&& grid[x+1][y]!=-1){
	    sum+=grid[x+1][y];
	}
	if(isSafe(x,y+1)&& grid[x][y+1]!=-1){
	    sum+=grid[x][y+1];
	}
	if(isSafe(x-1,y) && grid[x-1][y]!=-1){
	    sum+=grid[x-1][y];
	}
	if(isSafe(x,y-1)&& grid[x][y-1]!=-1){
	    sum+=grid[x][y-1];
	}
	System.out.println(sum);
	grid[x][y]=sum;
    }

    public boolean isSafe(int x,int y){
	if(x>=row || y>=col || x<0 ||y<0){
	    System.out.println("notsafe");
	    return false;
	}
	System.out.println("safe");
	return true;
    }

    public String toString(){
	String str = "";
	for(int i=0;i<row;i++){
	    for(int j=0;j<col;j++){
		str+=grid[i][j];
	    }
	    str+="\n";
	}
	return str;
    }

    public static void main(String[]args){
	Silver b = new Silver("datas.txt");
	System.out.println(b);
        System.out.println(b.solve());
	System.out.println(b);
    }

    
}
