import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/***
 * ��Ҫ�Ƿ�����ص�һЩ����
 * @author jiangxiaolin
 *������Щ�����⣬���п��Ի�ȡ��������������֣����η��Ȳ���
 */
public class reflecttool {
	
	
	
	
	/***
	 * ͨ�������ȡclass����
	 * @param o
	 * @return
	 */
	public Class getclass1(Object o) {
		Class class1=o.getClass();
		return class1;
		
	}
	/***
	 * ͨ����·����ȡ�����
	 * @param classpath  ��ʽ��.��ʽ����/��ʽ  ��Javamethedtool��������.reflectassert��������  ������Javamethedtool/reflectassert
	 * @return
	 */
	public Class getclass2(String classpath) {
		Class class1 = null;
		try {
			
				class1 = Class.forName(classpath);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("û���ҵ��࣬�ϸ�");
			e.printStackTrace();
		}
		return class1;
		
		
	}
	
	//����һ����Class clazz = Car.class;ֱ��ͨ��������ȡ
	/***
	 * ͨ����Ķ����ȡ�½�ʵ����ֻ�ܻ�ȡ�ղ����Ĺ��캯��
	 * 
	 
	 * @param c   ��Ķ���
	 * @return
	 */
	public Object getobject(Class c) {
		Object newInstance=null;
		try {
			newInstance= c.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newInstance;
	}
	
    /***
                 *  ͨ��getConstructor��ȡ���캯�����������в����Ĺ��캯��
	 * getDeclaredConstructor��ȡ����public�ĺͷ�public��
	 * getConstructor��ȡ��ֻ����public
     * @param c  ��Ķ���
     * @return   ��Ķ���
     */
	public Object getobjectconstruc(Class c ,int constructorarg) {
		Constructor constructor=null;
		Object newInstance=null;
		try {
			constructor = c.getConstructor(int.class);//int �����ں���ʹ��ʱ���ļ���
			try {
				 newInstance = constructor.newInstance(constructorarg);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newInstance;
		
		
		
	}
	
	
	
	
	
	
	/***
	 * ��ȡfieldnameָ����������  Ҫ���ȡ�������Եľ���ֵ����Ҫfield.get(mrReflectassert);mrReflectassert��ͨ��NEW �����İ���������Ķ���
	 * ��ʾ������������еĸ�field��ֵ
	 * @param c   ������ͣ� 
	 * @param fieldname  �����������
	 * @return
	 */
	public Field getfield1(Class c , String fieldname) {
		Field field = null;
		try {
			 field = c.getField(fieldname);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		return field;
		
	}
	/***
	 *ͨ�������޸�������Ե�ֵ
	 * @param c  ��������
	 * @param o  new �������
	 * @param fieldname  ���Ե�����
	 * @param value     ��Ҫ�޸����Ե�ֵ
	 */
	public void setfieldvalue(Class c ,Object o, String fieldname,String value) {
		Field field = null;
		Object object = null;
		try {
			field = c.getField(fieldname);
			field.setAccessible(true); //ȥ��˽��Ȩ�� ������˽�е�Ҳ���ȡ��
			field.set(o, value);
			object = field.get(o);//��ȡ�޸ĺ��ֵ
			System.out.println("���ú��ֵΪ"+object);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
		
	}
	/***
	 * ���ݷ��������ù�������������ȡ������ֵ
	 * @param c    ��������
	 * @param methonname   ��Ҫ���÷���������
	 * @param methodarg    ���÷�����Ҫ����Ĳ���������ʹ�ù������б仯������ı伴��
	 * @return  ���÷����󷵻ص�ֵ
	 */
	public Object methodinvoKe(Class c , String methonname,String methodarg) {
		Method method=null;
		Object invoke=null;
			 try {
				method = c.getMethod(methonname, String.class);
				method.setAccessible(true);
				invoke = method.invoke(c.newInstance(), methodarg);
				System.out.println("���÷������ص�ֵ"+invoke);
				
			} catch ( Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 return invoke;
			 
		
		
	}
	
	/***
	 * ���ݷ���������˽�з���������ȡ������ֵ
	 * @param c    ��������
	 * @param methonname   ��Ҫ���÷���������
	 * @param methodarg    ���÷�����Ҫ����Ĳ���������ʹ�ù������б仯������ı伴��
	 * @return  ���÷����󷵻ص�ֵ
	 */
	public Object demethodinvoKe(Class c , String methonname,String methodarg) {
		Method method=null;
		Object invoke=null;
		try {
			method = c.getDeclaredMethod(methonname, String.class);
			method.setAccessible(true);//��仰����Ҫ��
			invoke = method.invoke(c.newInstance(), methodarg);
			System.out.println("���÷������ص�ֵ"+invoke);
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return invoke;
		
		
		
	}
	
	
	

}
