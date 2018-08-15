package ourCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		d.quit();
		
		

	}

}
