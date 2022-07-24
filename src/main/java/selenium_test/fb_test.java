package selenium_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class fb_test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
			driver.get("http:\\www.facebook.com");
			driver.findElement(By .xpath("//button[@title ='Allow essential and optional cookies' ]")).click();
			WebElement element3 = driver.findElement(By.xpath("//a[@ajaxify=\"/reg/spotlight/\"]"));
			element3.click();
			Thread.sleep(2000);
			WebElement  firstname = driver.findElement(By.xpath("//input[@placeholder=\"First name\"]"));
			firstname.sendKeys("Sunil");
			WebElement  lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
			lastname.sendKeys("Kumar");
			WebElement  mobile = driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
			mobile.sendKeys("9848012341");
			driver.findElement(By.xpath("//*[@id=\"month\"]/option[6]")).click();
			driver.findElement(By.xpath("//*[@id=\"day\"]/option[8]")).click();
			driver.findElement(By.xpath("//*[@id=\"year\"]/option[33]")).click();
			
			
			System.out.println("Login");
			WebElement lstitem=driver.findElement(By.id("userNavigationLabel"));
			lstitem.click();
	}

}
