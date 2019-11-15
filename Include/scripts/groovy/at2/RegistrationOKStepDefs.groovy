package at2
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.util.KeywordUtil


class RegistrationOKStepDefs {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("I am at the Registration Screen")
	def i_am_at_the_Registration_Screen() {
		
	}

	@When("I provide the correct fields")
	def i_provide_the_correct_fields() {
		Mobile.verifyElementExist(findTestObject('Registration Objects/android.widget.EditText0 - E-mail'), 0)
		
		Mobile.setText(findTestObject('Registration Objects/android.widget.EditText0 - E-mail'), 'email35@gmail.com', 0)
		
		Mobile.verifyElementExist(findTestObject('Registration Objects/android.widget.EditText0 - Password'), 0)
		
		Mobile.setText(findTestObject('Registration Objects/android.widget.EditText0 - Password'), 'password1!', 0)
		
		Mobile.verifyElementExist(findTestObject('Registration Objects/android.widget.EditText0 - Password confirmation'), 0)
		
		Mobile.setText(findTestObject('Registration Objects/android.widget.EditText0 - Password confirmation'), 'password1!', 0)

	}

	@Then("I successfully register and account")
	def i_successfully_register_and_account() {
		
		
		Mobile.verifyElementExist(findTestObject('Registration Objects/android.widget.Button0 - CREATE ACCOUNT'), 0)
		
		Mobile.tap(findTestObject('Registration Objects/android.widget.Button0 - CREATE ACCOUNT'), 0)
		
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		def toast = driver.findElementByXPath("//android.widget.Toast[@text='User created: email35@gmail.com']")
		println("Toast element: " + toast)
		if (toast == null) {
			KeywordUtil.markFailed('ERROR: Toast object not found!')
		}
		
		Mobile.closeApplication()
	}
}