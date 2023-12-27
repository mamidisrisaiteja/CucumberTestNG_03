package testOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTestCaseOne {
	
	WebDriver driver;
	@Test
	public void testOne() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		System.out.println("Hai in my first test");
	}

}
