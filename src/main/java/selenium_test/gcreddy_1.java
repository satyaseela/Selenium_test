package selenium_test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gcreddy_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setPropertie(WebDriver.chrome.driver, "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://gcreddy.com/project/admin/login.php");
		String val = driver.findElement(By.className("pageHeading")).getText();
		System.out.println(val);

		driver.findElement(By.id("tdb1")).click();
		Thread.sleep(2000);

		val= driver.findElement(By.className("messageStackError")).getText();
		System.out.println(val);

		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();

		//Handle Popup Window
		Alert popUp = driver.switchTo().alert();//Switch driver focus from Browser window to popUp window
		Thread.sleep(2000);
		val = popUp.getText();
		System.out.println(val);
		popUp.accept();

		driver.findElement(By.id("login1")).sendKeys("India@123");
		Thread.sleep(3000);

		driver.close();

	}

}
