package stepdefination;

import com.qa.base.baseclass;
import com.qa.pages.homepage;
import com.qa.pages.loginpage;
import com.qa.util.Pageutils;
import com.qa.util.Propertyutils;

import io.cucumber.java.en.*;

public class NLoginsteps {

	baseclass bc = new baseclass();
	homepage hp;
	loginpage lp;

	@Given("User login with valid credentials")
	public void user_login_with_valid_credentials() {
		baseclass.getdriver().get(Propertyutils.getpropertydata("url"));

	}

	@When("use enters valid credentials and click on login button")
	public void use_enters_valid_credentials_and_click_on_login_button() throws InterruptedException {
		hp = new homepage();
		lp = new loginpage();
		hp.loginoperation();
		Thread.sleep(3000);;
		lp.loginentry(Propertyutils.getpropertydata("uname"), Propertyutils.getpropertydata("pwd"));

	}

	@Then("verify user is loggin in")
	public void verify_user_is_loggin_in() {
		lp = new loginpage();
		lp.validateloginbymsg();

	}

}

