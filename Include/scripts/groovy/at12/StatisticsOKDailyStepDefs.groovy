package at12
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



class StatisticsOKDailyStepDefs {
	@Given("I choose daily on the statistics tab")
	def i_choose_daily_on_the_statistics_tab() {
		Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)
		
		Mobile.tap(findTestObject('AT12 - Statistics Objects/android.widget.CheckedTextView0 - Statistics LatTab'), 0)
		
		Mobile.tap(findTestObject('AT12 - Statistics Objects/android.widget.Spinner0 Day.Week.Month.Custom'), 0)
		
		Mobile.tap(findTestObject('AT12 - Statistics Objects/android.widget.CheckedTextView0 - Day'), 0)
	}

	@Then("I can check the average humidity or the temperature or both")
	def i_can_check_the_average_humidity_or_the_temperature_or_both() {
		Mobile.tap(findTestObject('AT12 - Statistics Objects/android.widget.CheckBox0 - Temperature'), 0)
		
		Mobile.tap(findTestObject('AT12 - Statistics Objects/android.widget.CheckBox0 - Temperature'), 0)
		
		Mobile.tap(findTestObject('AT12 - Statistics Objects/android.widget.CheckBox0 - Humidity'), 0)
		
		Mobile.tap(findTestObject('AT12 - Statistics Objects/android.widget.CheckBox0 - Humidity'), 0)
		
		Mobile.tap(findTestObject('AT12 - Statistics Objects/android.widget.Button0 - TABLE'), 0)
		
		Mobile.tap(findTestObject('AT12 - Statistics Objects/android.widget.Button0 - GRAPH'), 0)
		
		Mobile.closeApplication()
	}
}