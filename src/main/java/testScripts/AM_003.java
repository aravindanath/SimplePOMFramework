package testScripts;

import org.testng.annotations.Test;

import pages.LoginPage;

public class AM_003 extends BaseTest {

	@Test
	public void AM_003() throws InterruptedException {
		LoginPage lp =  new LoginPage(driver);
		lp.login("AM_LG01");
		

	}

}
