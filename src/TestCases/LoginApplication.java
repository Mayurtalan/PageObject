package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepo.RediffHomePage;
import ObjectRepo.RediffLoginPage;

public class LoginApplication {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage loginPage = new RediffLoginPage(driver);
		
		loginPage.userName().sendKeys("mayur.talan");
		loginPage.Paswword().sendKeys("12345678");
		
		//loginPage.SignIn().click();
		
		RediffHomePage homePage = new RediffHomePage(driver);
		homePage.CreateLink().click();
		
	}
	

}
