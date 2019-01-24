package in.srssprojects.keximbank;

/*
 * BranchDetailsPage
 * BranchCreationPage
 * EmployeeDetailsPage
 * EmployeeCreationPage
 */

public class TestExecution extends BaseClass{
	
	public void loginTest() {
		bankHomePage.fillUsernam("Admin");
		bankHomePage.fillPassword("Admin");
		bankHomePage.clickLoginButton();
	}
	
	public void logoutTest() {
		adminHomePage.clickLogout();
	}
	
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
