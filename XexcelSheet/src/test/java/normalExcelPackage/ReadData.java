package normalExcelPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadData {
	
	WebDriver driver;
	FileInputStream f;
	XSSFWorkbook wb;
	XSSFSheet s;
	
	@BeforeTest
	public void startup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\Documents\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void enterData() throws AWTException, InterruptedException
	{
		
		try
		{
		f=new FileInputStream("C:\\Users\\Dinesh\\Music\\GoogleTest.xlsx");
		wb=new XSSFWorkbook(f);
		s=wb.getSheet("Players");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		String input=s.getRow(2).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(input);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}

}
