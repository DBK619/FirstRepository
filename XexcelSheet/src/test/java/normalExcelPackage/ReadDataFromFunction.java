package normalExcelPackage;

import org.testng.annotations.Test;

import reusablePackage.ExcelReaderFunction;

public class ReadDataFromFunction {
	
	
	@Test
	public void main()
	{
	
		ExcelReaderFunction d=new ExcelReaderFunction("C:\\Users\\Dinesh\\Music\\GoogleTest.xlsx");
		String Data=d.dataReader(0, 0, 0);
		System.out.println(Data);
	
	}

}
