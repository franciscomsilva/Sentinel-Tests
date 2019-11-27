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


class RegistrationNotOkEmptyFieldsStepDefs {
	@When("I press Create Account button with empty fields")
	def i_press_Create_Account_button_with_empty_fields() {
		Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.EditText0 - E-mail'), 0)

		Mobile.tap(findTestObject('AT2 Objects/android.widget.Button0 - CREATE ACCOUNT'), 0)

		Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.TextView0 - Email field is mandatory'), 0)

		Mobile.setText(findTestObject('AT2 Objects/android.widget.EditText0 - E-mail'), 'email@gmail.com', 0)

		Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.EditText0 - Password'), 0)

		Mobile.tap(findTestObject('AT2 Objects/android.widget.Button0 - CREATE ACCOUNT'), 0)

		Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.TextView0 - Password field is mandatory'), 0)

		Mobile.setText(findTestObject('AT2 Objects/android.widget.EditText0 - Password'), 'password!1', 0)

		Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.EditText0 - Password confirmation'), 0)

		Mobile.tap(findTestObject('AT2 Objects/android.widget.Button0 - CREATE ACCOUNT'), 0)

		Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.TextView0 - Password confirmation field is mandatory'),
				0)
	}
}