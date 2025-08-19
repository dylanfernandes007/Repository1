package testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.TestUtil;

public class AddCustomerTest extends BaseTest {

	
	@Test(dataProviderClass = TestUtil.class,dataProvider = "dp")
	public void addCustomer(String firstName, String lastName, String postCode) {
		
		click("addCustomer_CSS");     // This is a single-line comment
		type("firstName_CSS",firstName);
		type("lastName_CSS",lastName);
		type("postcode_CSS",postCode);
		click("addCustBtn_CSS");
		
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("Customer added successfully"),"Customer not added successfully !!!");
		alert.accept();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}
