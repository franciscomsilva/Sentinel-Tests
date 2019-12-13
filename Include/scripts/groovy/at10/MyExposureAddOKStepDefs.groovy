package at10
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



class MyExposureAddOKStepDefs {
	@Given("i press the button next to the room I want to add")
	def i_press_the_button_next_to_the_room_I_want_to_add() {
		Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)
		
		Mobile.verifyElementExist(findTestObject('AT10 - MY EXPOSURE/android.widget.CheckedTextView0 - My Exposure LatTab'), 0)
		
		Mobile.tap(findTestObject('AT10 - MY EXPOSURE/android.widget.CheckedTextView0 - My Exposure LatTab'), 0)
		
		Mobile.verifyElementExist(findTestObject('AT10 - MY EXPOSURE/android.widget.TextView0 - MY EXPOSURE'), 0)
		
		Mobile.verifyElementExist(findTestObject('AT10 - MY EXPOSURE/android.widget.TextView0 - NO EXPOSURE DATA'), 0)
		
		Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)
		
		Mobile.tap(findTestObject('Dashboard Objects/android.widget.CheckedTextView0 - Dashboard'), 0)
		
		Mobile.tap(findTestObject('AT10 - MY EXPOSURE/android.widget.ImageButton0 BUTTON ADD TO EXPOSURE'), 0)
	}
	
	@Then("It is added to My Exposure list")
	def it_is_added_to_My_Exposure_list() {
		Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)
		
		Mobile.tap(findTestObject('AT10 - MY EXPOSURE/android.widget.CheckedTextView0 - My Exposure LatTab'), 0)
		
		Mobile.verifyElementNotExist(findTestObject('AT10 - MY EXPOSURE/android.widget.TextView0 - NO EXPOSURE DATA'), 1)
	}
}