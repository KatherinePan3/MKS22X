public class Queens{
    int size;
    int[][] grid;

    public Queens(int length){
	size = length;
	grid = new  int [length][length];
	for(int i=0;i<length;i++){
	    for(int j=0;j<length;j++){
		grid[i][j]=0;
	    }
	}
    }
    public boolean addQueens(int row, int col){
	if(grid[row][col]!=0){
	    return false;}
	else{
	    grid[row][col]+=1;}
	    
    }
	public boolean removeQueens(int row, int col){
    }
    
	public void change(int row,int col,int increment){
	    grid[row][col]+=increment;
	}
}
