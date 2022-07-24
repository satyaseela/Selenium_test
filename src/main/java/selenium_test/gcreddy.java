package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gcreddy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty(WebDriver.chrome.driver, "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://gcreddy.com/project/admin/login.php");

		boolean status = driver.findElement(By.name("username")).isDisplayed();
		System.out.println(status);//true

		status = driver.findElement(By.name("username")).isEnabled();
		System.out.println(status);//true

		driver.findElement(By.name("username")).sendKeys("Winborg");
		Thread.sleep(2000);

		String val = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(val);//Winborg

		val = driver.findElement(By.name("username")).getAttribute("type");
		System.out.println(val);//text

		driver.findElement(By.name("password")).sendKeys("India@123");

		val = driver.findElement(By.name("password")).getAttribute("type");
		System.out.println(val);//password

		driver.findElement(By.name("username")).clear();

		Thread.sleep(4000);
		driver.close();

	}

}
