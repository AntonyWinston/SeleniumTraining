package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.food.foodcreate;
import org.kin.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.*;
import cucumber.api.java.en.When;

public class foodtruck extends baseclass {

	foodcreate f;

	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
		launchBrowser();
		WindowMaximize();

	}

	@When("To validate in launnch url")
	public void to_validate_in_launnch_url() {
		launchUrl("https://bistrobitesdc.com/");

	}

	@Given("To click the acount button")
	public void to_click_the_acount_button() throws InterruptedException {

		WebElement btn = driver.findElement(By.xpath("//i[@class='fa fa fa-user']"));
		btn.click();

	}

	@Given("To valid to pass the username")
	public void to_valid_to_pass_the_username() {
		WebElement ph = driver.findElement(By.id("phone"));
		ph.sendKeys("9837827830");
	}

	@Given("to invalid pass the password")
	public void to_invalid_pass_the_password() {
		WebElement pas = driver.findElement(By.id("password"));
		pas.sendKeys("winston5654");
	}

	@Given("To click the login button")
	public void to_click_the_login_button() {
		WebElement clk = driver.findElement(By.xpath("(//button[@name='login'])[1]"));
		clk.click();

	}

	@Then("To invalid mobile number")
	public void to_invalid_mobile_number() {
		WebElement val = driver.findElement(By.xpath("//ul[@class='woocommerce-error']"));
		String text = val.getText();
		System.out.println(text);
	}

	@Given("that I am logged in as a user and on the home page")
	public void that_I_am_logged_in_as_a_user_and_on_the_home_page() {

		WebElement btn = driver.findElement(By.xpath("//i[@class='fa fa fa-user']"));
		btn.click();

		WebElement ph = driver.findElement(By.id("phone"));
		ph.sendKeys("7016401187");
		WebElement pas = driver.findElement(By.id("password"));
		pas.sendKeys("winston3076");
		WebElement clk = driver.findElement(By.xpath("(//button[@name='login'])[1]"));
		clk.click();
	}

	@Given("To see the “HOME” button on the page and click it.")
	public void to_see_the_HOME_button_on_the_page_and_click_it() throws InterruptedException {

		WebElement hm = driver.findElement(By.xpath("(//a[@href='https://bistrobitesdc.com'])[3]"));
		hm.click();
	}

	@Given("To see a dropdown labeled “Dosa”")
	public void to_see_a_dropdown_labeled_Dosa() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		Robot r = new Robot();
		for (int i = 0; i < 9; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

	}

	@Given("To click the dosa button")
	public void to_click_the_dosa_button() throws InterruptedException, AWTException {
		Thread.sleep(2000);

		WebElement j = driver.findElement(By.className("lte-item"));

		j.click();

	}

	@Given("To am logged in as a user and on the home page")
	public void to_am_logged_in_as_a_user_and_on_the_home_page_() {
		launchUrl("https://bistrobitesdc.com/");
	}

	@Given("To click the “Account” button")
	public void to_click_the_Account_button() {
		WebElement btnn = driver.findElement(By.xpath("//i[@class='fa fa fa-user']"));
		btnn.click();
	}

	@Given("To register a invalid name and phone number")
	public void to_register_a_invalid_name_and_phone_number() {
		WebElement nam = driver.findElement(By.id("name"));
		nam.sendKeys("winnie");

		WebElement mi = driver.findElement(By.id("email"));
		mi.sendKeys("rhiya@gmail.com");

		WebElement ph = driver.findElement(By.name("phone"));
		ph.sendKeys("9878987567");
	}

	@Given("To skil the conform password")
	public void to_skil_the_conform_password() {

		WebElement pa = driver.findElement(By.id("password_reg"));
		pa.sendKeys("pdjpiaj866");
	}

	@Given("To click the register button")
	public void to_click_the_register_button() {

		WebElement cc = driver.findElement(By.name("login"));
		cc.click();
	}

	@Then("Get the pop up")
	public void get_the_pop_up() {

		WebElement vall = driver.findElement(By.xpath("//ul[@class='woocommerce-error']"));
		String textt = vall.getText();
		System.out.println(textt);
	}

	@Given("To am logged in as a user and on the home page")
	public void to_am_logged_in_as_a_user_and_on_the_home_page() {
		launchUrl("https://bistrobitesdc.com/");

	}

	@Given("To click the “search” icon")
	public void to_click_the_search_icon() throws AWTException, InterruptedException {
		Thread.sleep(3000);
		WebElement ik = driver.findElement(By.xpath("(//a[@href='https://bistrobitesdc.com/itemlist'])[1]"));
		ik.click();

		
	}

	@Given("To search “Coke”")
	public void to_search_Coke() {
		WebElement uni = driver.findElement(By.xpath("//input[@type='search']"));
		uni.sendKeys("coke");

		WebElement pom = driver.findElement(By.xpath("//button[@type='submit']"));
		pom.click();

	}

	@Then("To check the dollar is “$ {double}”")
	public void to_check_the_dollar_is_$(Double double1) {

		WebElement iw = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[1]"));
		String ijo = iw.getText();
		System.out.println("price = " + ijo);
	}

	//

}
