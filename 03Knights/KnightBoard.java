public class KnightBoard{
    private int size;
    private int[][] grid;
    private int[] movex;
    private int[] movey;
    public KnightBoard(int n){
	size = n;
	movex=new int[] {2,1,-1,-2,-2,-1,1,2};
	movey=new int[] {1,2,2,1,-1,-2,-2,-1};
	grid = new int[n][n];
	for(int i=0;i<size;i++){
	    for(int j=0;j<size;j++){
		grid[i][j]=-1;
	    }
	}
    }
    private boolean avaliable(int x,int y){
	return(x>=0 && x<size && y>=0 && y<size && grid[x][y] ==-1);
    }
		       

    public boolean solve(){
	grid[0][0]=1;
	if(solveH(0,0,2)){
	   
	    return true;}
	else{
	    return false;
	   
	}
	
    }
    
    public boolean solveH(int x,int y,int moves){
	int nextX;
	int nextY;
	if(moves == size*size){
	    for(int i=0;i<size;i++){
		for(int j=0;j<size;j++){
		    if(grid[i][j]==-1){
			grid[i][j]=moves;}
		}
	    }
	    return true;}
	for(int i=0;i<8;i++){
	    nextX=x + movex[i];
	    nextY=y + movey[i];
	    if(avaliable(nextX,nextY)){
		    grid[nextX][nextY]=moves;
		    if(solveH(nextX,nextY,moves+1)){
			//	System.out.println(moves+1 +"success");
			return true;}
		    else{
			grid[nextX][nextY]=-1;
			//	System.out.println(moves+1 +"failed");
		    }
		}
	}
	//System.out.println("helper failed");
	return false;
	
    }
    
		
		
  

    public void printSolution(){
	String ans = "";
	if(size<10){
	    for(int i=0;i<size;i++){
		for(int j=0;j<size;j++){
		    ans+=grid[i][j]+"\t";
		}
		ans+="\n";
	    }
	}else{
	    for(int i=0;i<size;i++){
		for(int j=0;j<size;j++){
		    ans+="_" +grid[i][j]+"\t";
		}
		ans+="\n";
	    }
	}
       	System.out.println(ans);
	    

    }
    
    public static void main(String[]args){
	KnightBoard b = new KnightBoard(12);
	b.solve();
	b.printSolution();
    }
}
