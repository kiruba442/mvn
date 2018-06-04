package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.xml.dom.ITagFactory;

public class Basetest implements Constants{
	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeMethod(alwaysRun=true)
	public void LaunchBrowser() {
		System.setProperty(CHROME_KEY,CHROME_PATH);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterMethod(alwaysRun=true)
	public void CloseBrowser(ITestResult r) {
		if(r.getStatus()==2) {
			Photo.getScreenShot(driver,IMG_PATH);
		}
		driver.quit();
	}
}

