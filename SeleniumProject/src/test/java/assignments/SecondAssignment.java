package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondAssignment {

	public static void main(String[] args) {

		/*
		 * Assignment 2
		 * Note: will not use absolute /partial xpath
		 * 
		 * Navigate to qa.way2automation.com on the 
		 * registration form enter name and click on submit button
		 * 
		 * */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.name("phone"))).sendKeys("asdfasf");
		//driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.findElement(RelativeLocator.with(By.xpath("//input[@value='Submit']")).toRightOf(By.linkText("Signin"))).click();
		
		
	}

}
