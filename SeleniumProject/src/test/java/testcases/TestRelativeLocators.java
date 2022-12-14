package testcases;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRelativeLocators {

	public static void main(String[] args) throws Exception {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Relative Locators in Selenium 4
		//above
		//below
		//near
		//toLeftOf
		//toRightOf
		
		//Relative locator above
		
		WebElement above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
		above.sendKeys("shankarcheerala@gmail.com");
		File aboveScreen = above.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(aboveScreen, new File("./Screenshots/aboveScreen.jpg"));
		
		//Relative locator below
		
		WebElement below = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
		below.sendKeys("Guntur");
		File belowScreen = below.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(belowScreen, new File("./Screenshots/belowScreen.jpg"));
		
		//Relative locator near
		
		WebElement near = driver.findElement(RelativeLocator.with(By.partialLinkText("THE")).near(By.linkText("Signin")));
		File nearScreen = near.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(nearScreen,new File("./Screenshots/nearScreen.jpg"));
		near.click();
		
		//Relative Locator toRightOf
		
		WebElement toRightOf = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(By.xpath("(//label[contains(text(),'Username')])[2]")));
		toRightOf.sendKeys("asdfasdf");
		
		//Relative Locator toLeftOf
		
		WebElement toLeftOf = driver.findElement(RelativeLocator.with(By.linkText("Signin")).toLeftOf(By.xpath("(//input[@value='Submit'])[2]")));
		toLeftOf.click();
	}

}
