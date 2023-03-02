package com.saucedemo.questions;

import com.saucedemo.pages.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

public class BreadcrumViewVisible implements Question<String>
{

	@Override
	public String answeredBy(Actor actor) {
		 return Value.of(HomePage.BREADCRUM_BUTTON).answeredBy(actor);
	}
	
	public static Question<String> displayed() 
	{
		return new BreadcrumViewVisible();
	}
	

}
