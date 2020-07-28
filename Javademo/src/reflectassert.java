import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;

public class reflectassert {
	


	private String one="one";
	public String two="two";
	public int three=3;
	int four;
	
	public reflectassert(int four) {
		// TODO Auto-generated constructor stub
		this.four=four;
	}
//	
	public reflectassert() {
		// TODO Auto-generated constructor stub
	}

	public int onemeth(int a) {
		
		System.err.println("onemeth"+a);
		return a+three;
		
		
	}
	public String twometh(String a) {
		
		System.err.println("twometh"+a);
		return a+two;
		
		
	}
	private String threemeth(String a) {
		
		System.err.println("twometh"+a);
		return a+two;
		
		
	}
    @CherryAnnotation(name = "cherry-peng",age = 23,score = {99,66,77})
//	@CherryAnnotation(name = "", score = { 0 })
	
    public void study(int times){
        for(int i = 0; i < times; i++){
            System.out.println("Good Good Study, Day Day Up!");
        }
    }

	
	@Retention(RetentionPolicy.RUNTIME)
	@Target(value = {ElementType.METHOD})
	@Documented
	public @interface CherryAnnotation {
	    String name();
	    int age() default 18;
	    int[] score();
	}


}
