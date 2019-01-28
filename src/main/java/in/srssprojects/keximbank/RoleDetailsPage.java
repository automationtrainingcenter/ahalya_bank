package in.srssprojects.keximbank;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RoleDetailsPage {
	WebDriver driver;
	
	//new role button
	@FindBy(how = How.ID_OR_NAME, using="btnRoles")
	private WebElement newRole;
	
	
	public RoleDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//click on new role button
	public void clickNewRole() {
		this.newRole.click();
	}
	
	public WebElement verifyRoleDetailsPage() {
		return driver.findElement(By.id("btnRoles"));
	}

}
