package at6
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


import io.appium.java_client.AppiumDriver



class TwitterShareOKStepDefs {
	@When("I press the share button")
	def i_press_the_share_button() {
		Mobile.verifyElementExist(findTestObject('AT6 - Twitter Objects/android.widget.ImageButton0 Share button'), 0)
		
		Mobile.tap(findTestObject('AT6 - Twitter Objects/android.widget.ImageButton0 Share button'), 0)
		
		
	}
	
	@When("I authorize the app for twitter")
	def i_authorize_the_app_for_twitter() {
		Mobile.verifyElementExist(findTestObject('AT6 - Twitter Objects/android.widget.Button0 - Authorize app'), 0)
		
		Mobile.tap(findTestObject('AT6 - Twitter Objects/android.widget.Button0 - Authorize app'), 0)
		
		
	}
	
	@When("edit the message to tweet")
	def edit_the_message_to_tweet() {
	}
	
	@When("press the tweet button")
	def press_the_tweet_button() {
		Mobile.verifyElementExist(findTestObject('AT6 - Twitter Objects/android.widget.Button0 - Tweet'), 0)
		
		Mobile.tap(findTestObject('AT6 - Twitter Objects/android.widget.Button0 - Tweet'), 0)
		
		
	}
	
	@Then("I can share the message on twitter")
	def i_can_share_the_message_on_twitter() {
		AppiumDriver<?> driver = MobileDriverFactory.getDriver()
		def toast = driver.findElementByXPath("//android.widget.Toast[@text='Tweet sent successfully!']")
		println("Toast element: " + toast)
		if (toast == null) {
			KeywordUtil.markFailed('ERROR: Toast object not found!')
		}
		
		Mobile.closeApplication()
	}
	
}