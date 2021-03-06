package at5
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


class CheckRoomsOKStepDefs {
	@When("I click on the room selector")
	def i_click_on_the_room_selector() {
		Mobile.verifyElementExist(findTestObject('AT5 - Check Rooms/android.widget.Spinner Room Change'), 0)

		Mobile.tap(findTestObject('AT5 - Check Rooms/android.widget.Spinner Room Change'), 0)
		
		Mobile.verifyElementExist(findTestObject('AT5 - Check Rooms/android.widget.CheckedTextView0 - Room A'), 0)

		Mobile.verifyElementExist(findTestObject('AT5 - Check Rooms/android.widget.CheckedTextView0 - Room B'), 0)

		//Mobile.verifyElementExist(findTestObject('AT5 - Check Rooms/android.widget.CheckedTextView0 - Room C'), 0)
	}

	@Then("I can check the QoA in the various rooms")
	def i_can_check_the_QoA_in_the_various_rooms() {
		Mobile.closeApplication()
	}
}