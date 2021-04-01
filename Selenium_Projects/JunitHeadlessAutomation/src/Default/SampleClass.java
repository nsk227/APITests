package Default;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SampleClass {
	WebDriver driver =null;
	
	@Before
	public void Initialize() {
		driver = new HtmlUnitDriver();
	}
	@Test
	public void SampleMethod() throws InterruptedException {
	driver.get("https://www.google.com");
	System.out.println("Title of the Page = " + driver.getTitle());
	driver.findElement(By.linkText("Images")).click();
	Thread.sleep(2000);
	System.out.println("Title of the page = "+ driver.getTitle());
	
}

	@After
	public void Close() {
	/*if driver!=null;
			driver.quit();*/
		
	}
	
}
