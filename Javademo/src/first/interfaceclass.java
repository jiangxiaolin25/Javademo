package first;

import myinterface.firstinterface;

public class interfaceclass implements firstinterface {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.err.println("�����ҵ�һ����̳еĽӿ�");
		
	}

	@Override
	public int add(int a,int b) {
		return a+b;
		// TODO Auto-generated method stub
		
	}
	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return (a+2)*b;
	}

}
