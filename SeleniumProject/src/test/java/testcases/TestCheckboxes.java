package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckboxes {
	
	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement block = driver.findElement(RelativeLocator.with(By.xpath("//div[@class='display']")).below(By.xpath("//h2[@class='specialT' and contains(text(),'Checkbox Form')]")));
		
		List<WebElement> checkBoxes = block.findElements(By.name("sports"));
		for(WebElement checkbox : checkBoxes) {
			checkbox.click();
		}
		System.out.println("Total Number of check boxes ::"+checkBoxes.size());
	}

}
