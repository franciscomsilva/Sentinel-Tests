package at14
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

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



class ProfileOKClearTwitterStepDefs {
	@When("I navigate to the profile tab")
	def i_navigate_to_the_profile_tab() {
		Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)
		Mobile.tap(findTestObject('Dashboard Objects/android.widget.ImageButton0 Lateral button'), 0)
		Mobile.verifyElementExist(findTestObject('AT14 Objects/Profile LatTab'), 0)
		Mobile.tap(findTestObject('AT14 Objects/Profile LatTab'), 0)
	}
	
	@When("I input my current password")
	def i_input_my_current_password() {
		Mobile.verifyElementExist(findTestObject('AT14 Objects/Current Password TextBox'), 0)
		Mobile.setText(findTestObject('AT14 Objects/Current Password TextBox'), 'password!1', 0)
		Mobile.verifyElementAttributeValue(findTestObject('AT14 Objects/Current Email'), 'text', 'testeprofile@gmail.com', 0)
	}
	
	@When("I check the clear twitter login checkbox")
	def i_check_the_clear_twitter_login_checkbox() {
		Mobile.verifyElementExist(findTestObject('AT14 Objects/CheckBox Clear Twitter Login'), 0)
		Mobile.checkElement(findTestObject('AT14 Objects/CheckBox Clear Twitter Login'), 0)
	}
	
	@Then("I clear my twitter login")
	def i_clear_my_twitter_login() {
		Mobile.verifyElementExist(findTestObject('AT14 Objects/SAVE Profile Changes'), 0)
		
		Mobile.tap(findTestObject('AT14 Objects/SAVE Profile Changes'), 0)
		
		Mobile.verifyElementExist(findTestObject('AT14 Objects/Success - Profile updated successfully'), 0)
		
		Mobile.verifyElementText(findTestObject('AT14 Objects/Success - Profile updated successfully'), 'Profile updated successfully')
		
		Mobile.tap(findTestObject('Dashboard Objects/android.widget.ImageButton0 Lateral button'), 0)
		
		Mobile.tap(findTestObject('AT14 Objects/Profile LatTab'), 0)
		
		Mobile.verifyElementNotExist(findTestObject('AT14 Objects/CheckBox Clear Twitter Login'), 2)
		
		Mobile.closeApplication()
	}
}