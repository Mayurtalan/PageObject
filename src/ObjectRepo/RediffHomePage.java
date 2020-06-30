package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {

	WebDriver driver;
	public RediffHomePage(WebDriver driver) {	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// FIND BY Annoataion	
	//@FindBy(xpath="//*[text()='Create a new account']")
		
	@FindBy(xpath="//div[@class='create-new-account']//a")
	WebElement createLink;
	
	public WebElement CreateLink() {
		return createLink;
	}
	
	

}
