import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * java.util.zipѹ��/��ѹ�ļ�
 * */
public class Ziptool {
 
    /** ��������С */
    private static final int BUFFER = 1024;
 
    /**ѹ���õ����ļ��ĺ�׺��*/
    private static final String SUFFIX=".zip";
 
    /**
     * �õ�Դ�ļ�·���������ļ�
     * @param dirFile ѹ��Դ�ļ�·��
     * */
    public static List<File>  getAllFile(File dirFile){
 
        List<File> fileList=new ArrayList<>();
 
        File[] files= dirFile.listFiles();
        for(File file:files){//�ļ�
            if(file.isFile()){
                fileList.add(file);
                System.out.println("add file:"+file.getName());
            }else {//Ŀ¼
               if(file.listFiles().length!=0){//�ǿ�Ŀ¼
                  fileList.addAll(getAllFile(file));//�ѵݹ��ļ��ӵ�fileList��
               }else {//��Ŀ¼
                   fileList.add(file);
                   System.out.println("add empty dir:"+file.getName());
               }
            }
        }
        return fileList;
    }
 
    /**
     * ��ȡ���·��
     * @param dirPath Դ�ļ�·��
     * @param file ׼��ѹ���ĵ����ļ�
     * */
    public static String getRelativePath(String dirPath,File file){
        File dirFile=new File(dirPath);
        String relativePath=file.getName();
 
        while (true){
            file=file.getParentFile();
            if(file==null) break;
            if(file.equals(dirFile)){
                break;
            }
            else {
                relativePath=file.getName()+"/"+relativePath;
            }
        }
        return relativePath;
    }
 
 
 
    /**
     *@param destPath ��ѹĿ��·��
     *@param fileName ��ѹ�ļ������·��
     * */
    public static File createFile(String destPath, String fileName){
 
        String[] dirs = fileName.split("/");//���ļ����ĸ���Ŀ¼�ֽ�
        File file = new File(destPath);
 
        if (dirs.length > 1) {//�ļ����ϼ�Ŀ¼
            for (int i = 0; i < dirs.length - 1; i++) {
                file = new File(file, dirs[i]);//���δ����ļ�����֪���ļ�����һ��Ŀ¼
            }
 
            if (!file.exists()) {
                file.mkdirs();//�ļ���ӦĿ¼�������ڣ��򴴽�
                try {
                    System.out.println("mkdirs: " + file.getCanonicalPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
 
            file = new File(file, dirs[dirs.length - 1]);//�����ļ�
 
            return file;
        } else {
            if (!file.exists()) {//��Ŀ��·����Ŀ¼�����ڣ��򴴽�
                file.mkdirs();
                try {
                    System.out.println("mkdirs: " + file.getCanonicalPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
 
            file = new File(file, dirs[0]);//�����ļ�
 
            return file;
        }
 
    }
 
    /**
     * û��ָ��ѹ��Ŀ��·������ѹ��,��Ĭ�ϵ�·������ѹ��
     * @param dirPath ѹ��Դ�ļ�·��
     * */
    public static void compress(String dirPath){
 
        int firstIndex= dirPath.indexOf("/");
        int lastIndex= dirPath.lastIndexOf("/");
        String zipFileName=dirPath.substring(0,firstIndex+1)+dirPath.substring(lastIndex+1);
        compress(dirPath,zipFileName);
    }
 
    /**
     * ѹ���ļ�
     * @param dirPath ѹ��Դ�ļ�·��
     * @param zipFileName ѹ��Ŀ���ļ�·��
     * */
    public static void compress(String dirPath,String zipFileName){
 
 
        zipFileName=zipFileName+SUFFIX;//����ļ��ĺ�׺��
 
        File dirFile=new File(dirPath);
        List<File> fileList= getAllFile(dirFile);
 
        byte[] buffer=new byte[BUFFER];
        ZipEntry zipEntry=null;
        int readLength=0;     //ÿ�ζ�ȡ�����ĳ���
 
        try {
            // ������ļ���CRC32У��
            CheckedOutputStream cos = new CheckedOutputStream(new FileOutputStream(
                    zipFileName), new CRC32());
            ZipOutputStream zos = new ZipOutputStream(cos);
 
            for(File file:fileList){
 
                if(file.isFile()){   //�����ļ�����ѹ���ļ�
 
                    zipEntry=new ZipEntry(getRelativePath(dirPath,file));  //
                    zipEntry.setSize(file.length());
                    zipEntry.setTime(file.lastModified());
                    zos.putNextEntry(zipEntry);
 
                    InputStream is=new BufferedInputStream(new FileInputStream(file));
 
                    while ((readLength=is.read(buffer,0,BUFFER))!=-1){
                        zos.write(buffer,0,readLength);
                    }
                    is.close();
                    System.out.println("file compress:"+file.getCanonicalPath());
                }else {     //���ǿ�Ŀ¼����д��zip��Ŀ��
 
                    zipEntry=new ZipEntry(getRelativePath(dirPath,file));
                    zos.putNextEntry(zipEntry);
                    System.out.println("dir compress: " + file.getCanonicalPath()+"/");
                }
            }
            zos.close();  //���ùر�������Ȼѹ�����һ���ļ������
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    /**
     * 
     * */
    public static void decompress(String zipFileName,String destPath){
 
        try {
 
            zipFileName=zipFileName+SUFFIX;
            ZipInputStream zis=new ZipInputStream(new FileInputStream(zipFileName),Charset.forName("GBK"));
            ZipEntry       zipEntry       = null;
            byte[]         buffer         = new byte[BUFFER];//������
            int            readLength     = 0;//ÿ�ζ������ĳ���
            while ((zipEntry=zis.getNextEntry())!=null){
                if(zipEntry.isDirectory()){//����Ŀ¼
                    File file=new File(destPath+"/"+zipEntry.getName());
                    if(!file.exists()){
                        file.mkdirs();
                        System.out.println("mkdirs:"+file.getCanonicalPath());
                        continue;
                    }
                }//�����ļ�
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
}