package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLead {
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
	driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Expleo");
    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Rebecca");
    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("DP");
    	   	    
    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
    
    //get the title of the page
    String title = driver.getTitle();
    System.out.println("Title : "+title);
    driver.close();
}
}
