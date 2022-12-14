package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFullPageScreenShot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://way2automation.com");
		driver.manage().window().maximize();
		File pageScreenShot = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pageScreenShot,new File("./Screenshots/page.jpg"));
		
		
		//getting full page screen shot
		File fullPageScreenShot = driver.getFullPageScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fullPageScreenShot, new File("./Screenshots/fullpage.jpg"));
		
	}

}
