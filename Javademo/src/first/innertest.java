package first;

public class innertest {
	
	public void test (innerclass p)
	  {
	      System.out.println(p.getName()+"--------"+p.getPrice());
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innertest innertest = new innertest();
		//��ʵ�������
		innertest.test(new innerclass()
				{
//һ���̳���innerclass�������ָ������ˣ�������innertest�������ڲ������Խ������ڲ��ࣻ
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




