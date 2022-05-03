package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindAccount {
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
	

			// click on Accounts link
			driver.findElement(By.linkText("Accounts")).click();

			// click on Find Account Link
			driver.findElement(By.linkText("Find Accounts")).click();

			// find accountname 
			driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Credit Limited Account");

			// find FindAccount button 
			driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();

			// click on Credit Limited Account link
			driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewAccount?partyId=accountlimit100']")).click();

			// clicking on Edit button
			driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]")).click();

			// getting accountname and printing
			System.out.println("Account Name :  " + driver.findElement(By.id("accountName")).getAttribute("value"));

			// getting description and printing
			System.out.println("Description : " + driver.findElement(By.name("description")).getText());

			// getting current title of page
			System.out.println("Title : " + driver.getTitle());
	}
}
