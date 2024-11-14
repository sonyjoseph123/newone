import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewClass {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		 driver=new ChromeDriver();
	}
	
	@Test
	public void newtest() {
		driver.get("https://www.flipkart.com");
	}
	
}
