package toolclass;

public class myexecutorthread2 implements Runnable {

	   int i=0;
	    public myexecutorthread2(int i){
	        this.i=i;
	    }
	    public void run() {
	    	
	        System.out.println(Thread.currentThread().getName()+"====="+100/i);
	    }

	

}
