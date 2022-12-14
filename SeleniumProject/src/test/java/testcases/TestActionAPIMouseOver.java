package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestActionAPIMouseOver {

	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("way2automation");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@aria-label='Google Search']"))).click();
		driver.findElement(By.xpath("//a[contains(@href,'www.way2automation.com')]/h3")).click();
			
		WebElement resources = driver.findElement(By.xpath("(//ul//li//a//span[text()='Resources'])[1]"));
		Actions action = new Actions(driver);
		action.moveToElement(resources).perform();
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("Practive Site 1"))).click();
		//driver.findElement(By.linkText("Practice Site 1")).click();
		
		
	
		
		
		
	}

}
