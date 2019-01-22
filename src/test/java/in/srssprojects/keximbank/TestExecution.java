package in.srssprojects.keximbank;

public class TestExecution extends BaseClass{
	
	public void loginTest() {
		bankHomePage.fillUsernam("Admin");
		bankHomePage.fillPassword("Admin");
		bankHomePage.clickLoginButton();
	}
	
	public void logoutTest() {
		adminHomePage.clickLogout();
	}

}
