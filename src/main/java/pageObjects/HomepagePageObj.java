package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.BaseClass;

import utilities.UtilsClass;

public class HomepagePageObj extends BaseClass {

	public HomepagePageObj() {

		PageFactory.initElements(driver, this);
	} 

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopLink;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNotebooks;

	@FindBy(xpath = "//a[text()='Components']")
	private WebElement componentsLink;

	@FindBy(xpath = "//a[text()='Tablets']")
	private WebElement tabletsLink;

	@FindBy(xpath = "//a[text()='Software']")
	private WebElement softwareLink;

	@FindBy(xpath = "//a[text()='Phones & PDAs']")
	private WebElement phonesAndPDAsLink;

	@FindBy(xpath = "//a[text()='Cameras']")
	private WebElement camerasLink;

	@FindBy(xpath = "//a[text()='MP3 Players']")
	private WebElement mP3PlayerLink;

	public void campareTextdesktopLink(String expectedText) {
		String actualText = UtilsClass.getTextFromUI(desktopLink);
		Assert.assertEquals(expectedText, actualText);
	}

	public void campareTextlaptopsAndNotebooks(String expectedText) {
		String actualText = UtilsClass.getTextFromUI(laptopsAndNotebooks);
		Assert.assertEquals(expectedText, actualText);
	}

	public void campareTextcomponentsLink(String expectedText) {
		String actualText = UtilsClass.getTextFromUI(componentsLink);
		Assert.assertEquals(expectedText, actualText);
	}

	public void campareTexttabletsLink(String expectedText) {
		String actualText = UtilsClass.getTextFromUI(tabletsLink);
		Assert.assertEquals(expectedText, actualText);
	}

	public void campareTextsoftwareLink(String expectedText) {
		String actualText = UtilsClass.getTextFromUI(softwareLink);
		Assert.assertEquals(expectedText, actualText);
	}

	public void campareTextphonesAndPDAsLink(String expectedText) {
		String actualText = UtilsClass.getTextFromUI(phonesAndPDAsLink);
		Assert.assertEquals(expectedText, actualText);
	}

	public void campareTextcamerasLink(String expectedText) {
		String actualText = UtilsClass.getTextFromUI(camerasLink);
		Assert.assertEquals(expectedText, actualText);
	}

	public void campareTextmP3PlayerLink(String expectedText) {
		String actualText = UtilsClass.getTextFromUI(mP3PlayerLink);
		Assert.assertEquals(expectedText, actualText);
	}

}
