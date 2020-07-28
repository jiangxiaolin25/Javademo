
public class mythreaddemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object object=new Object();
		 mythread name = new mythread(object);
		 Thread thread = new Thread(name);
		 
//		 System.out.println(thread.getStackTrace());
		 
		 thread.start();
		 
		
		

	}
	
	
	
	
	
	
	

}


class mythread implements Runnable{
	Object obj;
	
	public mythread() {
		// TODO Auto-generated constructor stub
	}
	public mythread(Object obj) {
		// TODO Auto-generated constructor stub
		this.obj=obj;
		
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		print();
		
		
		
	}
	
	public void print() {
		
		for (int i = 0; i < 1000; i++) {
			if (i==5) {
				mywait();
				
			}
			System.out.println("´òÓ¡·½·¨......"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	public void mywait() {
		try {
//			synchronized (obj) {
				obj.wait();
//			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
}
