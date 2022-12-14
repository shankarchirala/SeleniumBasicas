package testcases;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTables {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("Row Count is " + rows.size());

		List<WebElement> column = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
		System.out.println("Column count is " + column.size());

		for (int i = 1; i <= rows.size(); i++) {
			for (int j = 1; j <= column.size(); j++) {
				System.out.print(driver
						.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText() + " ");
			}
			System.out.println();
		}

	}

}
