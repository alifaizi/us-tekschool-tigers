package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import core.BaseClass;
import utilities.UtilsClass;

public class DataTablePageObj extends BaseClass {

	public DataTablePageObj() {

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement registerLink;
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	@FindBy(id = "input-email")
	private WebElement emailField;
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	@FindBy(id = "input-password")
	private WebElement passwordField;
	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordField;
	@FindBy(xpath = "//input[@value='1' and @name='newsletter']")
	private WebElement yesNewsLetter;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicyCheckBox;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement successMessage;


	public void clickOnRegisterLink() {
		registerLink.click();
	}
	public void enterFirstName(String firstname) {
		firstNameField.sendKeys(firstname);
	}
	public void enterLastName(String lastname) {
		lastNameField.sendKeys(lastname);
	}
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	public void enterTelephone(String telephone) {
		telephoneField.sendKeys(telephone);
	}
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	public void enterConfirmPassword(String confirmpassword) {
		confirmPasswordField.sendKeys(confirmpassword);
	}
	public void clickOnYesNewsLetterRadioButton() {
		UtilsClass.clickOnRadioButton(yesNewsLetter);
	}
	public void clickOnPrivacyPolicyCheckBox() {
		UtilsClass.clickOnCheckBoxButton(privacyPolicyCheckBox);
	}
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public String getAccountCreatedMessageFromUI() {
		String actualMessage = successMessage.getText();
		return actualMessage;
	}

}
