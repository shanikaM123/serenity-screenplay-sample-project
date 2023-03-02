package com.saucedemo.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class LoginPage extends PageObject
{
	public static final Target USERNAME = Target.the("username").locatedBy("#user-name");
	public static final Target PASSWORD = Target.the("password").locatedBy("#password");
	public static final Target LOGIN_BUTTON = Target.the("login-button").locatedBy("#login-button");

}
