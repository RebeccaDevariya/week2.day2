package week2.day2;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LearnXpath {
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
	  //  WebElement elementUsername = driver.findElement(By.xpath("//input[@id='username']"));
	    // Entering some input in the text box
	   // elementUsername.sendKeys("Demosalesmanager");
	     driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	    
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	    
	    driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
	    
	    driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Expleo");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Rebecca");
	    driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Andrews");
	    	   	    
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		    
	    String text = driver.findElement(By.xpath("//span='viewLead_companyName_sp']")).getText();
	    System.out.println(text);
	}
}
