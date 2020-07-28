import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class collectiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new TreeSet<String>();
		set.add("a");
		set.add("g");
		set.add("c");
		set.add("b");
		set.add("y");
		set.add("z");
		set.add("x");
//		set.add(null);
		set.add("l");
		HashSet set2=new HashSet<>();
		set.add("a");
		set.add("g");
		set.add("c");
		set.add("b");
//		set.add(null);
		set.add("y");
		set.add("z");
		set.add("x");
		set.add("l");
		
//		for (String string : set) {
//			System.out.println("set....."+string);
//		}
//		for (String string : set) {
//			System.out.println("set2....."+string);
//		}
		
		String aString="123456";
		String a="123";
		String b="456";
		String bString="123456";
		String cString="123"+"456";
		String dString=a+b;
		String dname = new String("123456");
		String ename = new String("123456");
		
		
		System.out.println(aString==dString.intern());
		System.out.println(aString==dString);
		System.out.println(aString==bString);
		System.out.println(aString==cString);
		System.out.println(aString==dname);
		System.out.println(ename==dname);
		System.out.println(aString.equals(bString));
		System.out.println(aString.equals(dname));
		System.out.println(ename.equals(dname));
		
		
		
		

	}

}
