public class Queens{
   private  int size;
   private  int[][] grid;

    public Queens(int length){
	size=length;
	grid = new  int [length][length];
	for(int i=0;i<length;i++){
	    for(int j=0;j<length;j++){
		grid[i][j]=0;
	    }
	}
    }


    public void printSolution(){
	String ans = "";
	for(int i=0;i<size;i++){
	    for(int j=0;j<size;j++){
		if(grid[i][j]==-1){
		    ans+="Q"+"\t";
		}
		else{
		    ans+="_"+"\t";
		}
	    }
	    ans+="\n";
	}
	System.out.println(ans);
    }
    public boolean addQueens(int row, int col){
        if(grid[row][col]!=0){
	    return false;}
	int increment = 1;
	grid[row][col]=1;
	while(col+increment<size){
	    grid[row][col+increment]--;
	    if(row+increment<size){
		grid[row+increment][col+increment]--;
	    }
	    if(row-increment>=0){
		grid[row-increment][col+increment]--;
	    }
	    increment ++;
	}
	return true;
    }
	    

	public boolean removeQueens(int row, int col){
	    if(grid[row][col]!=1){
		return false;}
	    int increment = 1;
	    grid[row][col]=1;
	    while(col+increment<size){
		grid[row][col+increment]++;
		if(row+increment<size){
		    grid[row+increment][col+increment]++;
		}
		if(row-increment>=0){
		    grid[row-increment][col+increment]++;
		}
		increment ++;
	}
	return true;
    }

    public String toString(){
	
    }

}
