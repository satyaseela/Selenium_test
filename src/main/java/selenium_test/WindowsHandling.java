package selenium_test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gcit\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kotak.com/en/home.html");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.xpath("//a[@class='trk-login-net btn btn-primary']"));
		login.click();

		
		System.out.println("CurrentWindow Handle:" +driver.getWindowHandle());
		//in order to get list of window handles
	Set<String> handles = driver.getWindowHandles();
		for(String handle: handles) {
			System.out.println(handle + driver.getTitle());
		}
		}
		
		
	}


