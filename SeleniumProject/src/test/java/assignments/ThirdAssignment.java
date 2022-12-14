package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ThirdAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String math = driver.findElement(By.xpath("//div[@id='pdiv']//tr//td//span[@id='mathq2']")).getText().trim();
		String mathUpdated = math.replace("=","");
		System.out.println(mathUpdated);
		int firstNumber,secondNumber;
		String number[];
		if(math.contains("+")) {
			 number = mathUpdated.split("\\+");
			 firstNumber = Integer.parseInt(number[0].trim());
			 secondNumber = Integer.parseInt(number[1].trim());
			 int sum = firstNumber+secondNumber;
			System.out.println(sum);
			driver.findElement(By.xpath("//input[@id='mathuserans2']")).sendKeys(sum+"");
		}else if(math.contains("-")) {
			 number = mathUpdated.split("\\-");
			 firstNumber = Integer.parseInt(number[0].trim());
			 secondNumber = Integer.parseInt(number[1].trim());
			 int sub = firstNumber+secondNumber;
			System.out.println(sub);
			driver.findElement(By.xpath("//input[@id='mathuserans2']")).sendKeys(sub+"");
		}else {
			 number = mathUpdated.split("\\*");
			 firstNumber = Integer.parseInt(number[0].trim());
			 secondNumber = Integer.parseInt(number[1].trim());
			 int mul = firstNumber+secondNumber;
			 System.out.println(mul);
			 driver.findElement(By.xpath("//input[@id='mathuserans2']")).sendKeys(mul+"");
		}
	}

}
