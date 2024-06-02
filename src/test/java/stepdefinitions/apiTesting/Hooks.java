package stepdefinitions.apiTesting;


import apiTesting.utils.HelperClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.testng.log4testng.Logger;


/* Create the hook class that contains the Before and After hook to initialize the web browser and close the web browser. 
 * I have added the code to take the screenshot of the failed scenario in @After Hook.
*/


public class Hooks {

    private static final Logger logging = Logger.getLogger(Hooks.class);
	 @BeforeClass
	 public static void setup() {
	        System.out.println("Ran the before");
	 }
	
	@Before("@ApiTesting")
    //hooks run before the first step of each scenario
	public static void setUp() {

    }


 
    @After("@ApiTesting")
    // hooks run after the last step of each scenario, even when the step result is failed, undefined, pending, or skipped.
    // The scenario parameter is optional. If you use it, you can inspect the status of the scenario.
    public void tearDown(Scenario scenario) {
        Response response = HelperClass.getApiResponse();
        //validate if scenario has failed
        scenario.attach(response.getBody().asString(), "text/plain", "API Response");
    }
	
}
