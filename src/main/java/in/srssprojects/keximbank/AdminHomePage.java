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
	@FindBy(how = How.XPATH, using = "")
	private WebElement homeButton;
	
	//change password
	@FindBy(how = How.XPATH, using = "")
	private WebElement changePassword;
	
	//logout button
	@FindBy(how = How.XPATH, using = "")
	private WebElement logout;
	
	//branches
	@FindBy(how = How.XPATH, using = "")
	private WebElement branches;
	
	//roles
	@FindBy(how = How.XPATH, using = "")
	private WebElement roles;
	
	//employees
	@FindBy(how = How.XPATH, using = "")
	private WebElement employees;
	
	//users
	@FindBy(how = How.XPATH, using = "")
	private WebElement users;
	
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

}
