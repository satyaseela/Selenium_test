package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoostatement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yahoo.com/lifestyle/meet-covid-super-dodgers-143320652.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//a[@class='_yb_gyzfl']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login-username")).sendKeys("sherlinsatya@yahoo.com");
		Thread.sleep(1000);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(1000);
		String at = driver.getTitle();
		String et = "yahoo";//expected title
		driver.close();
		
		if(at.equalsIgnoreCase(et))
			System.out.println("test sucsessfull");
		else
			System.out.println("test unsucsessfull");
	}
}