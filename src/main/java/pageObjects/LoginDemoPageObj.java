package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class LoginDemoPageObj extends BaseClass{
	public LoginDemoPageObj(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//h1[text()='Community Powered Test Automation']")
	private WebElement mainLoginPage;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement userNameField;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordField;
	@FindBy(xpath = "//button[@id='login']")
	private WebElement loginBtn;
	@FindBy(xpath = "(//h1[text()='TestProject Example page'])[2]")
	private WebElement testProjectExamplePageText;
	@FindBy(xpath = "//button[@id='logout']")
	private WebElement logoutBtn;
	
	public String getLoginPageText() {
		String getTextFromMainLoginPage = mainLoginPage.getText();
		return getTextFromMainLoginPage;
	}
	public void enterUserName(String email) {
		userNameField.sendKeys(email);
	}
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	public String getTextAfterLogin() {
		String textAfterLogin = testProjectExamplePageText.getText();
		return textAfterLogin;
	}
	public void clickOnLogoutBtn() {
		logoutBtn.click();
	}
}


