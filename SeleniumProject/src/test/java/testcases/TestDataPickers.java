package testcases;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDataPickers {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		//Create a map to store  preferences 
		Map<String, Object> prefs = new HashMap<String, Object>();
		    
		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);
		    
		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();
		    
		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);
		    
		//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.airvistara.com/in/en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[@id='departCalendarDiv']//span[@class='calender_icon']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//This is from date picker table
		WebElement dateWidgetFrom = wait.until(
		ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar"))).get(0);
		List<WebElement> allDates = dateWidgetFrom.findElements(By.tagName("td"));
		
		
	}

}
