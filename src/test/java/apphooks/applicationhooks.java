package apphooks;

import com.qa.base.baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class applicationhooks {

	// for before and after class execution purpose.
	// launch browser and closing application

	private baseclass bc;
	// private WebDriver driver;

	
	@Before
	public void launchbrowser() {
		bc = new baseclass();
		bc.setupbrowser();
	}

	@After
	public void quitbrowser() {

		bc.teardown();
	}
}
