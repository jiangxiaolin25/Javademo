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
		//2、新建工作表
		XSSFSheet sheet=workbook.createSheet(sheetname);
		//3、新增行
		XSSFRow row=sheet.createRow(0);
		//4、新建单元格
		XSSFCell cell=row.createCell(2);
		//5、给单元格填充数据
		cell.setCellValue(cellvalue);
		//6、保存工作簿
		FileOutputStream fileout=new FileOutputStream("f:\\hello2.xlsx");
		workbook.write(fileout);
		System.out.println("创建2007格式的Excel成功");
		
	}


}
