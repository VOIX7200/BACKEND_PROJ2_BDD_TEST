import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qa.client.RestClient;
import com.qa.extentReport.ExtentReportManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
 

public class DiscountServiceTest {
	RestClient restCl;
	String percentage;
	ExtentTest test;
	ExtentReports report;
	
	@Before
	public void setUp() {
		 
		report = ExtentReportManager.getReport();
		test = report.createTest("DiscountServiceTest");
	} 
	@After
	public void tearDown() {
		report.flush(); 
	}
	
	@Given("Execute DiscountService Business")
	public void execute_discount_service_business() throws InterruptedException {
		System.out.println("executing execute_discount_service_business ");
		test.log(Status.INFO,"Execute DiscountService Business");
		test.log(Status.INFO,"Calling RestClient");
		  restCl = new RestClient(); 
		  Thread.sleep(6000);
	}

	@When("if i enter {int}")
	public void if_i_enter(Integer int1) throws ClientProtocolException, IOException, InterruptedException {
		
		System.out.println("Calling getPercentage(int1)");
		test.log(Status.INFO,"Calling getPercentage(int1)");
		percentage= restCl.getPercentage(int1);
		 Thread.sleep(6000);
	}

	@Then("we should get ten percentage discount")
	public void we_should_get_ten_percentage_discount() throws InterruptedException {
		System.out.println("we should get ten percentage discount");
		test.log(Status.INFO,"we should get ten percentage discount");
	    String actual = percentage.split("\"")[1];
	    String expected  = "10%";
	    Assert.assertEquals(expected, actual);
	    test.log(Status.PASS,"we should get ten percentage discount");
	    Thread.sleep(6000);
	}
	
	@Then("we should get fifteen percentage discount")
	public void we_should_get_fifteen_percentage_discount() throws InterruptedException {
		System.out.println("we should get fifteen percentage discount");
		test.log(Status.INFO,"we should get fifteen percentage discount");
		 String actual = percentage.split("\"")[1];
		 String expected  = "15%";
		 Assert.assertEquals(expected, actual);
		 test.log(Status.PASS,"we should get fifteen percentage discount");
		 Thread.sleep(6000);
	}

	
	@Then("we should get eighteen percentage discount")
	public void we_should_get_eighteen_percentage_discount() throws InterruptedException {
		System.out.println("we should get eighteen percentage discount");
		test.log(Status.INFO,"we should get eighteen percentage discount");
		 String actual = percentage.split("\"")[1];
		 String expected  = "18%";
		 Assert.assertEquals(expected, actual);
		 test.log(Status.PASS,"we should get eighteen percentage discount");
		 Thread.sleep(6000);
	}
	
	@Then("we should get tweenty percentage discount")
	public void we_should_get_tweenty_percentage_discount() throws InterruptedException {
		System.out.println("we should get tweenty percentage discount");
		test.log(Status.INFO,"we should get tweenty percentage discount");
		 String actual = percentage.split("\"")[1];
		 String expected  = "20%";
		 Assert.assertEquals(expected, actual);
		 test.log(Status.PASS,"we should get tweenty percentage discount");
		 Thread.sleep(6000);
	}
	
	@Then("we should get NA percentage discount")
	public void we_should_get_NA_percentage_discount() throws InterruptedException {
		System.out.println("we should get NA percentage discount");
		test.log(Status.INFO,"we should get NA percentage discount");
		 String actual = percentage.split("\"")[1];
		 String expected  = "NA";
		 Assert.assertEquals(expected, actual);
		 test.log(Status.PASS,"we should get NA percentage discount");
		 Thread.sleep(6000);
	}
	
	
	 

	 


}
