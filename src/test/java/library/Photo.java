package library;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo {
	public static void getScreenShot(WebDriver driver,String folderPath)
	{
		SimpleDateFormat s=new SimpleDateFormat("MM-dd-yyyy hh-mm-ss");
		String dateTime=s.format(new Date());
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcfile = t.getScreenshotAs(OutputType.FILE);
		File destfile=new File(folderPath+dateTime+".png");
		try {
			FileUtils.copyFile(srcfile, destfile);
		}catch(IOException e) {
			e.printStackTrace();
		}
			}
}
