package in.srssprojects.keximbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EmployeeCreationPage {
	WebDriver driver;
	
	@FindBy(how=How.ID_OR_NAME, using="txtUname")
	private WebElement employerName;
	
	@FindBy(how=How.ID_OR_NAME, using="txtLpwd")
	private WebElement loginPassword;
	
	@FindBy(how=How.ID_OR_NAME, using="lst_Roles")
	private WebElement role;
	
	@FindBy(how=How.ID_OR_NAME, using="lst_Branch")
	private WebElement branch;
	
	@FindBy(how=How.ID_OR_NAME, using="BtnSubmit")
	private WebElement submit;
	
	@FindBy(how=How.ID_OR_NAME, using="btnreset")
	private WebElement reset;
	
	@FindBy(how=How.ID_OR_NAME, using="btnCancel")
	private WebElement cancel;
	
	public EmployeeCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fillEmployerName(String employerName) {
		this.employerName.sendKeys(employerName);
	}
	
	public void fillLoginPassword(String loginPassword) {
		this.loginPassword.sendKeys(loginPassword);
	}
	
	public void selectRole(String role) {
		new Select(this.role).selectByVisibleText(role);
	}
	
	public void selectBranch(String branch) {
		new Select(this.branch).selectByVisibleText(branch);
	}
	
	public void clickSubmit() {
		this.submit.click();
	}
	
	public void clickReset() {
		this.reset.click();
	}
	
	public void clickCancel() {
		this.cancel.click();
	}
	
	
	public void fillEmployeeCreationForm(String employerName, String loginPassword, String role, String branch) {
		this.fillEmployerName(employerName);
		this.fillLoginPassword(loginPassword);
		this.selectRole(role);
		this.selectBranch(branch);
	}
	
}
