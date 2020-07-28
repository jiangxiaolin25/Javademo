package toolclass;

import java.util.concurrent.Callable;

public class Mycallable implements Callable<String> {
	int i;
	 public Mycallable(int i) {
		// TODO Auto-generated constructor stub
		 this.i=i;
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Mycallable1111"+String.valueOf(i));
		
		return "Mycallable1111"+String.valueOf(i);
	}

}
