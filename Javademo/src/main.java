import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

import toolclass.Mycallable;
import toolclass.myexecutorthread;
import toolclass.myexecutorthread2;
import toolclass.myexecutorthread3;
import tools.POIexcelwrite;




public class main {
	private static int[] int1= {1,2,5,6};
	private static ExecutorService newFixedThreadPool;
	static XSSFWorkbook workbook=new XSSFWorkbook();
	static String path="f:\\hello2.xlsx";
    private static final int BUFFER = 512;
    static Ziptool myZipUtil;
    static reflectassert mrReflectassert;
    static reflecttool mrReflecttool;
    static DatagramSocket ds;
    private static DatagramPacket dpSend;
	private static DatagramPacket  dpre;
    
    /**压缩得到的文件的后缀名*/
    private static final String SUFFIX=".zip";
   
	public static void main(String[] args) throws InterruptedException {

//		try {
			
			/***
			 * 反射相关的学习和总结
			 */
//			mrReflectassert=new reflectassert();
//			mrReflecttool=new reflecttool();
//			
//			Class getclass1 = mrReflecttool.getclass1(mrReflectassert);
//			Class getclass2 = mrReflecttool.getclass2("reflectassert");
////			Class class1 = Class.forName("Javamethedtool.reflectassert");
//			System.out.println(getclass1+"......"+"......"+getclass2);
//			
//			Field getfield1 = mrReflecttool.getfield1(getclass1, "two");
////			getfield1.set(mrReflectassert, 456);
////			int object = (int)getfield1.get(mrReflectassert);
//			
////			System.out.println(object);
//			mrReflecttool.setfieldvalue(getclass1, mrReflectassert, "two", "77999");
//			
//			String object2 = (String)getfield1.get(mrReflectassert);
//			
//			System.out.println(object2);
//			String methodinvoKe = (String)mrReflecttool.demethodinvoKe(getclass1, "threemeth", "22222");
//			System.out.println(methodinvoKe);
//			
//			reflectassert getobjectconstruc =(reflectassert) mrReflecttool.getobjectconstruc(getclass1,456);
//			System.out.println(getobjectconstruc.four);
//			
			
			
			
			
			//线程池学习和总结
//			try {
//				myexecutorservice1();
////				myexecutorservice2();
////				myexecutorservice3();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
//			Mchannel();
//			buffer();
//			socketservice();
//			POIexcelwrite name = new POIexcelwrite();
			
//			name.testExcel2007Write(workbook);
//			name.creatdowneexcel(workbook);
//			writeExcel3(path,0+"","SM4秘钥测试","失败");
//			TestMethod2();
//			channelread("D:/b.txt");
//			doCopy("E:/123.txt", "D:/b.txt");
//			channeldowrite("D:/a.txt","uaguiudgdudhjdiagydbdhdabhudgdjgdudbd");
//			myZipUtil=new Ziptool();
//			String spath="F:\\aaa\\bbb\\111111.txt";
//			String tpath="F:\\aaa\\bbb\\bbb.zip";
//			File[] srcFiles = { new File("F:\\aaa\\bbb\\123.txt"), new File("F:\\aaa\\bbb\\4546.txt"), new File("F:\\aaa\\bbb\\111111.txt") };
//			File mFile=new File(path);
//			String name=mFile.getName();
//			System.out.println(name);
//			zipDirectory(tpath, spath);
//			zip(spath, tpath);
//			zipfile(spath, tpath);
//			zipFiles(srcFiles, tpath);
//			char a[] = {'s','t','u','d','e','n','t'};
//			String s = new String(a, 2, 4);
//			System.out.println(s);
//			long a = 0;
//			for (int i = 0; i < 14; i++) {
//				 a+=(long) Math.pow(2,i) ;
//				
//			}
//			System.out.println(a);
//			process();
//			String command="ping www.baidu.com -t";
//	        testProcessBuilder(command);
//		arraydemo reflectassert=new arraydemo();
//			annotation(reflectassert);
		try {
			 ds = new DatagramSocket(8888);
		} catch (SocketException e1) {
			// TODO Auto-generated catch block
			
			e1.printStackTrace();
		}


			
			
			
			
			 new Thread(new Runnable() {
				public void run() {
					//		} catch (Exception e) {
					//			// TODO Auto-generated catch block
					//			e.printStackTrace();
					//		}
					try {
						while (true) {
							UDPservese();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}).start();


	}
	public static void UDPservese() throws IOException {
		System.out.println("开始服务器......");
		 
	        //接收数据
	        byte[] bys = new byte[1024];
	        dpre = new DatagramPacket(bys, bys.length);
	        System.out.println("接受前");
//	        System.out.println("客户端地址是："+ds.getRemoteSocketAddress().toString());
	        ds.receive(dpre);
	        System.out.println("接收后");
	        //解析数据
	        //InetAddress getAddress()
	        InetAddress address = dpre.getAddress();
	        //byte[] getData
	        byte[] data = dpre.getData();
	        int length = dpre.getLength();
	        //输出数据
	        System.out.println("sender ----"+address.getHostAddress());
	        System.out.println(new String(data));
	        
	        
	        serviceSend("辛苦了客户端");
	        
	        
	        
//		
	}

	
	
	//服务器发送信息
	 public static void serviceSend(String sendStr) throws IOException {
		 System.out.println("客户端IP："+ dpre.getAddress().getHostAddress() +"客户端Port:"+ dpre.getPort());
	    
	        dpSend = new DatagramPacket(sendStr.getBytes(),sendStr.getBytes().length,dpre.getAddress(),dpre.getPort());
	        ds.send(dpSend);
	    }
	
	   public static byte[] hexString2ByteArray(String var0) {
	        if(var0 != null && !var0.equals("")) {
	            if(var0.length() % 2 != 0) {
	                var0 = var0 + "0";
	            }

	            byte[] var1 = new byte[var0.length() / 2];

	            for(int var2 = 0; var2 < var0.length() / 2; ++var2) {
	                char var3 = var0.charAt(2 * var2);
	                char var4 = var0.charAt(2 * var2 + 1);
	                byte var5 = hexChar2Byte(var3);
	                byte var6 = hexChar2Byte(var4);
	                if(var5 < 0 || var6 < 0) {
	                    return null;
	                }

	                int var7 = var5 << 4;
	                var1[var2] = (byte)(var7 + var6);
	            }

	            return var1;
	        } else {
	            return null;
	        }
	    }
	   
	   public static byte hexChar2Byte(char var0) {
	        return var0 >= 48 && var0 <= 57?(byte)(var0 - 48):(var0 >= 97 && var0 <= 102?(byte)(var0 - 97 + 10):(var0 >= 65 && var0 <= 70?(byte)(var0 - 65 + 10):-1));
	    }
	
	
/***
 * 获取一个方法上的
 * @param oArraydemo   添加了自定义注解定义的方法所在的类里面的对象，具体情况具体分析
 * 备注：尽量把自定义定义在同一个类里面
 */
	private static void annotation(main oArraydemo ) {
		try {
//			arraydemo reflectassert=new arraydemo();
		    //获取Student的Class对象
		    Class stuClass = oArraydemo.getClass();

		    //说明一下，这里形参不能写成Integer.class，应写为int.class
		    Method stuMethod = stuClass.getMethod("study",int.class);

		    if(stuMethod.isAnnotationPresent((Class<? extends Annotation>) CherryAnnotation.class)){
		        System.out.println("Student类上配置了CherryAnnotation注解！");
		        //获取该元素上指定类型的注解
		        CherryAnnotation cherryAnnotation = stuMethod.getAnnotation(CherryAnnotation.class);
		       
		        System.out.println("name: " + cherryAnnotation.name() + ", age: " + cherryAnnotation.age()
		            + ", score: " + cherryAnnotation.score()[0]);
		    }else{
		        System.out.println("Student类上没有配置CherryAnnotation注解！");
		    }
		} catch (NoSuchMethodException e) {
		    e.printStackTrace();
		}
	}
	
	   @CherryAnnotation(name = "cherry-peng",age = 23,score = {99,66,77})
//		@CherryAnnotation(name = "", score = { 0 })
		
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
	
	private static void process() {
		 List<String> command = new ArrayList<String>();
	        command.add("/bin/echo");
	        command.add("'aa'");
	        command.add(">");
	        command.add("F:/b.txt");
	        try {
	            ProcessBuilder builder = new ProcessBuilder(command);
	            builder.command(command);
	            Process p = builder.start();
	            if(p.isAlive()){
	                // waitfor()等待的是子进程的退出
	                p.waitFor();
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	
	/***
	 * 返回运行命令后的值
	 * @param command  在CMD的命令里面都能运行的指令
	 */
	public static void testProcessBuilder(String command){
        boolean err =false;
        try {
            //初始化ProcessBuilder对象
            Process p=new ProcessBuilder(command.split(" ")).start();
            //用于存储执行命令的结果
            BufferedReader results=new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s;
            while((s=results.readLine())!=null){
                System.out.println(s);
            }
            //用于存储执行命令的错误信息
            BufferedReader errors=new BufferedReader(new InputStreamReader(p.getErrorStream()));
            while((s=errors.readLine())!=null){
                System.err.println(s);
                err=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(err){
            throw new RuntimeException("Error executing "+command);
        }
    }

		
	
	
		/***
		 * 压缩文件
		 * @param inputDir     
		 * @param outputZipFile
		 */
		 public static void zipDirectory(String suocezippath,String targetpath) {
			 File inputDir=new File(suocezippath);
			 File outputZipFile=new File(targetpath);
			 
		        // Create parent directory for the output file.
		        outputZipFile.getParentFile().mkdirs();
		        
		 
		        String inputDirPath = inputDir.getAbsolutePath();
		        System.out.println(inputDirPath);
		        byte[] buffer = new byte[1024];
		 
		        FileOutputStream fileOs = null;
		        ZipOutputStream zipOs = null;
		        try {
		 
		            List<File> allFiles = listChildFiles(inputDir);
		 
		            // Create ZipOutputStream object to write to the zip file
		            fileOs = new FileOutputStream(outputZipFile);
		            //
		            zipOs = new ZipOutputStream(fileOs, Charset.forName("GBK"));
		            for (File file : allFiles) {
		                String filePath = file.getAbsolutePath();
		 
		                System.out.println("Zipping " + filePath);
		                // entryName: là một đường dẫn tương đối.
		                String entryName = filePath.substring(inputDirPath.length() + 1);
		 
		                ZipEntry ze = new ZipEntry(entryName);
		                // Put new entry into zip file.
		                zipOs.putNextEntry(ze);
		                // Read the file and write to ZipOutputStream.
		                FileInputStream fileIs = new FileInputStream(filePath);
		 
		                int len;
		                while ((len = fileIs.read(buffer)) > 0) {
		                    zipOs.write(buffer, 0, len);
		                }
		                fileIs.close();
		            }
		        } catch (IOException e) {
		            e.printStackTrace();
		        } finally {
		            closeQuite(zipOs);
		            closeQuite(fileOs);
		        }
		 
		    }
		 
		 
		 public static void zipFiles(File[] srcFiles, String zippath) {
			 File zipFile=new File(zippath);
		        // 判断压缩后的文件存在不，不存在则创建
		        if (!zipFile.exists()) {
		            try {
		                zipFile.createNewFile();
		            } catch (IOException e) {
		                e.printStackTrace();
		            }
		        }
		        // 创建 FileOutputStream 对象
		        FileOutputStream fileOutputStream = null;
		        // 创建 ZipOutputStream
		        ZipOutputStream zipOutputStream = null;
		        // 创建 FileInputStream 对象
		        FileInputStream fileInputStream = null;

		        try {
		            // 实例化 FileOutputStream 对象
		            fileOutputStream = new FileOutputStream(zipFile);
		            // 实例化 ZipOutputStream 对象
		            zipOutputStream = new ZipOutputStream(fileOutputStream);
		            // 创建 ZipEntry 对象
		            ZipEntry zipEntry = null;
		            // 遍历源文件数组
		            for (int i = 0; i < srcFiles.length; i++) {
		                // 将源文件数组中的当前文件读入 FileInputStream 流中
		                fileInputStream = new FileInputStream(srcFiles[i]);
		                // 实例化 ZipEntry 对象，源文件数组中的当前文件
		                zipEntry = new ZipEntry(srcFiles[i].getName());
		                zipOutputStream.putNextEntry(zipEntry);
		                // 该变量记录每次真正读的字节个数
		                int len;
		                // 定义每次读取的字节数组
		                byte[] buffer = new byte[1024];
		                while ((len = fileInputStream.read(buffer)) > 0) {
		                    zipOutputStream.write(buffer, 0, len);
		                }
		            }
		            zipOutputStream.closeEntry();
		            zipOutputStream.close();
		            fileInputStream.close();
		            fileOutputStream.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }

		    }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		    private static void closeQuite(OutputStream out) {
		        try {
		            out.close();
		        } catch (Exception e) {
		        }
		    }
		 
		    // This method returns the list of files,
		    // including the children, grandchildren files of the input folder.
		    private static List<File> listChildFiles(File dir) throws IOException {
		        List<File> allFiles = new ArrayList<File>();
		 
		        File[] childFiles = dir.listFiles();
		        for (File file : childFiles) {
		            if (file.isFile()) {
		                allFiles.add(file);
		            } else {
		                List<File> files = listChildFiles(file);
		                allFiles.addAll(files);
		            }
		        }
		        return allFiles;
		    }
	
		
	
	
	
	
	/***
	 * 解压程序
	 */
	public static void zip(String suocezippath,String targetpath  ) {
		 final String OUTPUT_FOLDER=targetpath;
	        String FILE_PATH=suocezippath+".zip";
	 
	        // 判断文件夹是否存在
	        File folder = new File(OUTPUT_FOLDER);
	        if(!folder.exists()){
	            folder.mkdir();
	        }
	 
	        // 创建buffer
	        byte[] buffer = new byte[1024];
	        ZipInputStream zipls = null;
	 
	        try {
	            zipls = new ZipInputStream(new FileInputStream(FILE_PATH), Charset.forName("GBK"));
	            ZipEntry entry = null;
	            while ((entry=zipls.getNextEntry())!=null){
	            	System.out.println("entry=zipls.getNextEntry())");
	                String entryName = entry.getName();
	                String outFileName = OUTPUT_FOLDER + File.separator + entryName;
	                System.out.println("Unzip: " + outFileName);
	 
	                if(entry.isDirectory()){
	                    new File(outFileName).mkdirs();
	                }else{
	                    FileOutputStream fos = new FileOutputStream(outFileName);
	                    int len;
	                    while ((len = zipls.read(buffer))>0){
	                    	System.out.println("zipls.read");
	                    	
	                        fos.write(buffer,0,len);
	                    }
	                    fos.close();
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                zipls.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }


	}
	
	public static void zip2(String zipFileName,String destPath) {
		 try {
			 
	            zipFileName=zipFileName+SUFFIX;
	            ZipInputStream zis=new ZipInputStream(new FileInputStream(zipFileName),Charset.forName("GBK"));
	            ZipEntry       zipEntry       = null;
	            byte[]         buffer         = new byte[BUFFER];//缓冲器
	            int            readLength     = 0;//每次读出来的长度
	            while ((zipEntry=zis.getNextEntry())!=null){
	                if(zipEntry.isDirectory()){//若是目录
	                    File file=new File(destPath+"/"+zipEntry.getName());
	                    if(!file.exists()){
	                        file.mkdirs();
	                        System.out.println("mkdirs:"+file.getCanonicalPath());
	                        continue;
	                    }
	                }//若是文件
	                    File file = createFile(destPath,zipEntry.getName());
	                    System.out.println("file created: " + file.getCanonicalPath());
	                    OutputStream os=new FileOutputStream(file);
	                    while ((readLength=zis.read(buffer,0,BUFFER))!=-1){
	                        os.write(buffer,0,readLength);
	                    }
	                os.close();
	                System.out.println("file uncompressed: " + file.getCanonicalPath());
	            }
	 
	 
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    

		
	}
	
	  /**
     *@param destPath 解压目标路径
     *@param fileName 解压文件的相对路径
     * */
    public static File createFile(String destPath, String fileName){
 
        String[] dirs = fileName.split("/");//将文件名的各级目录分解
        File file = new File(destPath);
 
        if (dirs.length > 1) {//文件有上级目录
            for (int i = 0; i < dirs.length - 1; i++) {
                file = new File(file, dirs[i]);//依次创建文件对象知道文件的上一级目录
            }
 
            if (!file.exists()) {
                file.mkdirs();//文件对应目录若不存在，则创建
                try {
                    System.out.println("mkdirs: " + file.getCanonicalPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
 
            file = new File(file, dirs[dirs.length - 1]);//创建文件
 
            return file;
        } else {
            if (!file.exists()) {//若目标路径的目录不存在，则创建
                file.mkdirs();
                try {
                    System.out.println("mkdirs: " + file.getCanonicalPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
 
            file = new File(file, dirs[0]);//创建文件
 
            return file;
        }
 
    }

	
	public static void channeldowrite(String filepath , String writecontent) throws Exception {
	    // TODO 自动生成的方法存根
	    long starttime = System.currentTimeMillis();
	    try {
	      FileOutputStream f1 = new FileOutputStream(filepath);
	      FileChannel fc1 = f1.getChannel();
	      ByteBuffer buffer = ByteBuffer.wrap(writecontent.getBytes());
	      fc1.write(buffer);
	     
	      fc1.close();
	      f1.close();
	    } catch (FileNotFoundException e) {
	      // TODO 自动生成的 catch 块
	      throw new Exception(e.toString());
	    } catch (IOException e) {
	      // TODO: handle exception
	      throw new Exception(e.toString());
	    }
	    long endtime = System.currentTimeMillis();
	    System.out.println("Channel策略写文件花费了：" + (endtime - starttime) + "ms");
	  }

	
	
	  public static void doCopy(String starpath, String edngpath) throws IOException {
	        RandomAccessFile aFile = new RandomAccessFile(starpath, "rw");
	        FileChannel inChannel = aFile.getChannel();
	        RandomAccessFile bFile = new RandomAccessFile(edngpath, "rw");
	        FileChannel outChannel = bFile.getChannel();
	        inChannel.transferTo(0, inChannel.size(), outChannel);
	        System.out.println("Copy over");
	        inChannel.close();
	        outChannel.close();
	        aFile.close();
	        bFile.close();

	    }
	
	public static void channelread(String path) throws Exception {
		RandomAccessFile aFile = new RandomAccessFile(path, "rw");
        FileChannel inChannel = aFile.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(50);
        int bytesRead = inChannel.read(buf);

        while (bytesRead != -1){
            System.out.println("Read " + bytesRead);
            //flip()之后，读/写指针position指到缓冲区头部，并且设置了最多只能读出之前写入的数据长度
            buf.flip();
            //返回剩余的可用长度
            while(buf.hasRemaining()){
                System.out.print("可用长度"+(char) buf.get());
//                inChannel.write(src);
                
            }
            //读入channel中的数据
            buf.clear();
            bytesRead = inChannel.read(buf);
        }
        aFile.close();

		
	}
	
	
	//测试read()方法
	     public static void TestMethod1() throws Exception{
	         
	         File file1 = new File("E:/123.txt"); //创建一个File类的对象
	         FileInputStream fis = new FileInputStream(file1); //创建一个FileInputStream类对象，用来操作文件对象file1
	         
	         //read()方法：读取文件的一个字节，当执行到文件内容末尾时返回-1
	         int a;
	         while( (a=fis.read()) != -1 ) {
	             System.out.print( a +","); //将数字转换为对应的字符
	         }
	         System.out.println();
	         
	         //close()方法：关闭相应的流
	         fis.close();
	     }
	     
	     //测试read(byte[] b)方法
	          public static void TestMethod2() throws Exception{
	              
	              File file1 = new File("E:/123.txt");
	              FileInputStream fis = new FileInputStream(file1);
	              
	              byte[] arr = new byte[5]; //用来存入从read(byte[] b)方法获取的文件内容
	              int len; //用来存储read(byte[] b)方法的返回值，代表每次读入的字节个数；当因为到达文件末尾而没有字节读入时，返回-1
	              while( (len=fis.read(arr)) != -1 ) {
	            	 
	                  for( int i=0; i<len; ++i ) 
	                      System.out.print(arr[i]);
	                      System.out.println("长度"+len);
	             }
	              System.out.println();
	              
	              fis.close();
	          }
	     
	     
	//executorservice1
	public static void myexecutorservice1() throws InterruptedException, ExecutionException {
		newFixedThreadPool = Executors.newFixedThreadPool(5);
		List<Future<String>> futures=new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++) {
			Future<String> submit = newFixedThreadPool.submit(new Mycallable(i));
			Future<String> submit2 = (Future<String>) newFixedThreadPool.submit( new myexecutorthread(i));
			
//			newFixedThreadPool.execute(new myexecutorthread(i));
//			Thread.sleep(1000);
			
			futures.add(submit);
		}
//		for (Future<String> future : futures) {
//			//future.get())获取的是call方法返回的值
//			System.out.println("future.get = " + future.get());
//		}
	}
	//executorservice2
	public static void myexecutorservice2() throws InterruptedException {
		newFixedThreadPool = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 3; i++) {
			newFixedThreadPool.execute(new myexecutorthread2(i));
//			Thread.sleep(1000);
			
		}
	}
	//executorservice3
	public static void myexecutorservice3() throws InterruptedException {
		ScheduledExecutorService cachedThreadPool = Executors.newScheduledThreadPool(10);
//		for (int i = 0; i < 10; i++) {
		//具体执行时间是已实际代码运行为准，休眠设置的时间是指运行完成后休眠的时间
			 cachedThreadPool.scheduleWithFixedDelay(new myexecutorthread3(), 0,5,TimeUnit.SECONDS);
//			 cachedThreadPool.schedule(new myexecutorthread(i), 5000,TimeUnit.MILLISECONDS);
			Thread.sleep(1000);
			
//		}
	}
	
	
	
	
	public static void Mchannel() {
		String path="F:\\a.txt";
		String path1="F:\\b.txt";
		try {
			RandomAccessFile rAccessFile=new RandomAccessFile(path, "rw");
			RandomAccessFile wAccessFile=new RandomAccessFile(path1, "rw");
//			FileChannel channel = rAccessFile.getChannel();
//			System.out.println(""+channel);
			rAccessFile.seek(3);
			wAccessFile.seek(3);
			byte[] mbyte=new byte[1024];
			int len=0;
			while ((len=rAccessFile.read(mbyte))!=-1) {
				wAccessFile.write(mbyte, 0, len);
				wAccessFile.close();
				rAccessFile.close();
				System.out.println("测试已完成");
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	private static void buffer() {
		// TODO Auto-generated method stub
		System.out.println("bafor"+Runtime.getRuntime().freeMemory());
		ByteBuffer mBuffer=ByteBuffer.allocate(10240000);
		System.out.println("bafor"+Runtime.getRuntime().freeMemory());
//        mBuffer.clear();
        System.out.println("bafor"+Runtime.getRuntime().freeMemory());
	}

	private static void printarray() {
		for (int i = 0; i < int1.length; i++) {
			System.out.println(int1[i]);
			
		}
	}
	
	
	public static void socketservice() throws Exception {

        //1.创建一个服务器端Socket，即ServerSocket，指定绑定的端口，并监听此端口
        ServerSocket serverSocket = new ServerSocket(12345);
        InetAddress address = InetAddress.getLocalHost();
        String ip = address.getHostAddress();
        Socket socket = null;
        //2.调用accept()等待客户端连接
        System.out.println("~~~服务端已就绪，等待客户端接入~，服务端ip地址: " + ip);
        socket = serverSocket.accept();
        //3.连接后获取输入流，读取客户端信息
        InputStream is=null;
        InputStreamReader isr=null;
        BufferedReader br=null;
        OutputStream os=null;
        PrintWriter pw=null;
        is = socket.getInputStream();     //获取输入流
        isr = new InputStreamReader(is,"UTF-8");
        br = new BufferedReader(isr);
        String info = null;
        while((info=br.readLine())!=null){//循环读取客户端的信息
            System.out.println("客户端发送过来的信息" + info);
        }
        socket.shutdownInput();//关闭输入流
        socket.close();
		
	}
	public static void excelread() throws Exception {
		
		FileInputStream fileInputStream=new FileInputStream("f:\\hello2.xlsx");  //获取d://test.xls,建立数据的输入通道
        System.out.println(fileInputStream);
        POIFSFileSystem poifsFileSystem=new POIFSFileSystem(fileInputStream);  //使用POI提供的方法得到excel的信息
        System.out.println("excel-1的信息:"+poifsFileSystem);
        Workbook Workbook= WorkbookFactory.create(fileInputStream);//得到文档对象
        System.out.println("excel-2的信息:"+Workbook);
        org.apache.poi.ss.usermodel.Sheet sheet=Workbook.getSheet("第一个文件123");  //根据name获取sheet表
        System.out.println("excel-3的信息："+sheet);
 
        Row row=sheet.getRow(0);  //获取第一行
        System.out.println(sheet.getLastRowNum()+" "+row.getLastCellNum());  //分别得到最后一行的行号，和一条记录的最后一个单元格
 
        FileOutputStream out=new FileOutputStream("f:\\hello2.xlsx");  //向d://test.xls中写数据
        row=sheet.createRow((short)(sheet.getLastRowNum()-4)); //对总行数减4，就是倒数行数加数据
        row.createCell(0).setCellValue("11111"); //设置第一个（从0开始）单元格的数据
        row.createCell(5).setCellValue(11111); 
 
        out.flush();
        Workbook.write(out);
        out.close();
        System.out.println(row.getPhysicalNumberOfCells()+" "+row.getLastCellNum());
	}
	
	//修改excel表格，path为excel修改前路径（D:\\test.xlsx）
	public static void writeExcel3(String path, String testcount, String testname, String result) {
		try {
			// 传入的文件
	      FileInputStream fileInput = new FileInputStream(path);
			// poi包下的类读取excel文件

			// 创建一个webbook，对应一个Excel文件
	      XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
			// 对应Excel文件中的sheet，0代表第一个
	      XSSFSheet sh = workbook.getSheetAt(0);

			// 修改excle表的第5行，从第三列开始的数据
//			for (int i = 0; i < 3; i++) {
//				FileInputStream fileInput = new FileInputStream(path);
//				// poi包下的类读取excel文件
//
//				// 创建一个webbook，对应一个Excel文件
//				XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
//				// 对应Excel文件中的sheet，0代表第一个
//				XSSFSheet sh = workbook.getSheetAt(0);
//				FileOutputStream os = new FileOutputStream(path);
//
//				int lastRowNum = sh.getLastRowNum();
//				switch (i) {
//				case 0:
//					XSSFCell createCell1 = sh.createRow(lastRowNum + 1).createCell(0);
//					createCell1.setCellValue(testcount);
//					System.out.println("最后一行" + lastRowNum + i);
//
//					// FileOutputStream os = new
//					// FileOutputStream("D:\\test.xlsx");//此路径也可写修改前的路径，相当于在原来excel文档上修改
//					os.flush();
//					// 将Excel写出
//					workbook.write(os);
//					// 关闭流
//					fileInput.close();
//					break;
//				case 1:
//					XSSFCell createCel2 = sh.createRow(lastRowNum ).createCell(1);
//					createCel2.setCellValue(testname);
//					System.out.println("最后一行" + lastRowNum + i);
//					// FileOutputStream os = new
//					// FileOutputStream("D:\\test.xlsx");//此路径也可写修改前的路径，相当于在原来excel文档上修改
//					os.flush();
//					// 将Excel写出
//					workbook.write(os);
//					// 关闭流
//					fileInput.close();
//					break;
//				case 2:
//					XSSFCell createCel3 = sh.createRow(lastRowNum).createCell(2);
//					createCel3.setCellValue(result);
//					System.out.println("最后一行" + lastRowNum + i);
//					os.flush();
//					// 将Excel写出
//					workbook.write(os);
//					// 关闭流
//					fileInput.close();
//					break;
//				default:
//					break;
//				}
//			}
			int lastRowNum = sh.getLastRowNum();
//	      int lastRowNum1 = sh.getLastRowNum();
//	      int lastRowNum2 = sh.getLastRowNum();
			System.out.println("最后一行" + lastRowNum);

	      XSSFCell createCell1 = sh.createRow(lastRowNum+1).createCell(0);
	      XSSFCell createCel2 = sh.getRow(lastRowNum+1).createCell(1);
	      XSSFCell createCel3 = sh.getRow(lastRowNum+1).createCell(2);
	      createCell1.setCellValue(testcount);
	      createCel2.setCellValue(testname);
	      createCel3.setCellValue(result);
			// 将修改后的文件写出到D:\\excel目录下
			FileOutputStream os = new FileOutputStream(path);
			// FileOutputStream os = new
			// FileOutputStream("D:\\test.xlsx");//此路径也可写修改前的路径，相当于在原来excel文档上修改
			os.flush();
			// 将Excel写出
			workbook.write(os);
			// 关闭流
			fileInput.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	


}
