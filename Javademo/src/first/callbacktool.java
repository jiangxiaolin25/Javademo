package first;

import myinterface.mytestcallback;

public class callbacktool {
	mytestcallback mytestcallback;
	
	public callbacktool(mytestcallback mytestcallback) {
		// TODO Auto-generated constructor stub
		this.mytestcallback=mytestcallback;
	
		
	}
	public void name() {
		for (int i = 0; i <100; i++) {
			System.out.println("��������..."+i);
			
		}
		mytestcallback.print();
		
		
	}
	

}
