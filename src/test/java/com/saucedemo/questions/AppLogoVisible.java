package com.saucedemo.questions;

import com.saucedemo.pages.HomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;

public class AppLogoVisible  implements Question<String>
{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(HomePage.APP_LOGO).answeredBy(actor);
		
	}
	
	
	public static Question<String> displayed() 
	{
		return new AppLogoVisible();
	}
	

}
