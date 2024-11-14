import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Genericfunctions {
	
	WebDriver driver;
	public  WebElement findElement (By byElement) {
		 WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(byElement));
		 return element;
	}

}
