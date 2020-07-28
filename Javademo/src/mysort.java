import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class mysort {
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		int[] data=new int[]{11,85,45,3,9,45,78,54};
//		for (int i = 0; i < data.length; i++) {
//			System.out.println(data[i]);
//		}
//		
//		Arrays.sort(data);
//		
//		for (int i = 0; i < data.length; i++) {
//			System.out.println(data[i]);
//		}
		String Path="F:\\aaa.txt";
		Integer aInteger=name(Path);
		System.out.println(aInteger);
	
	

	}
	
	public static Integer name(String filePath) throws Exception {
		// 读取文件
		List<Integer> list = new ArrayList<Integer>();
		File file = new File(filePath);
		// 判断文件是否存在
		if (file.isFile() && file.exists()) {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file));
			BufferedReader bufferedReader = new BufferedReader(read);
			String lineTxt = null;
			while ((lineTxt = bufferedReader.readLine()) != null) {
				list.add(Integer.parseInt(lineTxt));
			}
			read.close();
		}
		// 测试打印
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 排序
		for (int i = 0; i < 10; i++) {
			boolean flg = false;
			for (int j = 0; j < list.size() - i - 1; j++) {
				if (list.get(j) > list.get(j + 1)) {
					Integer aInteger = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, aInteger);
					flg = true;
				}
				if (flg = false) {// 每趟进行判断看是否进行了交换，如果没交换没说明已经有序，直接退出！

				}
			}
		}
		// 测试打印
		System.out.println("..........................");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		return list.get(list.size() - 10);
	}
	
	 public static void bubbleSort(int []arr) {
		    for(int i=0;i<arr.length-1;i++) {
		        boolean flg = false;
		        for(int j=0;j<arr.length-1-i;j++) {
		            if(arr[j]>arr[j+1]) {
		                int tmp=arr[j];
		                arr[j]= arr[j+1];
		                arr[j+1] = tmp;
		                flg = true;//如果每趟都进行了交换，就flg=true
		            }
		        }
		        if(flg=false) {//每趟进行判断看是否进行了交换，如果没交换没说明已经有序，直接退出！
		            return;
		        }
		    }
		}

	
	

}
