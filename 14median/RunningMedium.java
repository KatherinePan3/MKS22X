public class RunningMedian{
    private MyHeap maxH;
    private MyHeap minH;
    public RunningMedian(){
	maxH=new MyHeap(true);
	minH=new MyHeap(false);
    }

    public double getMedian(){		
	double median=0.0;
	if(maxH.getSize()==0 && minH.getSize()){
	    throw new NoSuchElementException();}
	
    }

    public void add(Integer x){
	
    }


}
