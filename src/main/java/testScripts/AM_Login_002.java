package testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class AM_Login_002 extends BaseTest {

	@Test
	public void AM_Login_002() throws InterruptedException, IOException {

		LoginPage lp = new LoginPage(driver);
		lp.login("automationclass2018@gmail.com", "auto2018");

		HomePage hp = new HomePage(driver);
		hp.searchProduct("iphone 7");

		ProductPage pp = new ProductPage(driver);
		pp.productDiscription();

	}
}
