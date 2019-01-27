package in.srssprojects.keximbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationPage {
	WebDriver driver;

	@FindBy(how = How.ID_OR_NAME, using = "txtbName")
	private WebElement branchName;

	@FindBy(how = How.ID_OR_NAME, using = "txtAdd1")
	private WebElement address;

	@FindBy(how = How.ID_OR_NAME, using = "txtZip")
	private WebElement zipcode;

	@FindBy(how = How.ID_OR_NAME, using = "lst_counrtyU")
	private WebElement country;

	@FindBy(how = How.ID_OR_NAME, using = "lst_stateI")
	private WebElement state;

	@FindBy(how = How.ID_OR_NAME, using = "lst_cityI")
	private WebElement city;

	@FindBy(how = How.ID_OR_NAME, using = "btn_insert")
	private WebElement submit;

	@FindBy(how = How.ID_OR_NAME, using = "Btn_Reset")
	private WebElement reset;

	@FindBy(how = How.ID_OR_NAME, using = "Btn_cancel")
	private WebElement cancel;

	public BranchCreationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fillBranchName(String branchName) {
	this.branchName.sendKeys(branchName);
	}
	
	public void fillAddress(String address) {
		this.address.sendKeys(address);
	}
	
	public void fillZipcode(String zipcode) {
		this.zipcode.sendKeys(zipcode);
	}
	
	public void selectCountry(String country) {
		new Select(this.country).selectByVisibleText(country);
	}
	
	public void selectState(String state) {
		new Select(this.state).selectByVisibleText(state);
	}
	
	public void selectCity(String city) {
		new Select(this.city).selectByVisibleText(city);
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
	
	//fill branch creation form
	public void fillBranchCreationForm(String branchName, String address, String zipcode, String country, String state, String city) {
		this.fillBranchName(branchName);
		this.fillAddress(address);
		this.fillZipcode(zipcode);
		this.selectCountry(country);
		this.selectState(state);
		this.selectCity(city);
	}
}
