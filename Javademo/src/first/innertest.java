package first;

public class innertest {
	
	public void test (innerclass p)
	  {
	      System.out.println(p.getName()+"--------"+p.getPrice());
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innertest innertest = new innertest();
		//其实这里就是
		innertest.test(new innerclass()
				{
//一个继承了innerclass的类名字给匿名了，而又在innertest这个类的内部，所以叫匿名内部类；
					@Override
					public double getPrice() {
						// TODO Auto-generated method stub
						return 8888;
					}

					@Override
					public String getName() {
						// TODO Auto-generated method stub
						return  "I can do it ";
					}
		});

	}

}

interface innerclass{
	public double getPrice();
	public String  getName();
	
}




