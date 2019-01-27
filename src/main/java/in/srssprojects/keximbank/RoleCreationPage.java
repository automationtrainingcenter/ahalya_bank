package in.srssprojects.keximbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RoleCreationPage {
	WebDriver driver;
	
	//role name
	@FindBy(how=How.ID_OR_NAME, using="txtRname")
	private WebElement roleName;
	
	//role description
	@FindBy(how=How.ID_OR_NAME, using="txtRDesc")
	private WebElement roleDescription;
	
	
	//role type
	@FindBy(how=How.ID_OR_NAME, using="lstRtypeN")
	private WebElement roleType;
	
	//submit
	@FindBy(how=How.ID_OR_NAME, using="btninsert")
	private WebElement submit;
	
	//reset
	@FindBy(how=How.ID_OR_NAME, using="Btn_Reset")
	private WebElement reset;
	
	//cancel
	@FindBy(how=How.ID_OR_NAME, using="Btn_cancel")
	private WebElement cancel;
	
	public RoleCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//fill role name
	public void fillRoleName(String roleName) {
		this.roleName.sendKeys(roleName);
	}
	
	//fill role description
	public void fillRoleDescription(String roleDescription) {
		this.roleDescription.sendKeys(roleDescription);
	}
	
	//select role type
	public void selectRoletype(String roleType) {
		new Select(this.roleType).selectByVisibleText(roleType);
	}
	
	//click on submit button
	public void clickSubmit() {
		this.submit.click();
	}
	
	//click on cancel button
	public void clickCancel() {
		this.cancel.click();
	}
	
	//click on reset button
	public void clickReset() {
		this.reset.click();
	}

	
	//fill role creation form
	public void fillRoleCreation(String roleName, String roleDescription, String roleType) {
		this.fillRoleName(roleName);
		this.fillRoleDescription(roleDescription);
		this.selectRoletype(roleType);
	}
}
