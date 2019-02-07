package in.srssprojects.keximbank;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class ParameterExecution extends TestExecution {

	@BeforeClass(groups = { "dd", "role", "branch", "employee", "create", "reset", "cancel", "search", "clear" })
	@Parameters({ "brName", "url" })
	public void launchBrowserTest(String browserName, String url) {
		launchBrowser(browserName, url);
	}

	@AfterClass(groups = { "dd", "role", "branch", "employee", "create", "reset", "cancel", "search", "clear" })
	public void closeBrowser() {
		driver.close();
	}

}
