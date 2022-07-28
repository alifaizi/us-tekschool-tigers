package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class SingleLoginPageObj extends BaseClass {

	public SingleLoginPageObj() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1//a[text()='TEST ENVIRONMENT']")
	private WebElement textFromUI;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountLink;

	@FindBy(xpath = "//li//a[text()='Login']")
	private WebElement loginLink;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement emailInputField;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordInputField;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButton;

	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountPage;

	public String getTextFromUI() {
		String testEnvironemntText = textFromUI.getText();
		return testEnvironemntText;
	}

	public void clickOnMyAccountLink() {
		myAccountLink.click();

	}

	public void clickOnLoginLink() {
		loginLink.click();
	}

	public void enterEmailAddress(String email) {
		emailInputField.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordInputField.sendKeys(password);
	}

	public String getMyAccountTextAfterLogin() {
		String myAccountText = myAccountPage.getText();
		return myAccountText;
	}

}
