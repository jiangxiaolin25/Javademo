package first;

public class Daemon2 implements Runnable{
	
	public Daemon2(Object lock) {
		super();
		this.lock = lock;
	}

	public Daemon2() {
		// TODO Auto-generated constructor stub
	}

	Object lock;

	@Override
	public void run() {
//		synchronized (lock) {
			// TODO Auto-generated method stub
			
			System.out.println("2222222");
			long currentTimeMillis = System.currentTimeMillis();
			for (int i = 0; i < 1000; i++) {
				
//				if (Thread.currentThread().isInterrupted()) {
					if (Thread.currentThread().getName().equalsIgnoreCase("da")) {
//						try {
//							Thread.currentThread().sleep(10000);
//						} catch (InterruptedException e) {
//							// TODO Auto-generated catch block
//							e.printStackTrace();
//							System.out.println("子线程中断了");
//						}

						System.out.println("Daemon2...." + i);
						//					
						//					if (i==500) {
						//					 return;
						//						
						//					}

					} else if (Thread.currentThread().getName().equalsIgnoreCase("da2")) {
						System.out.println("Daemon3...." + i);
						//					try {
						//						Thread.currentThread().wait();
						//					} catch (InterruptedException e) {
						//						// TODO Auto-generated catch block
						//						e.printStackTrace();
						//					}

					} 
//				}  
				
				

//			}
		}
			long currentTimeMillis2 = System.currentTimeMillis();
			System.out.println(currentTimeMillis2-currentTimeMillis);
			
		
	}

}
