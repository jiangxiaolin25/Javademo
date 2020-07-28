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
	 * @param sheetname  shell名字
	 * @param cellvalue  单元格值
	 * @param cellcount  第几行
	 * @param rowcount    第几列
	 * @throws IOException
	 */
	public void testExcel2007Writefirstrow(XSSFWorkbook workbook) throws IOException{
//	    workbook=new XSSFWorkbook();
		
			//2、新建工作表
			XSSFSheet sheet=workbook.createSheet("信息读取记录");
			//3、新增行
			XSSFRow row=sheet.createRow(0);
			//4、新建单元格
			XSSFCell cell=row.createCell(0);
			XSSFCell cell1=row.createCell(1);
			XSSFCell cell2=row.createCell(2);
//			XSSFCell cell3=row.createCell(3);
//			XSSFCell cell4=row.createCell(4);
//			XSSFCell cell5=row.createCell(5);
//			XSSFCell cell6=row.createCell(6);
			//5、给单元格填充数据
			cell.setCellValue("测试次数");
			cell1.setCellValue("测试用例");
			cell2.setCellValue("测试结果");
//			cell3.setCellValue("测试结果");
	}
    /***
     * 
     * @param workbook
     * @throws FileNotFoundException
     * @throws IOException
     * 创建一个excel文档
     */
    
	public void creatdowneexcel() throws FileNotFoundException, IOException {
		 XSSFWorkbook workbook=new XSSFWorkbook();
		//2、新建工作表
		XSSFSheet sheet=workbook.createSheet("信息读取记录");
		//3、新增行
		XSSFRow row=sheet.createRow(0);
		//4、新建单元格
		XSSFCell cell=row.createCell(0);
		XSSFCell cell1=row.createCell(1);
		XSSFCell cell2=row.createCell(2);
//		XSSFCell cell3=row.createCell(3);
//		XSSFCell cell4=row.createCell(4);
//		XSSFCell cell5=row.createCell(5);
//		XSSFCell cell6=row.createCell(6);
		//5、给单元格填充数据
		cell.setCellValue("测试次数");
		cell1.setCellValue("测试用例");
		cell2.setCellValue("测试结果");
		FileOutputStream fileout=new FileOutputStream("/mnt/sdcard/result.xlsx");
		
		workbook.write(fileout);
		System.out.println("创建2007格式的Excel成功");
	}
	
	public  void writeExcel3(String testcount, String testname, String result) {
		try {
			// 传入的文件
			FileInputStream fileInput = new FileInputStream("/mnt/sdcard/result.xlsx");
			// poi包下的类读取excel文件
			// 创建一个webbook，对应一个Excel文件
			XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
			// 对应Excel文件中的sheet，0代表第一个
			XSSFSheet sh = workbook.getSheetAt(0);
			int lastRowNum = sh.getLastRowNum();
			System.out.println("最后一行" + lastRowNum);
			XSSFCell createCell1 = sh.createRow(lastRowNum + 1).createCell(0);
			XSSFCell createCel2 = sh.getRow(lastRowNum + 1).createCell(1);
			XSSFCell createCel3 = sh.getRow(lastRowNum + 1).createCell(2);
			createCell1.setCellValue(testcount);
			createCel2.setCellValue(testname);
			createCel3.setCellValue(result);
			// 将修改后的文件写出到D:\\excel目录下
			FileOutputStream os = new FileOutputStream("/mnt/sdcard/result.xlsx");
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
