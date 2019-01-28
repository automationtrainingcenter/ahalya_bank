package in.srssprojects.keximbank;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExecution extends BaseClass{
	
	
	@Test(priority=0, groups = {"role", "branch", "employee", "create", "reset", "cancel","search","clear"})
	public void loginTest() {
		bankHomePage.fillUsernam("Admin");
		bankHomePage.fillPassword("Admin");
		bankHomePage.clickLoginButton();
	}
	
	
	@Test(priority = 18, groups = {"role","branch","employee", "create", "reset", "cancel","search","clear"})
	public void logoutTest() {
		adminHomePage.clickLogout();
	}
	
	@Test(priority = 1, groups= {"role", "create"})
	public void roleCreationWithValidData() {
		adminHomePage.clickRoles();
		roleDetailsPage.clickNewRole();
		roleCreationPage.fillRoleCreation("managerOne", "manager one", "E");
		roleCreationPage.clickSubmit();
		System.out.println(acceptAlert());
	}
	
	@Test(priority = 2,groups = {"role", "create"}, dependsOnMethods = {"roleCreationWithValidData"})
	public void roleCreationWithDuplicateData() {
		adminHomePage.clickRoles();
		roleDetailsPage.clickNewRole();
		roleCreationPage.fillRoleCreation("managerOne", "manager one", "E");
		roleCreationPage.clickSubmit();
		System.out.println(acceptAlert());
	}
	
	
	@Test(priority = 3, groups = {"role", "create"})
	public void roleCreationWithBlankData() {
		adminHomePage.clickRoles();
		roleDetailsPage.clickNewRole();
		roleCreationPage.clickSubmit();
		System.out.println(acceptAlert());
	}

	
	@Test(priority = 4, groups = {"role", "reset"})
	public void roleCreationReset() {
		adminHomePage.clickRoles();
		roleDetailsPage.clickNewRole();
		roleCreationPage.fillRoleCreation("managerOne", "manager one", "E");
		roleCreationPage.clickReset();
	}
	
	@Test(priority = 5, groups = {"role", "cancel"})
	public void roleCreationCancel() {
		adminHomePage.clickRoles();
		roleDetailsPage.clickNewRole();
		roleCreationPage.fillRoleCreation("managerOne", "manager one", "E");
		roleCreationPage.clickCancel();
		
	}
	
	@Test(priority = 6, groups = {"branch", "create"})
	public void branchCreationWithValidData() {
		adminHomePage.clickBranches();
		branchDetailsPage.clickNewBranch();
		branchCreationPage.fillBranchCreationForm("branchxyz", "lingampally", "52100", "INDIA", "GOA", "GOA");
		branchCreationPage.clickSubmit();
		System.out.println(acceptAlert());
	}
	
	@Test(priority = 7, groups = {"branch", "create"})
	public void branchCreationWithDuplicateData() {
		adminHomePage.clickBranches();
		branchDetailsPage.clickNewBranch();
		branchCreationPage.fillBranchCreationForm("branchxyz", "lingampally", "52100", "INDIA", "GOA", "GOA");
		branchCreationPage.clickSubmit();
		System.out.println(acceptAlert());
	}
	
	@Test(priority = 8, groups = {"branch", "create"})
	public void branchCreationWithBlankData() {
		adminHomePage.clickBranches();
		branchDetailsPage.clickNewBranch();
		branchCreationPage.clickSubmit();
		System.out.println(acceptAlert());
	}
	
	@Test(priority = 9, groups = {"branch", "reset"})
	public void branchCreationReset() {
		adminHomePage.clickBranches();
		branchDetailsPage.clickNewBranch();
		branchCreationPage.fillBranchCreationForm("branchxyz", "lingampally", "52100", "INDIA", "GOA", "GOA");
		branchCreationPage.clickReset();
	}
	
	@Test(priority = 10, groups = {"branch", "cancel"})
	public void branchCreationCancel() {
		adminHomePage.clickBranches();
		branchDetailsPage.clickNewBranch();
		branchCreationPage.clickCancel();
	}
	
	@Test(priority = 11, groups = {"employee", "create"})
	public void employeeCreationWithValidData() {
		adminHomePage.clickEmployees();
		employeeDetailsPage.clickNewEmployee();
		employeeCreationPage.fillEmployeeCreationForm("ahalya", "password", "managerOne", "branchxyz");
		employeeCreationPage.clickSubmit();
		System.out.println(acceptAlert());
	}
	
	
	@Test(priority = 12, groups = {"employee", "create"})
	public void employeeCreationWithDuplicateData() {
		adminHomePage.clickEmployees();
		employeeDetailsPage.clickNewEmployee();
		employeeCreationPage.fillEmployeeCreationForm("ahalya", "password", "managerOne", "branchxyz");
		employeeCreationPage.clickSubmit();
		System.out.println(acceptAlert());
	}
	
	@Test(priority = 13, groups = {"employee", "create"})
	public void employeeCreationWithBlankData() {
		adminHomePage.clickEmployees();
		employeeDetailsPage.clickNewEmployee();
		employeeCreationPage.clickSubmit();
		System.out.println(acceptAlert());
	}
	
	@Test(priority = 14, groups = {"employee", "reset"})
	public void employeeCreationReset() {
		adminHomePage.clickEmployees();
		employeeDetailsPage.clickNewEmployee();
		employeeCreationPage.fillEmployeeCreationForm("ahalya", "password", "managerOne", "branchxyz");
		employeeCreationPage.clickReset();
		System.out.println(acceptAlert());
	}
	
	@Test(priority = 15, groups = {"employee", "cancel"})
	public void employeeCreationCacel() {
		adminHomePage.clickEmployees();
		employeeDetailsPage.clickNewEmployee();
		employeeCreationPage.clickCancel();
	}
	
	@Test(priority = 16,groups = {"search"})
	public void branchSearch() {
		branchDetailsPage.clickSearch();
	}
	
	@Test(priority = 17,groups = {"clear"})
	public void branchClear() {
		branchDetailsPage.clickClear();
	}
	
	
}
