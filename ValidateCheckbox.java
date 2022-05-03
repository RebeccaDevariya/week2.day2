package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateCheckbox {
	public static void main(String[] args) {

		// Setuping Browser property
		WebDriverManager.chromedriver().setup();

		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		System.out.println("The Fifth Page CheckBox.html");

		// Load the URL
		driver.get("http://leafground.com/pages/checkbox.html");

		// Maximize browser window
		driver.manage().window().maximize();

		// Select known languages
		driver.findElement(By.xpath("//label[contains(text(),'languages')]//following::input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'languages')]//following::input[@type='checkbox'][3]")).click();

		// Checking checkbox is selected
		boolean checkbox = driver
				.findElement(By.xpath("//label[contains(text(),'Selenium')]//following::input[@type='checkbox']"))
				.isSelected();

		if (checkbox == true) {
			System.out.println("The CheckBox is Selected");
		}

		else {
			System.out.println("The CheckBox is not Selected");
		}

		// checking first checkbox is selected or not
		boolean chk1 = driver
				.findElement(By.xpath("//label[contains(text(),'DeSelect')]//following::input[@type='checkbox'][1]"))
				.isSelected();

		// if true it will deselect checkbox
		if (chk1 == true) {
			driver.findElement(By.xpath("//label[contains(text(),'DeSelect')]//following::input[@type='checkbox'][1]"))
					.click();
			System.out.println("The Check is Deselected");
		}

		// checking second checkbox is selected or not
		boolean chk2 = driver
				.findElement(By.xpath("//label[contains(text(),'DeSelect')]//following::input[@type='checkbox'][2]"))
				.isSelected();

		//deselect checkbox
		if (chk2 == true) {
			driver.findElement(By.xpath("//label[contains(text(),'DeSelect')]//following::input[@type='checkbox'][2]"))
					.click();
			System.out.println("The Check is Deselected");
		}

		// select all checkboxes
		List<WebElement> elements = driver
				.findElements(By.xpath("//label[contains(text(),'all')]//following::input[@type='checkbox']"));
		int size = elements.size();

		for (int i = 0; i < size; i++) {
			elements.get(i).click();
		}
	}
}
