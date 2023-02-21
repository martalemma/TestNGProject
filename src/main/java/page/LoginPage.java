package page;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class LoginPage  extends BasePage{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	String Category = "Book";
//	webElement list
	@FindBy(how = How.CSS,using = "input[name='categorydata']")WebElement Category_Box_Element;
	@FindBy(how = How.CSS,using = "input[value='Add category']")WebElement Add_Category_Button_Element;
	@FindBy(how = How.CSS,using = "select[name='due_month']")WebElement DropDown_Due_Month_Element;
	@FindBy(how = How.XPATH,using = "//span[contains(text(),'Book')]")WebElement Category_Added_Element;
	
	
//Corresponding method
 public void enterCategory() {
	 Category_Box_Element.sendKeys(Category); 
	 Add_Category_Button_Element.click();
 }

 public void validateCategoryIsDisplayed() {
	 if(Category_Added_Element.isDisplayed()) {
		 System.out.println("Category is displayed");
	 }else {
		 System.out.println("Category is not displayed");
	 }
 }
 
 public void ValidateUserNotAbleToAddDuplicatedCategory() {
	
	 enterCategory();
	
	if(Category_Added_Element.isDisplayed()) {
		System.out.println("The category you want to add already exists:");
		System.out.println(Category);
	}else {
		System.out.println("The category you want to add is not exist");
	}
	
 }
 public void validateDropDownMonth() {
	 Select dropDown = new Select(DropDown_Due_Month_Element);
		List<WebElement> options = dropDown.getOptions();

		for(int i = 0; i < options.size(); i++)
		{
		    System.out.println(options.get(i).getText());
		}
		
 }
		
	
}
