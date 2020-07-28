package first;

public class Daemon extends Thread{
	
	public Daemon(Object lock) {
		super();
		this.lock = lock;
	}



	public Daemon() {
		// TODO Auto-generated constructor stub
	}



//	private Object lock=new Object();
	private Object lock;
	
	
	
	
	 boolean isrun=true;
	 int i=0;
	 
	 

	@Override
	public void run() {
//		synchronized (lock) {
			// TODO Auto-generated method stub
			System.out.println("Daemon....");
			
			
			//		
			while (i < 1000) {
//				 System.out.println("Daemon...." + i);
				if (Thread.currentThread().isInterrupted()) {
					 try {
						 System.out.println("ÖÕ¶Ë Daemon...." + i);
						throw new InterruptedException();
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("×ÓÏß³Ì");
						
					}
					
				}
				  try {
						Thread.currentThread().sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
		
//				
				i++;
//				System.out.println("Daemon...." + i);
			}
			
//		}
			System.out.println("Daemon...." + i);
	}

}
