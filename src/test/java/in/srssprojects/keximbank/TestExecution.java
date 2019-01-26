package in.srssprojects.keximbank;

import org.testng.annotations.Test;

public class TestExecution extends BaseClass{
	
	
	@Test(priority=0)
	public void loginTest() {
		bankHomePage.fillUsernam("Admin");
		bankHomePage.fillPassword("Admin");
		bankHomePage.clickLoginButton();
	}
	
	
	@Test(priority = 15)
	public void logoutTest() {
		adminHomePage.clickLogout();
	}
	
	@Test(priority = 1)
	public void roleCreationWithValidData() {
		adminHomePage.clickRoles();
		roleDetailsPage.clickNewRole();
		roleCreationPage.fillRoleName("managerOne");
		roleCreationPage.fillRoleDescription("manager one");
		roleCreationPage.selectRoletype("E");
		roleCreationPage.clickSubmit();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}

}
