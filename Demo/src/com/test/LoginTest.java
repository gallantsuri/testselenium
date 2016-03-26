package com.test;

import static org.junit.Assert.fail;

// JSON, XML --- w3schools.com
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://gmail.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testUntitled() throws Exception {
		driver.get(baseUrl);
		Boolean isRegression = true;

		// invalid Email,invalid passed
		// login("pranavs", "sama");

		// invalid Email,valid passwd

		login("pranav", "pranavtesting");

		// Blank Email, Blank passwd

		// login("", "");

		// valid Email, blank passwd
		// login("pranavselenium", "");

		// Blank Email,valid passwd
		login("", "pranavtesting");

		// valid Email, invalid passwd
		login("pranavselenium", "123");

		// invalid Email,invalid passwd
		login("123", "sama");

		// Valid Email,Passwd
		login("pranavselenium", "pranavtesting");
	}

	// }

	private void login(String userName, String password) throws Exception {
		String errMsg = null;
		// String expectedMsg =
		// "The email or password you entered is incorrect. ?";
		String expectedMsg = new String();
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Passwd")).clear();
		driver.findElement(By.id("Passwd")).sendKeys(password);
		// driver.findElement(By.id("PersistentCook32ie")).click(); //
		
		driver.findElement(By.xpath("//input[@id='PersistentCookie']")).click();
		driver.findElement(By.id("signIn")).click();
		
		if (isElementPresent(By.cssSelector(".error-msg"))) {
			errMsg = driver.findElement(By.cssSelector(".error-msg")).getText();
		}

		if (errMsg == null) {
			System.out.println("UserName: " + userName);
			System.out.println("Password: " + password);
			System.out.println("Login Success");
		} else {
			System.out.println("User Name " + userName);
			System.out.println("Password " + password);
			System.out.println("Login Fail");
			System.out.println("Error Message is :" + errMsg);
		}

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	// check if element is present return true else false.
	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
