package selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtables1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gcit\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.findElement(By.id("accept-choices")).click();
		
		//listing the number of rows in table
		//*[@id="customers"]/tbody/tr[2]/td[1]
		

		List<WebElement> rowelement = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]"));
		System.out.println(rowelement.size());
		int rowsize =rowelement.size();
		
		
		
		// listing the number of columns in the table
		//*[@id="customers"]/tbody/tr[2]/td
		

		List<WebElement> columnelement = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[2]/td"));
		System.out.println(columnelement.size());
		int columnsize = columnelement.size();
				
		//iteration of rows and columns in table
		
		
		for(int i=1; i<=rowsize; i++) {
			for(int j =1; j<=columnsize; j++) {
			
			System.out.println(driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+ i +"]/td["+ j +"]")).getText());
		
			
		}
		
		driver.quit();
	}

}
}