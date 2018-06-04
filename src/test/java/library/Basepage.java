package library;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Basepage {
	public WebDriver driver;
	public static  WebDriverWait wait;
	public Basepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,20);
	}
	public  void verifyTitle(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
			String aTitle = driver.getTitle();
			Reporter.log("title  displayed",true);
			Reporter.log("title is displayed"+aTitle,true);
		}catch(TimeoutException e) {
			Reporter.log("title not displayed",true);
			String aTitle = driver.getTitle();
			Reporter.log("title is displayed"+aTitle,true);
		}
	}
	public    void verifyElement(WebElement ele) {
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			Reporter.log("element is present",true); 
		}catch(Exception e) {
			Reporter.log("element not found",true);
		}
}
}

	



