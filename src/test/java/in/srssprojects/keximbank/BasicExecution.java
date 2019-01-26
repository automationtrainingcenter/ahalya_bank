package in.srssprojects.keximbank;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasicExecution extends TestExecution{
	@BeforeClass
	public void testlaunchBrowser() {
		launchBrowser("chrome", "http://srssprojects.in");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
