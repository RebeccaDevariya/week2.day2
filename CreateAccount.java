package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
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

		// find accountname using AttributeBased Xpath
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("HDFC Account");

		// find description using name attribute
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		// find localname using AttributeBased Xpath and sending keys
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("OMR");

		// find sitename using AttributeBased Xpath and sending keys
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai");

		// finding annual revenue using xpath locator and class attribute
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("3LPA");

		// finding create account button using xpath locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		// closing the browser
		//driver.close();

	}
}
