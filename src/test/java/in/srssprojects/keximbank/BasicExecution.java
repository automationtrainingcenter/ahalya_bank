package in.srssprojects.keximbank;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasicExecution extends TestExecution{
	@BeforeClass(groups = {"dd", "role","branch","employee", "create", "reset", "cancel","search","clear"})
	public void testlaunchBrowser() {
		launchBrowser("chrome", "http://srssprojects.in");
	}
	
	@AfterClass(groups = {"dd", "role","branch","employee", "create", "reset", "cancel","search","clear"})
	public void closeBrowser() {
		driver.close();
	}
}
