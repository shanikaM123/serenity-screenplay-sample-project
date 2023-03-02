package com.saucedemo.tests;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.saucedemo.questions.AppLogoVisible;
import com.saucedemo.questions.BreadcrumViewVisible;

import com.saucedemo.tasks.LogOutTask;
import com.saucedemo.tasks.LoginTask;

import io.cucumber.java.Before;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.*;


@RunWith(SerenityRunner.class)
public class LoginTest 
{
	@CastMember(name = "standardUser")
    private Actor standardUser;
	
	@Managed
	private WebDriver browser;
	
	@Before
	public void userCanOpenTheBrowser()
	{
		standardUser.can(BrowseTheWeb.with(browser));
	}
	
	@Test
	public void userLoginAndRedirectToHomePageAndLogOut()
	{
		standardUser.attemptsTo(Open.browserOn(). thePageNamed("pages.sauceDemo"));
		givenThat(standardUser).attemptsTo(
				LoginTask.withCredentials("standard_user", "secret_sauce"));
		then(standardUser).should(seeThat(AppLogoVisible.displayed(),CoreMatchers.equalTo("Swag Labs"))); //Assertion
		and(standardUser).should(seeThat(BreadcrumViewVisible.displayed(),CoreMatchers.equalTo("")));
		then(standardUser).attemptsTo(LogOutTask.logOut());
		
	}

}
