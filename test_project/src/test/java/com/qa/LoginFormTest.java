package com.qa;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.visible;

public class LoginFormTest extends BaseTest {

	@Test(description = "Открытие формы логина с главной")
	public void checkOpeningLoginForm() {
		mainPage.logoShouldBe(visible);
		mainPage.openLoginForm();
		loginModalPage.checkDisplayingModalPage();
	}
}