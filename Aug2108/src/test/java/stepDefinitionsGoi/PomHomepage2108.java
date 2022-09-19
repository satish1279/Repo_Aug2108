package stepDefinitionsGoi;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import driverFactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pagesGoi.Homepage2108;
import pagesGoi.Login2108;

public class PomHomepage2108 {

	private Login2108 login= new Login2108(DriverFactory.getDriver());

	private Homepage2108 homepage= new Homepage2108(DriverFactory.getDriver());


	@Given("^User is already logged into the application$")
	public void alreadyLoggedIn(DataTable dataTable) {

		List<Map<String,String>> userCred=	dataTable.asMaps();
		String userName=userCred.get(0).get("Username");
		String password= userCred.get(0).get("Password");

		DriverFactory.getDriver().navigate().to("https://goinfinity.beyond360test.com/Account/Login");

		login.entrUsernam(userName);
		login.entrPassword(password);
		login.clikButon();

	}





	@Given("^User is on the Homepage$")
	public void hompagge() throws InterruptedException {
		Thread.sleep(8000);
		String Title= DriverFactory.getDriver().getTitle();
		System.out.println("page title is: "  +Title);


		Assert.assertTrue(Title.contains("Home"));

	} 

	@When ("^Clicks on Survey link$")
	public void surveyLink() throws InterruptedException {

		homepage.clikSurvey();
	}

	
}