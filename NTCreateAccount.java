package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NTCreateAccount {
	public static void main(String[] args) {

		// Setuping Browser property
		WebDriverManager.chromedriver().setup();

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize web page
		driver.manage().window().maximize();

		// input userid
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// input pwd
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// login
		driver.findElement(By.className("decorativeSubmit")).click();

		// click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// click Accounts link
		driver.findElement(By.linkText("Accounts")).click();

		// click on CreateAccount Link
		driver.findElement(By.linkText("Create Account")).click();
		
		// select currency value
				Select currency = new Select(driver.findElement(By.id("currencyUomId")));
				currency.selectByValue("INR");

				// Entering description 
				driver.findElement(By.name("description")).sendKeys("NRI Account");

				driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("OMR");

		
				driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");

				driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("13LPA");

				// submit
				driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

				// getting error message
				String errmsg = driver.findElement(By.xpath("//div[@class='errorMessageHeader']")).getText();
				String errmsg1 = driver.findElement(By.xpath("//li[@class='errorMessage']")).getText();

				// Print Error message
				System.out.println("The Shown Error Message is " + errmsg + errmsg1);
	}
}
