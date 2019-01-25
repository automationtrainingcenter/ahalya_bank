package in.srssprojects.keximbank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BranchDetailsPage {
	WebDriver driver;
	
	@FindBy(how=How.ID_OR_NAME, using="BtnNewBR")
	private WebElement newBranch;
	
	@FindBy(how=How.ID_OR_NAME, using="lst_countryS")
	private WebElement country;
	
	@FindBy(how=How.ID_OR_NAME, using="lst_stateS")
	private WebElement state;
	
	@FindBy(how=How.ID_OR_NAME, using="lst_cityS")
	private WebElement city;
	
	@FindBy(how=How.ID_OR_NAME, using="btn_search")
	private WebElement search;
	
	@FindBy(how=How.ID_OR_NAME, using="btn_clsearch")
	private WebElement clear;
	
	
	public BranchDetailsPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
	public void clickNewBranch() {
	this.newBranch.click();
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
	
	public void clickSearch() {
		this.search.click();
	}
	
	public void clickClear() {
		this.clear.click();
	}
	

}

