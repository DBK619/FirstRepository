package normalExcelPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteData {
	
	
	public static void main(String[] args) throws IOException 
	{
	File src=new File("C:\\Users\\Dinesh\\Music\\WriteData.xlsx");
	FileInputStream fin=new FileInputStream(src);
	
	XSSFWorkbook wb=new XSSFWorkbook(fin);
	XSSFSheet s=wb.getSheetAt(0);
	//String data=s.getRow(0).getCell(0).getStringCellValue();
	//System.out.println(data);
	
	System.out.println("Write into Excel");
	s.getRow(0).createCell(1).setCellValue("abcde123");
	s.getRow(1).createCell(1).setCellValue("abcde1234");
	System.out.println("Writing Excel");
	FileOutputStream fout=new FileOutputStream(src);
	wb.write(fout);
	wb.close();
	}
	

}
