package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class RediffLoginPage {

	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {

		this.driver = driver;
	}

	// FIND BY Annoataion

	/*
	 * @FindBy(id="login1") WebElement username;
	 * 
	 * @FindBy(id="password") WebElement password;
	 */

	// Page Object Pattern

	By userName = By.id("login1");
	By password = By.id("password");
	By SignIn = By.className("signinbtn");

	public WebElement userName() {
		return driver.findElement(userName);
	}

	public WebElement Paswword() {
		return driver.findElement(password);
	}

	public WebElement SignIn() {
		return driver.findElement(SignIn);
	}

	/*
	 * public WebElement userName() {
	 *  return username;
	 *  
	 *   }
	 * 
	 * public WebElement Paswword() {
	 *  return password;
	 *   }
	 */
}
