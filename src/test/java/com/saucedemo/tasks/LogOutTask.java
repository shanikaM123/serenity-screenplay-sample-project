package com.saucedemo.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;


import com.saucedemo.pages.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class LogOutTask implements Task
{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(HomePage.BREADCRUM_BUTTON));
		actor.attemptsTo(Click.on(HomePage.LOGOUT));
		/*
		 * actor.attemptsTo(WaitUntil.the(HomePage.LOGOUT,
		 * WebElementStateMatchers.isVisible()), Click.on(HomePage.LOGOUT))
		 */;
		
	}
	
	public static LogOutTask logOut() 
	{
		return instrumented(LogOutTask.class);
	}

}
