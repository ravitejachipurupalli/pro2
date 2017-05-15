package date;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DatePicker 
{
	@Test
	public void date()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("document.querySelector('#datepicker1').value='28/4/2017'");
		
		driver.quit();

	}

}
