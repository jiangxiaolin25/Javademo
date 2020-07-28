package tools;

import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIexcelread {
	XSSFWorkbook workbook;
	
	
	public void testExcel2007Write(String sheetname,String cellvalue) throws IOException{
		workbook=new XSSFWorkbook();
		//2���½�������
		XSSFSheet sheet=workbook.createSheet(sheetname);
		//3��������
		XSSFRow row=sheet.createRow(0);
		//4���½���Ԫ��
		XSSFCell cell=row.createCell(2);
		//5������Ԫ���������
		cell.setCellValue(cellvalue);
		//6�����湤����
		FileOutputStream fileout=new FileOutputStream("f:\\hello2.xlsx");
		workbook.write(fileout);
		System.out.println("����2007��ʽ��Excel�ɹ�");
		
	}


}
