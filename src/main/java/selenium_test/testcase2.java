package selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin123");
		
		driver.findElement(By.id("Inpatient Ward")).click();
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension\"]/i")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("appointmentschedulingui-manageAppointmentTypes-app")).click();
		boolean result = verifyServiceType("Urology");
		System.out.println(result);	
	}
	@SuppressWarnings("unused")
	private static boolean verifyServiceType(String sName){
		// TODO Auto-generated method stub
		boolean result=false ;
		WebDriver driver = new ChromeDriver();
		List<WebElement> pageList = driver.findElements(By.xpath("//*[@id='appointmentTypesTable_paginate']/span/a"));
		List<WebElement> tdList = driver.findElements(By.xpath("//*[@id='appointmentTypesTable']/tbody/tr/td[1]"));
		outerloop:
			for(int i = 1 ; i< pageList.size(); i++)
			{
				pageList =driver.findElements(By.xpath("//*[@id='appointmentTypesTable_paginate']/span/a")); 
				pageList.get(i).click();
				tdList = driver.findElements(By.xpath("//*[@id='appointmentTypesTable']/tbody/tr/td[1]"));
				for(int j=0; j<tdList.size(); j++)
					{
					if(tdList.get(j).getText().equalsIgnoreCase(sName))
						System.out.println("Service Type Found!!!");
						result = true;
						break outerloop;
						}  
			}
		return result;
	}

}