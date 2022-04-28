package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Locators {
	public static void main(String[] args) {
		// Driver setup
	    WebDriverManager.chromedriver().setup();
	    // Open Chrome Browser
	    ChromeDriver driver = new ChromeDriver();
	    // Load the URL
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    // Maximize the window
	    driver.manage().window().maximize();
	    
	    // Finding the webelement
	    WebElement elementUsername = driver.findElement(By.id("username"));
	    // Entering some input in the text box
	    elementUsername.sendKeys("Demosalesmanager");
	    
	    driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	    
	    driver.findElement(By.className("decorativeSubmit")).click();
	    	      
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	   	    
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Expleo");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rebecca");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Devapriya");
	    driver.findElement(By.className("smallSubmit")).click();
	    
	    String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	    System.out.println(text);
	    
	}
}
