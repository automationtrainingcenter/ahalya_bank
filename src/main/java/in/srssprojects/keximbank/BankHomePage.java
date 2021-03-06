package in.srssprojects.keximbank;
//this class implementing using page object model

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BankHomePage {
	WebDriver driver;

	// username
	public WebElement username() {
		return driver.findElement(By.id("txtuId"));
	}

	// password
	public WebElement password() {
		return driver.findElement(By.id("txtPword"));
	}

	// login button
	public WebElement loginButton() {
		return driver.findElement(By.id("login"));
	}

	public BankHomePage(WebDriver driver) {
		this.driver = driver;
	}

	// fill username
	public void fillUsernam(String username) {
		this.username().sendKeys(username);
	}

	// fill password
	public void fillPassword(String password) {
		this.password().sendKeys(password);
	}

	// click login button
	public void clickLoginButton() {
		this.loginButton().click();
	}

	public boolean verifyBankHomePage() {
		return this.loginButton().isDisplayed();
	}

}
