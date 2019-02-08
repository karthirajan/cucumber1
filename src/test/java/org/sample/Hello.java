package org.sample;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;

public class Hello {
   static WebDriver d;
@Given("The user page")
public void the_user_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-17\\Downloads\\eclipse\\karthi\\cucumber1\\driver\\chromedriver.exe");
    d=new ChromeDriver();
    d.get("http://demo.guru99.com/insurance/v1/index.php");
}

@Given("The user click register to create the form")
public void the_user_click_register_to_create_the_form() {
	d.findElement(By.xpath("//a[text()='Register']")).click();
    
}



@When("The user-one fill in the form details")
public void the_user_one_fill_in_the_form_details(DataTable insDetails) {
	Map<String, String> insDetails1 = insDetails.asMap(String.class, String.class);
	d.findElement(By.id("user_firstname")).sendKeys(insDetails1.get("d1"));
	  d.findElement(By.id("user_surname")).sendKeys(insDetails1.get("d2"));
	  d.findElement(By.id("user_phone")).sendKeys(insDetails1.get("d3"));
	  WebElement dob = d.findElement(By.id("user_dateofbirth_1i"));
	  Select s=new Select(dob);
	   s.selectByValue("1994");
	   WebElement dob1 = d.findElement(By.id("user_dateofbirth_2i"));
	  	Select s1=new Select(dob1);
	    s1.selectByValue("6");
	    WebElement dob2 = d.findElement(By.id("user_dateofbirth_3i"));
	  	Select s2=new Select(dob2);
	     s2.selectByValue("7");
	  d.findElement(By.id("user_address_attributes_street")).sendKeys(insDetails1.get("d4"));
	  d.findElement(By.id("user_address_attributes_city")).sendKeys(insDetails1.get("d4"));
	  d.findElement(By.id("user_address_attributes_county")).sendKeys(insDetails1.get("d5"));
	  d.findElement(By.id("user_address_attributes_postcode")).sendKeys(insDetails1.get("d6"));
	  d.findElement(By.id("user_user_detail_attributes_email")).sendKeys(insDetails1.get("d7"));
	  d.findElement(By.id("user_user_detail_attributes_password")).sendKeys(insDetails1.get("d8"));
	  d.findElement(By.id("user_user_detail_attributes_password_confirmation")).sendKeys(insDetails1.get("d8"));
}

@When("The user-one submits the form")
public void the_user_one_submits_the_form() {
    d.findElement(By.name("submit")).click();
}

@Then("The customer should see the id and password is generated")
public void the_customer_should_see_the_id_and_password_is_generated() {
	Assert.assertTrue(d.findElement(By.xpath("//input[@autofocus='autofocus']")).isDisplayed());
}

}
