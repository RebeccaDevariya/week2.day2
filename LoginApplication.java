package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApplication {
	public static void main(String[] args) {
		// Driver setup
	    WebDriverManager.chromedriver().setup();
	    // Open Chrome Browser
	    ChromeDriver driver = new ChromeDriver();
	    // Load the URL
	    driver.get("https://acme-test.uipath.com/login");
	    // Maximize the window
	    driver.manage().window().maximize();
	    //input userid
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
	    //input pwd
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
	    //click submit button
	    driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	    //get the title of the page
	    String title = driver.getTitle();
	    System.out.println("Title : "+title);
	    driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
	    System.out.println("logout");
	   driver.close();
	   
	}
}
