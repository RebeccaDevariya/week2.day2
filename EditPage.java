package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {
	public static void main(String[] args) {
		// Driver setup
	    WebDriverManager.chromedriver().setup();
	    // Open Chrome Browser
	    ChromeDriver driver = new ChromeDriver();
	    // Load the URL
	    driver.get("http://leafground.com/pages/Edit.html");
	    // Maximize the window
	    driver.manage().window().maximize();
	  //input userid
	    driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
	 // Finding email attribute  and sending values and pressing tab key
	 		driver.findElement(By.xpath("(//label[@for='email']/following-sibling::input)[2]")).sendKeys("Text");
	 		driver.findElement(By.xpath("(//label[@for='email']/following-sibling::input)[2]")).sendKeys(Keys.TAB);

	 		// Prints the default text entered in given attribute
	 		System.out.println(driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("value"));

	 		// Clears the text in given Attribute name
	 		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();

	 		// Assigning boolean value 
	 		boolean val = driver.findElement(By.xpath("//label[@for='disabled']/following-sibling::input")).isEnabled();

	 		// Checking the field is enabled or disabled
	 		if (val == false) {

	 			System.out.println("The Edit Field is Disabled");
	 		} else {
	 			System.out.println("The Edit field is Enabled");
	 		}
	 		driver.close();
}
}
