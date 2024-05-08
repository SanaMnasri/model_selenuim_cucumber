package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how = How.ID, using = "Email")
public static WebElement username;
	@FindBy(how = How.ID, using = "Password")
public static WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
public static WebElement Btnlogin;
	
}
