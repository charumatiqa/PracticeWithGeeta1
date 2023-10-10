package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;




public class RegisterPage extends BasePage {
	
	
	


	WebDriver driver;

	
	public RegisterPage(WebDriver driver){
		
		this.driver = driver;
	}
	
//	List of Elements
	
	@FindBy(how=How.XPATH,using="//a[@class='ico-register']")
	WebElement registerField;
    @FindBy(how=How.ID,using="gender-female")
    WebElement selectGender;
	@FindBy(how=How.ID,using="FirstName")
	WebElement firstName;
	@FindBy(how=How.ID,using="LastName")
	WebElement lastName;
//	@FindBy(how=How.XPATH,using="//div[@class='inputs date-of-birth']")
//	WebElement dateOfBirthField;
	@FindBy(how=How.NAME,using="DateOfBirthDay")
	WebElement birthDay;
	@FindBy(how=How.NAME,using="DateOfBirthMonth") 
	WebElement birthMonth;
	@FindBy(how=How.NAME,using="DateOfBirthYear")
	WebElement birthYear;
	@FindBy(how=How.ID,using="Email")
	WebElement emailElement ;
	@FindBy(how=How.ID,using="Company")
	WebElement comapanyElement;
	@FindBy(how=How.ID,using="Newsletter")
	WebElement NewsletterElement;
	@FindBy(how=How.ID,using="Password")
	WebElement passwordElement;
	@FindBy(how=How.ID,using="ConfirmPassword")
	WebElement confirmpasswordElement;
	@FindBy(how=How.ID,using="register-button")
	WebElement registerbutton;
	@FindBy(how=How.XPATH,using="//div[@class='result']")
	WebElement registrationsuccessful;
	
	
//	Your registration completed
	
	
	
    public void findAndClickRegisterField( ) {
	
		registerField.click();
		
	}

	public void findAndClickGender( ) {
		selectGender.click();
	}


	public void insertFirstname(String firstname) {
	firstName.sendKeys(firstname+generateRandomNum(999));
	}

	
	public void insertLastname(String lastname) {
        lastName.sendKeys(lastname+generateRandomNum(999));
	}


	public void DateOfBirth () {
		
	WebElement	dayofbirth =driver.findElement((By.name("DateOfBirthDay")));
	WebElement	dayofmonth =driver.findElement((By.name("DateOfBirthMonth")));
	WebElement	birthyear =driver.findElement((By.name("DateOfBirthYear")));
	
	   RegisterPage seleDay = new RegisterPage(driver);
	   seleDay.selectFromDropdown(dayofbirth, "21");
	   seleDay.selectFromDropdown(dayofmonth, "May");
	   seleDay.selectFromDropdown(birthyear, "1983");
	   
	   
	}
	
	   
	public void insertemail(String email) {
		emailElement.sendKeys(generateRandomNum(9999) + email);
	}
	
	public void insertCompanyName(String company) {
		comapanyElement.sendKeys(company+generateRandomNum(999));
	}
	
	public void findNewsLetter( ) {
		NewsletterElement.click();
	}
	   
	public void insertPassword(String password) {
		passwordElement.sendKeys(password);
}
	
	public void confirmPassword(String confirmPassw) {
		confirmpasswordElement.sendKeys(confirmPassw);
}
	
	public void clickRegisterButton( ) {
		registerbutton.click();
	}

	public void userWasAbleToRegister(String expectedText ) {
		Assert.assertEquals(registrationsuccessful.getText(), expectedText, "page not found");
	
		}
	

}



	


		

