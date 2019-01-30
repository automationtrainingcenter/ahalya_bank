package in.srssprojects.keximbank;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class GridExecution extends TestExecution{
	
	@BeforeClass(groups = {"role","branch","employee", "create", "reset", "cancel","search","clear"})
	@Parameters({"brName", "url", "nodeURL"})
	public void launchBrowserTest(String browserName, String url, String nodeURL) {
		launchBrowser(browserName, url, nodeURL);
	}
	
	@AfterClass(groups = {"role","branch","employee", "create", "reset", "cancel","search","clear"})
	public void closeBrowser() {
		driver.close();
	}
	
}
