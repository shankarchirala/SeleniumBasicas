package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total links are ::"+allLinks.size());
		
		for(WebElement ele : allLinks) {
			System.out.println(" "+ele.getText()+" "+ele.getAttribute("href"));
		}
	}

}
