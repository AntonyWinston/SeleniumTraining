package org.stepdefinition;

import org.kin.baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class doubles extends baseclass {

	@Given("To click the search icon")
	public void to_click_the_search_icon() {

		WebElement ik = driver.findElement(By.xpath("(//a[@href='https://bistrobitesdc.com/itemlist'])[1]"));
		ik.click();

		WebElement uni = driver.findElement(By.xpath("//input[@type='search']"));
		uni.sendKeys("omelet");

		WebElement pom = driver.findElement(By.xpath("//button[@type='submit']"));
		pom.click();
	}

	@Given("To find the omelet  and click it")
	public void to_find_the_omelet_and_click_it() {

		WebElement ij = driver.findElement(By.xpath("(//img[@width='480'])[2]"));
		ij.click();

	}

	@Given("To select the option of probability")
	public void to_select_the_option_of_probability() {

		WebElement hk = driver.findElement(By.xpath("//label[@for='top0']"));
		hk.click();

		WebElement ki = driver.findElement(By.xpath("//label[@for='top1']"));
		ki.click();

	}

	@Then("To select the dollar probability")
	public void to_select_the_dollar_probability() {

		WebElement ma = driver.findElement(By.id("priceshow"));
		String ty = ma.getText();
		System.out.println("price = " + ty);

	}

	//

	@Given("To logged in as a user and on the home page")
	public void to_logged_in_as_a_user_and_on_the_home_page() {

		launchUrl("https://bistrobitesdc.com/");

	}

	@Given("To Click the “Our Story” option")
	public void to_Click_the_Our_Story_option() {
		WebElement uk = driver.findElement(By.xpath("//a[@href='https://bistrobitesdc.com/aboutus']"));
		uk.click();

	}

	@Then("Check the spelling mistake")
	public void check_the_spelling_mistake() {
		WebElement unnit = driver.findElement(By.className("disc"));
		String ig = unnit.getText();
		System.out.println(ig);
	}

}
