package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRectangle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement image = driver.findElement(By.xpath("//div[@id='logo']"));
	    
		Dimension dim =	image.getSize();
		System.out.println("Height from Dimension ::"+ dim.getHeight());
		System.out.println("Width from Dimension ::"+ dim.getWidth());
		
		
		
	    
		Rectangle rect = image.getRect();
		System.out.println("Height ::"+rect.getHeight());
		System.out.println("Width ::"+rect.getWidth());
		System.out.println("X Coord ::"+rect.getX());
		System.out.println("Y Coord ::"+rect.getY());
	}

}
