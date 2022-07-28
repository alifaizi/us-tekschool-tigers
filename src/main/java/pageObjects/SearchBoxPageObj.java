package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

public class SearchBoxPageObj extends BaseClass{
	
	public SearchBoxPageObj(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentText;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchBox;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement seachButton;
	
	@FindBy(xpath="//h1[text()='Search - Camera']")
	private WebElement seachCameraText;
	
	@FindBy(xpath="(//span[text()='Add to Cart'])[1]")
	private WebElement addToCart;

	public String getTestEnvironmentText() {
		String textFromRetailPage = testEnvironmentText.getText();
		return textFromRetailPage;
	}
	
	public void search(String element) {
		searchBox.sendKeys(element);
	}
	
	public void clickSeachButton() {
		seachButton.click();
	}
	
	public String getsearchCameraText() {
		String seachCamerTextFromUI = seachCameraText.getText();
		return seachCamerTextFromUI;
	}
	
	public void addItemToCart() {
		addToCart.click();
	}
}
