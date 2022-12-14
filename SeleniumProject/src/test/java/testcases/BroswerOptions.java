package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BroswerOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("--headless");
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(opt);
		
		driver.get("http://selenium.dev");
		
		System.out.println(driver.getTitle());
	}

}
