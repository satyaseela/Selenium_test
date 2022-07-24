package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_testcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty(WebDriver.chrome.driver, "C:\\Users\\gcit\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Satya");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Seela");
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
	}

}
