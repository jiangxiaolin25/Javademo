package Javamethedtool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/***
 * 
 * @author jiangxiaolin
 *����ķ�����Ҫ������Javaд�ķ���
 */

public class Javatools {
	
    /***
     * 
     * @param path    д���·��
     * @param text    д����ı�
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
