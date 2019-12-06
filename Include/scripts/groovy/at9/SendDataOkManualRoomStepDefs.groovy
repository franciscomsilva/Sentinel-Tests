package at9
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


class SendDataOkManualRoomStepDefs {
	@When("I click send data on the lateral menu")
	def i_click_send_data_on_the_lateral_menu() {
		Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)

		Mobile.tap(findTestObject('AT9 - Send Data Objects/android.widget.CheckedTextView0 - Send'), 0)
	}

	@When("I select the room manually")
	def i_select_the_room_manually() {
		Mobile.tap(findTestObject('AT9 - Send Data Objects/android.widget.Spinner0 Room Change'), 0)

		Mobile.tap(findTestObject('AT9 - Send Data Objects/android.widget.CheckedTextView0 - Room C'), 0)
	}

	@When("I use the values of the sensor OR my own values")
	def i_use_the_values_of_the_sensor_OR_my_own_values() {
	}

	@Then("I can send the data to the database")
	def i_can_send_the_data_to_the_database() {
		Mobile.tap(findTestObject('AT9 - Send Data Objects/android.widget.Button0 - SEND'), 0)

		Mobile.verifyElementExist(findTestObject('AT9 - Send Data Objects/android.widget.TextView0 - Data Sent Sucessfully'), 0)

		Mobile.closeApplication()
	}
}