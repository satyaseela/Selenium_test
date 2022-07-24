package selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nested_loop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//button[@id=\"L2AGLb\"]")).click();
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.get("https://demo.openmrs.org/openmrs/appointmentschedulingui/manageAppointmentTypes.page");
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.xpath("//form[@id='login-form']")).submit();
		boolean result = deleteServiceType("Dermatology");
		System.out.println(result);
	}
	public static boolean deleteServiceType(String serviceName) throws InterruptedException
	{
		boolean result = false;
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.xpath("//td[text()='"+serviceName+"']/following-sibling::td[3]/descendant::i[@title='Delete']")).click();
		List<WebElement> buttonList = driver.findElements(By.xpath(".//*[@id='delete-appointment-type-dialog']/div[2]/button[@class='confirm right']"));
		System.out.println("Number of Buttons" + buttonList.size());
		for(int i = 0;i<buttonList.size();i++)
		{
			try{
				if(buttonList.get(i).isDisplayed() || buttonList.get(i).isEnabled())
				{
					buttonList.get(i).click();
					result= true;
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println("Element is not visible|| enabled"+e.getMessage());
			}
		}
		return result;
	}

}
