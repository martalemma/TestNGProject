package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	@Test
	public void UserSValidation() {
		
		driver = BrowserFactory.init();
		
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterCategory();
		loginpage.validateCategoryIsDisplayed();
		loginpage.validateDropDownMonth();
		loginpage.ValidateUserNotAbleToAddDuplicatedCategory();
		
           
		BrowserFactory.tearDown();
		
	}


}
