package at3
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


class LoginOKStepDefs {
	@Given("I am at the login page")
	def i_am_at_the_login_page() {
		Mobile.startApplication('E:\\Aulas\\3 Ano 1 Semestre\\TAES\\Projeto\\project\\app\\build\\outputs\\apk\\debug\\app-debug.apk',
			false)
		
		Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)
		
		Mobile.tap(findTestObject('AT3 Objects/android.widget.CheckedTextView0 - Login'), 0)
		
		
	}
	
	@When("I provide the correct login fields")
	def i_provide_the_correct_login_fields() {
		Mobile.setText(findTestObject('AT3 Objects/android.widget.EditText0 - E-mail'), 'email@gmail.com', 0)
		
		Mobile.setText(findTestObject('AT3 Objects/android.widget.EditText0 - Password'), '123456', 0)
		
		
	}
	
	@Then("I login to my account")
	def i_login_to_my_account() {
		Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Login Button'), 0)
		
		Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)
		
		Mobile.verifyElementExist(findTestObject('AT3 Objects/android.widget.TextView0 - emailgmail.com'), 0)
		
		Mobile.closeApplication()
	}
}