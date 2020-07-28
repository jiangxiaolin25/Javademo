package first;

import java.util.concurrent.locks.ReentrantLock;

public class Reenlock123 extends Thread {
	
	
	public Reenlock123(ReentrantLock mLock) {
		super();
		this.mLock = mLock;
	}





	ReentrantLock mLock;
	
	
	public void print() {
		
		
			try {
				mLock.lock();
				for (int i = 0; i < 10; i++) {
				
					System.out.println(Thread.currentThread().getName()+"....."+i);
				Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("线程休眠了");
			}finally {
				mLock.unlock();
				System.out.println("锁被释放");
			}
			
		
		
		
	}
	
	
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		print();
		
		
	}
	

}
