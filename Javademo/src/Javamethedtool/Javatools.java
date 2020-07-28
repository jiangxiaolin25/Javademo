package Javamethedtool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/***
 * 
 * @author jiangxiaolin
 *这里的方法主要是用于Java写的方法
 */

public class Javatools {
	
    /***
     * 
     * @param path    写入的路径
     * @param text    写入的文本
     * @throws IOException
     */
	public void Javawritetext1(String path,String text) throws IOException {
		File file = new File(path);
		if (file.exists()) {
			file.delete();
			file.createNewFile();
		}
		BufferedWriter output = new BufferedWriter(new FileWriter(file, true));
		output.append(text + "\n");
		output.close();
	}
	
	

}
