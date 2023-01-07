package org.food;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.stepdefinition.foodtruck;

public class foodcreate extends foodtruck {
	
	public foodcreate() {
		
	}
	@FindBy(xpath = "//i[@class='fa fa fa-user']")
	private WebElement btn ;
	public WebElement getBtn() {
		return btn;
	}
}