package first;

import myinterface.firstinterface;

public class interfaceclass2 implements firstinterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.err.println("这是我第二个接口类实现接口");
		
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
