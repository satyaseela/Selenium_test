package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_case1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\gcit\\chromedriver.exe");
		driver.get("https://www.fb.com");
		driver.manage().window().maximize();
		driver.findElement(By .xpath("//button[@title ='Allow essential and optional cookies' ]")).click();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Satya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Seela");
		
		
		}

	}

