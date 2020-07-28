package first;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import myinterface.firstinterface;
import tools.POIexcelwrite;




public class first {
	static DatagramSocket ds;
	
	 final static int udpPort = 8888;
	    final static String hostIp = "10.150.134.225";
//	    private static DatagramSocket socket = null;
	    private static DatagramPacket packetSend,packetRcv;
	    private boolean udpLife = true; //udp生命线程
	    private static byte[] msgRcv = new byte[1024]; //接收消息
	    
	    
	   
	

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		System.out.println("最新的eclipse");
////		POIexcelwrite mIexcelwrite=new POIexcelwrite();
////		try {
////			mIexcelwrite.creatdowneexcel();
////		} catch (IOException e) {
////			// TODO Auto-generated catch block 
////			e.printStackTrace();
////		}
//		 try {
//			ds = new DatagramSocket();
//		} catch (SocketException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		
//			new Thread(new Runnable() {
//				public void run() {
//					try {
//						UDPclient();
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				}
//			}).start();
//			
//		
//
//		System.out.println(Math.floor(1.6));
//		System.out.println(Math.ceil(1.4));
//		System.out.println(Math.round(1.5));
		
//		    Thread t1 = new Thread(new MyThread());
////	        Thread t2 = new Thread(new MyThread());
//	        t1.start();
//	        t1.interrupt();
//	        System.out.println("1"+t1.isInterrupted());
//	        System.out.println("2"+t1.isInterrupted());
//	        System.out.println("3"+t1.interrupted());
//	        t2.start();
//	        t2.interrupt();
		
		//线程的暂停和开始测试
//		  MyThread my = new MyThread();
////	        Thread thread = new Thread(my);
//		  my.start();
//
//	        try {
//	            Thread.sleep(1000);
//	            my.pauseThread();
//	            Thread.sleep(5000);
//	            my.resumeThread();
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
		
		
		//线程的方法测试
//		Object lock=new Object();
////		Daemon2 daemon2 = new Daemon2();
////		Daemon2 daemon3 = new Daemon2();
////	    Thread daemon2th=new Thread(daemon2,"da");
////	    Thread mThread2=new Thread(daemon3,"da2");
//		Daemon daemon = new Daemon();
////		daemon.setDaemon(true);
//		
//	  
//
////	    mThread2.start();
////		daemon2th.start();
//		daemon.start();
//		
//	
//		daemon.interrupt();
		
//		try {
//			daemon.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
		
		
		
		//线程里面的方法
//		try {
////			daemon.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		daemon.yield();
		
	
//		daemon.isrun=false;
//	    System.out.println("主线程开始 ");
//		for (int i = 0; i < 1000; i++) {
//			  System.out.println(Thread.currentThread().getName() + " " + i);
////			  if (i==999) {
////				  daemon2th.interrupt();
////				  System.out.println("i==999");
////				  
////				
////			}
//			
//		}
//        System.out.println("主线程结束");
		//阶乘数据
//		int s=digui(5);
//		System.out.println("值为："+s);
		
//		线程休眠
//		ReentrantLock mLock=new ReentrantLock(true);
//		ReentrantLock mLock2=new ReentrantLock(true);
//		
//		
//		try {
//			Reenlock123 reenlock111 = new Reenlock123(mLock);
//			Thread.sleep(30);
//			Reenlock123 reenlock222 = new Reenlock123(mLock2);
//			Thread.sleep(30);
//			Reenlock123 reenlock333 = new Reenlock123(mLock);
//			Thread.sleep(30);
//			Reenlock123 reenlock888 = new Reenlock123(mLock);
//			Thread.sleep(30);
//			Reenlock123 reenlock999 = new Reenlock123(mLock);
//			
//			reenlock111.start();
//			reenlock222.start();
//			reenlock333.start();
//			reenlock888.start();
//			reenlock999.start();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//
		//线程池周期性运行
//		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
//		   scheduler.scheduleAtFixedRate(new Runnable() {
//	            @Override
//	            public void run() {
//	                System.out.println("Start: scheduleAtFixedRate:    " + new Date());
//	                try {
//	                    Thread.sleep(15000);
//	                } catch (InterruptedException e) {
//	                    e.printStackTrace();
//	                }
//	                System.out.println("End  : scheduleAtFixedRate:    " + new Date());
//	            }
//	        }, 0, 10 , TimeUnit.MILLISECONDS);
		
//	    
		//接口相关的测试
//		interfaceclass name1 = new interfaceclass();
//		interfaceclass2 name2 = new interfaceclass2();
//		name1.print();
//		name2.print();
//		int add = name1.add(9, 5);
//		System.out.println(add);
//		int add2 = name2.add(9, 5);
//		System.out.println(add2);
//		System.out.println(name1.multiply(6, 5));
//		System.out.println(firstinterface.a);
		
		//接口回调
		testcallback testcallback = new testcallback();
		callbacktool name = new callbacktool(testcallback);
		name.name();
		
	
		
		
		
		
		
		
		
		
		
		

	}
	
	public static int digui(int n)
	{
	if(n==1)
	{
	return 1;
	}else
	{
	return n*digui(n-1);
	}
	}
//	public static int digui2(int n)
//	{
//		for (int i = 1; i <n+1; i++) {
//			int toatl=i*(i+1);
//			
//			
//		}
//	}

	

	
	public static void UDPclient() throws IOException {
		//发送数据
		send("Helloween services i am client");
		//接收数据
		recives();
		
}
	
	public static String send(String msgSend){
        InetAddress hostAddress = null;
        System.out.println("client star send");

        try {
            hostAddress = InetAddress.getByName(hostIp);
        } catch (UnknownHostException e) {
//            Log.i("udpClient","未找到服务器");
            e.printStackTrace();
        }

/*        try {
            socket = new DatagramSocket();
        } catch (SocketException e) {
            Log.i("udpClient","建立发送数据报失败");
            e.printStackTrace();
        }*/

         packetSend = new DatagramPacket(msgSend.getBytes() , msgSend.getBytes().length,hostAddress,udpPort);

        try {
            ds.send(packetSend);
        } catch (IOException e) {
            e.printStackTrace();
//            Log.i("udpClient","发送失败");
        }
     //   socket.close();
        return msgSend;
    }
	
	//接收
	public static void recives() {
		packetRcv = new DatagramPacket(msgRcv,msgRcv.length);
        while (true){
           
//              
                try {
					ds.receive(packetRcv);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                String RcvMsg = new String(packetRcv.getData(),packetRcv.getOffset(),packetRcv.getLength());
                //将收到的消息发给主界面
               
                   System.out.println("客户端收到的数据为："+RcvMsg);
//                Log.i("Rcv",RcvMsg);
        }
         
		
	}
	
	
	  public static String byteArray2HexString(byte[] var0) {
	        if(var0 != null && var0.length != 0) {
	            StringBuilder var1 = new StringBuilder();
	            byte[] var2 = var0;
	            int var3 = var0.length;

	            for(int var4 = 0; var4 < var3; ++var4) {
	                byte var5 = var2[var4];
	                String var6 = Integer.toHexString(255 & var5);
	                if(var6.length() < 2) {
	                    var6 = "0" + var6;
	                }

	                var1.append(var6);
	            }

	            return var1.toString();
	        } else {
	            return "";
	        }
	    }
	  

}
//
//class MyThread extends Thread {
//
//    @Override
//    public void run() {
//
//        
//        System.out.println("4"+currentThread().getName()+interrupted());
//        try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        System.out.println("5"+currentThread().getName()+isInterrupted());
//
//    }
//}
