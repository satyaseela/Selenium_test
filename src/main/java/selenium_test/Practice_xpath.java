package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://graphcore.ai");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@role=\"button\"]")).click();
		driver.findElement(By.linkText("Careers")).click();
		driver.findElement(By.linkText("Job Vacancies")).click();
		driver.findElement(By.xpath("//input[@name=\"jobs\"]")).sendKeys("test engineer");
		

	}

}
