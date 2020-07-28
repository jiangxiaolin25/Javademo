package tools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIexcelwrite {
//	XSSFWorkbook workbook;
	
	
//	public XSSFWorkbook getinstant() {
//		return new XSSFWorkbook();
//		
//	}
	
	/***
	 * 
	 * @param sheetname  shell����
	 * @param cellvalue  ��Ԫ��ֵ
	 * @param cellcount  �ڼ���
	 * @param rowcount    �ڼ���
	 * @throws IOException
	 */
	public void testExcel2007Writefirstrow(XSSFWorkbook workbook) throws IOException{
//	    workbook=new XSSFWorkbook();
		
			//2���½�������
			XSSFSheet sheet=workbook.createSheet("��Ϣ��ȡ��¼");
			//3��������
			XSSFRow row=sheet.createRow(0);
			//4���½���Ԫ��
			XSSFCell cell=row.createCell(0);
			XSSFCell cell1=row.createCell(1);
			XSSFCell cell2=row.createCell(2);
//			XSSFCell cell3=row.createCell(3);
//			XSSFCell cell4=row.createCell(4);
//			XSSFCell cell5=row.createCell(5);
//			XSSFCell cell6=row.createCell(6);
			//5������Ԫ���������
			cell.setCellValue("���Դ���");
			cell1.setCellValue("��������");
			cell2.setCellValue("���Խ��");
//			cell3.setCellValue("���Խ��");
	}
    /***
     * 
     * @param workbook
     * @throws FileNotFoundException
     * @throws IOException
     * ����һ��excel�ĵ�
     */
    
	public void creatdowneexcel() throws FileNotFoundException, IOException {
		 XSSFWorkbook workbook=new XSSFWorkbook();
		//2���½�������
		XSSFSheet sheet=workbook.createSheet("��Ϣ��ȡ��¼");
		//3��������
		XSSFRow row=sheet.createRow(0);
		//4���½���Ԫ��
		XSSFCell cell=row.createCell(0);
		XSSFCell cell1=row.createCell(1);
		XSSFCell cell2=row.createCell(2);
//		XSSFCell cell3=row.createCell(3);
//		XSSFCell cell4=row.createCell(4);
//		XSSFCell cell5=row.createCell(5);
//		XSSFCell cell6=row.createCell(6);
		//5������Ԫ���������
		cell.setCellValue("���Դ���");
		cell1.setCellValue("��������");
		cell2.setCellValue("���Խ��");
		FileOutputStream fileout=new FileOutputStream("/mnt/sdcard/result.xlsx");
		
		workbook.write(fileout);
		System.out.println("����2007��ʽ��Excel�ɹ�");
	}
	
	public  void writeExcel3(String testcount, String testname, String result) {
		try {
			// ������ļ�
			FileInputStream fileInput = new FileInputStream("/mnt/sdcard/result.xlsx");
			// poi���µ����ȡexcel�ļ�
			// ����һ��webbook����Ӧһ��Excel�ļ�
			XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
			// ��ӦExcel�ļ��е�sheet��0�����һ��
			XSSFSheet sh = workbook.getSheetAt(0);
			int lastRowNum = sh.getLastRowNum();
			System.out.println("���һ��" + lastRowNum);
			XSSFCell createCell1 = sh.createRow(lastRowNum + 1).createCell(0);
			XSSFCell createCel2 = sh.getRow(lastRowNum + 1).createCell(1);
			XSSFCell createCel3 = sh.getRow(lastRowNum + 1).createCell(2);
			createCell1.setCellValue(testcount);
			createCel2.setCellValue(testname);
			createCel3.setCellValue(result);
			// ���޸ĺ���ļ�д����D:\\excelĿ¼��
			FileOutputStream os = new FileOutputStream("/mnt/sdcard/result.xlsx");
			// FileOutputStream os = new
			// FileOutputStream("D:\\test.xlsx");//��·��Ҳ��д�޸�ǰ��·�����൱����ԭ��excel�ĵ����޸�
			os.flush();
			// ��Excelд��
			workbook.write(os);
			// �ر���
			fileInput.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	


}
