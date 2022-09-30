package selenium_test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling_2 {

	//private static final Object ParentWindowhandle = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gcit\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"cookieChoiceDismiss\"]")).click();
		
		js.executeScript("window.scrollBy(0,800)");
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]"));
		button.click();
		
		String parentWindowhandle = driver.getWindowHandle();
		System.out.println("ParentWindowhandle :" +parentWindowhandle +driver.getTitle());
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		for(String windowhandle : windowhandles) {
			if(!windowhandle.equals(parentWindowhandle)) {
				driver.switchTo().window(windowhandle);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("satyasheela");
				driver.findElement(By.xpath("//input[@id='femalerb']")).click();
				Thread.sleep(1000);
				System.out.println("ChildWindowHndle : " +windowhandle +driver .getTitle());
				driver.close();
				
				driver.switchTo().window(parentWindowhandle);
				driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
				//System.out.println("chaildtab:" )
			}	
		
		//js.executeScript("window.scrollBy(0,1000)");
		
		
	
		
		
		
	}

		}

	}