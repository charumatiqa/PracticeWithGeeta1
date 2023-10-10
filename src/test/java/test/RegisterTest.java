package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.RegisterPage;
import util.BrowserFactory;

public class RegisterTest {

	WebDriver driver;
	String firstname = "Charu";
	String lastname = "Kalaghatagi";
	String email = "charumati_iak83@yahoo.com ";
	String company = "Techfios";
	String password = "Cnopecommerce123";
	String confirmpassw = "Cnopecommerce123";
	String expectedText = "Your registration completed";
	
	@Test
	
	public void validateUserShouldBeAbleToRegister() {

		driver = BrowserFactory.init();

		RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);

		registerPage.findAndClickRegisterField();
		registerPage.findAndClickGender();
		registerPage.insertFirstname(firstname);
		registerPage.insertLastname(lastname);
		registerPage.DateOfBirth();
		registerPage.insertemail(email);
		registerPage.insertCompanyName(company);
		registerPage.findNewsLetter();
		registerPage.insertPassword(password);
		registerPage.confirmPassword(confirmpassw);
		registerPage.clickRegisterButton();
		registerPage.userWasAbleToRegister(expectedText);
	}
}
