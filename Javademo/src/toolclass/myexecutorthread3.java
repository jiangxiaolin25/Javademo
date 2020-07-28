package toolclass;


import java.text.SimpleDateFormat;
import java.util.Date;

public class myexecutorthread3 implements Runnable {
	final long executeTime = (long) (Math.random()*10);

	   
	    public void run() {
	    	
	    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			System.out.print(sdf.format(new Date()) + " 开始执行, ");
			try {
				Thread.sleep(7000);//3s
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(sdf.format(new Date()) + "结束执行 ================"+"\n");

	    }

	

}
