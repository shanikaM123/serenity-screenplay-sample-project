package com.saucedemo.pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class HomePage extends PageObject
{
	public static final Target APP_LOGO = Target.the("cart-button").locatedBy(".app_logo");
	public static final Target BREADCRUM_BUTTON = Target.the("breadcrum-button").locatedBy("#react-burger-menu-btn");
	public static final Target PRODUCT_SORT_DROPDOWN = Target.the("productsort-dropdown").locatedBy(".product_sort_container");
	public static final Target LOGOUT = Target.the("logout").locatedBy("#logout_sidebar_link");
	

}
