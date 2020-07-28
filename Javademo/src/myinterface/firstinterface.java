package myinterface;

public interface firstinterface {
	
	int a=1;
	
	
	public void print();
	
	
	public int add(int a,int b);
	
	default int multiply(int a,int b) {
		return a*b;
		
	}
	
	

}
