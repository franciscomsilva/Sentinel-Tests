package at1_dashboard
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


class DashboardOKStepDefs {
	@Given("I open the Sentinel App")
	def i_open_the_Sentinel_App() {
		Mobile.startApplication(GlobalVariable.appPath, false)
	}

	@Then("I verify the QoA in the Building A")
	def i_verify_the_QoA_in_the_Building_A() {
		Mobile.verifyElementExist(findTestObject('Dashboard Objects/android.widget.ImageButton0 Lateral button'), 0)

		Mobile.tap(findTestObject('Dashboard Objects/android.widget.ImageButton0 Lateral button'), 0)

		Mobile.verifyElementExist(findTestObject('Dashboard Objects/android.widget.TextView0 - Not logged in'), 0)

		Mobile.verifyElementText(findTestObject('Dashboard Objects/android.widget.TextView0 - Not logged in'), 'Not logged in')

		Mobile.verifyElementExist(findTestObject('Dashboard Objects/android.widget.CheckedTextView0 - Dashboard'), 0)

		Mobile.tap(findTestObject('Dashboard Objects/android.widget.CheckedTextView0 - Dashboard'), 0)

		Mobile.verifyElementExist(findTestObject('Dashboard Objects/android.widget.TextView0 - DASHBOARD'), 0)

		Mobile.verifyElementText(findTestObject('Dashboard Objects/android.widget.TextView0 - DASHBOARD'), 'DASHBOARD')

		Mobile.verifyElementExist(findTestObject('Dashboard Objects/android.widget.TextView0 - EDIFCIO A'), 0)

		Mobile.verifyElementText(findTestObject('Dashboard Objects/android.widget.TextView0 - EDIFCIO A'), 'EDIFÍCIO A')

		Mobile.verifyElementExist(findTestObject('Dashboard Objects/android.widget.TextView0 - Edificio A'), 0)

		Mobile.verifyElementText(findTestObject('Dashboard Objects/android.widget.TextView0 - Edificio A'), 'Edificio A')

		Mobile.closeApplication()
	}
}