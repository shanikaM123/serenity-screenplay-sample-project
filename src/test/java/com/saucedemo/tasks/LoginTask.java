package com.saucedemo.tasks;

import org.openqa.selenium.Keys;

import com.saucedemo.pages.LoginPage;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LoginTask implements Task
{
	
	private String username;
	private String password;
	@Override
	public <T extends Actor> void performAs(T actor) 
	{
		actor.attemptsTo(Enter.theValue(username).into(LoginPage.USERNAME));
		actor.attemptsTo(Enter.theValue(password).into(LoginPage.PASSWORD));
		actor.attemptsTo(Click.on(LoginPage.LOGIN_BUTTON));
	
		
	}
	
	public LoginTask(String username, String password) {
		this.username = username;
		this.password = password;
		}
	
	public static Task withCredentials(String username, String password) 
	{
		return Instrumented
		.instanceOf(LoginTask.class)
		.withProperties(username, password);
	}

	

}
