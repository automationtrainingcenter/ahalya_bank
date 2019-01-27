package in.srssprojects.keximbank;

import org.openqa.selenium.WebDriver;
//this class implementing using page factory
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
	
	WebDriver driver;
	
	//home
	@FindBy(how = How.XPATH, using = "//a[@href='adminflow.aspx']")
	private WebElement homeButton;
	
	//change password
	@FindBy(how = How.XPATH, using = "//img[@id='IMG1']")
	private WebElement changePassword;
	
	//logout button
	@FindBy(how = How.XPATH, using = "//a[@href='home.aspx']")
	private WebElement logout;
	
	//branches
	@FindBy(how = How.XPATH, using = "//a[@href='admin_banker_master.aspx']")
	private WebElement branches;
	
	//roles
	@FindBy(how = How.XPATH, using = "//a[@href='Admin_Roles_details.aspx']")
	private WebElement roles;
	
	//employees
	@FindBy(how = How.XPATH, using = "//a[@href='userdetails.aspx']")
	private WebElement users;
	
	//users
	@FindBy(how = How.XPATH, using = "//a[@href='Admin_Emp_details.aspx']")
	private WebElement employees;
	
	public AdminHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickHome() {
		this.homeButton.click();
	}
	
	public void clickChangePassword() {
		this.changePassword.click();
	}
	
	public void clickLogout() {
		this.logout.click();
	}
	
	
	public void clickBranches() {
		this.branches.click();
	}
	
	public void clickRoles() {
		this.roles.click();
	}
	
	public void clickEmployees() {
		this.employees.click();
	}
	
	public void clickUsers() {
		this.users.click();
	}
	
	public boolean verifyAdminHomePage() {
		return driver.getCurrentUrl().contains("adminflow");
	}

}
