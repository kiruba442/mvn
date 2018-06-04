package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.Basepage;

public class Searchpo extends Basepage {
	public Searchpo(WebDriver driver) {
		super(driver);
		}
	@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
	private  WebElement facebookLink;
	public   WebElement facebookLink() {
		return facebookLink;
	}
	@FindBy(xpath="//a[text()='Instagram']")
	private  WebElement instaLink;
	public   WebElement instaLink() {
		return instaLink;
	}
	@FindBy(xpath="//a[text()='Login on Twitter']")
	private  WebElement twitterLink;
	public   WebElement twitterLink() {
		return twitterLink;
	}
	@FindBy(xpath="//a[text()='Sign Up | LinkedIn']")
	private  WebElement linkedinLink;
	public   WebElement linkedinLink() {
		return linkedinLink;
	}
}
