package in.srssprojects.keximbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EmployeeDetailsPage {
	WebDriver driver;
	
	@FindBy(how=How.ID_OR_NAME, using="BtnNew")
	private WebElement newEmployee;
	
	
	public EmployeeDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickNewEmployee() {
		this.newEmployee.click();
	}

}
