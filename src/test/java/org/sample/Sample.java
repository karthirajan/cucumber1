package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Sample {
            static WebDriver d;
	@Given("The user is in telecom page")
	public void the_user_is_in_telecom_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-17\\Downloads\\eclipse\\karthi\\cucumber1\\driver\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("http://demo.guru99.com/telecom/");
	  
	}

	@Given("The user navigates to add customer page")
	public void the_user_navigates_to_add_customer_page() {
		d.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	   
	    
	}

	@When("The user fill in the form details")
	public void the_user_fill_in_the_form_details() {
		d.findElement(By.xpath("//label[@for='done']")).click();
		d.findElement(By.id("fname")).sendKeys("karthi");
		d.findElement(By.id("lname")).sendKeys("rajan");
		d.findElement(By.id("email")).sendKeys("kr@gmail.com");
		d.findElement(By.xpath("(//textarea[@placeholder='Enter your address'])")).sendKeys("tnjre");
		d.findElement(By.id("telephoneno")).sendKeys("63888899");
		
	   
	}

	@When("The user submits the form")
	public void the_user_submits_the_form() {
	    d.findElement(By.name("submit")).click();
	}

	@Then("The customer should see the id is generated")
	public void the_customer_should_see_the_id_is_generated() {
	   Assert.assertTrue(d.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}

}
