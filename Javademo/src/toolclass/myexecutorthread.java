package toolclass;

public class myexecutorthread implements Runnable {

	   int i=0;
	    public myexecutorthread(int i){
	        this.i=i;
	    }
	    public void run() {
	        System.out.println("myexecutorthread"+Thread.currentThread().getName()+"====="+i);
	    }

	

}
