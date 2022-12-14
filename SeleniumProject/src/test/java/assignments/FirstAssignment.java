package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAssignment {

	public static void main(String[] args) {
		/*Assignment1
		 * Navigate to google page search for way2Automation and click on search 
		 * and click on very first link print total links count and text from the page
		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("way2automation");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-label='Google Search']"))).click();
		driver.findElement(By.xpath("//a[contains(@href,'www.way2automation.com')]/h3")).click();
		
		List<WebElement> allinks = driver.findElements(By.tagName("a"));
		for(WebElement ele : allinks) {
			System.out.println(ele.getText());
		}
		System.out.println("Total links on the page is "+allinks.size());
		
	}

}
