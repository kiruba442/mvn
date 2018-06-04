package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.Basetest;
import pom.Googlepo;
import pom.Searchpo;

public class Test4 extends Basetest {
	public static WebDriverWait wait;
	@Test
	public void testtwitterHome() {
   wait=new WebDriverWait(driver, 20);
	driver.get("https://www.google.com/");
	Googlepo g=new Googlepo(driver);
	g.searchTxtBx().sendKeys(("linkedin")+Keys.ENTER);
	Searchpo s= new Searchpo(driver);
	s.verifyElement(s.linkedinLink());
	s.linkedinLink().click();
	System.out.println(driver.getTitle());
	String eTitle = "Sign Up | LinkedIn1";
	wait.until(ExpectedConditions.titleContains(eTitle));
    String aTitle = driver.getTitle();
    Reporter.log("title is displayed " +aTitle,true);
	Assert.assertEquals(aTitle,eTitle);
		}
}
