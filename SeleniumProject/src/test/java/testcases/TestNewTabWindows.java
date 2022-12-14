package testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNewTabWindows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.way2automation.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Hello Selenium 4");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("http://gmail.com");
		System.out.println(driver.getTitle());
		
		 Set<String> handles =  driver.getWindowHandles();
		 System.out.println(handles.size());
		 List<String> windowIndex = new ArrayList<String>();
		 for(String str : handles) {
			 windowIndex.add(str);
		 }
		 
		 driver.switchTo().window(windowIndex.get(0));
		 System.out.println("First Window ::"+driver.getTitle());
		 driver.close();
		 
		 driver.switchTo().window(windowIndex.get(1));
		 System.out.println("Second Window ::"+driver.getTitle());
		 driver.close();
		 
		 driver.switchTo().window(windowIndex.get(2));
		 System.out.println("Third window ::"+driver.getTitle());
		 driver.close();

	}

}
