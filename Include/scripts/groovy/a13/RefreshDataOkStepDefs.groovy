package a13
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



class RefreshDataOkStepDefs {
	@Given("I am at the dashboard")
	def i_am_at_the_dashboard() {
		Mobile.startExistingApplication(GlobalVariable.appID)
		
		Mobile.verifyElementExist(findTestObject('Dashboard Objects/android.widget.TextView0 - DASHBOARD'), 0)
		
		Mobile.verifyElementText(findTestObject('Dashboard Objects/android.widget.TextView0 - DASHBOARD'), 'DASHBOARD')
		
		Mobile.verifyElementExist(findTestObject('Dashboard Objects/android.widget.TextView0 - EDIFCIO A'), 0)
		
		Mobile.verifyElementText(findTestObject('Dashboard Objects/android.widget.TextView0 - EDIFCIO A'), 'EDIFÍCIO A')
		
		
	}
	
	@When("I swipe from top to bottom")
	def i_swipe_from_top_to_bottom() {
		'Get Device Height and Store in device_height variable'
		int device_Height = Mobile.getDeviceHeight()
		
		'Get Width Height and Store in device_Width variable'
		int device_Width = Mobile.getDeviceWidth()
		
		'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
		int startX = device_Width / 2
		
		'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
		int endX = startX
		
		'Storing the startY value'
		int startY = device_Height * 0.7
		
		'Storing the endY value'
		int endY = device_Height * 0.30
		
		'Swipe Vertical from top to bottom'
		Mobile.swipe(startX, endY, endX, startY)
		
		
	}
	
	@Then("I verify that the dashboard data was refreshed")
	def i_verify_that_the_dashboard_data_was_refreshed() {
		Mobile.verifyElementAttributeValue(findTestObject('AT13 - Refresh Data Objects/SnackBar Refreshed Successfully'), 'text',
			'Refreshed Successfully', 0)
		
		Mobile.closeApplication()
	}
}