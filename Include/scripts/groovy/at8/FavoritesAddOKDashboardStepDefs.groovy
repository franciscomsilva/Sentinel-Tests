package at8
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


class FavoritesAddOKDashboardStepDefs {
	@When("I click in the plus next to the room I want to favorite")
	def i_click_in_the_plus_next_to_the_room_I_want_to_favorite() {
		Mobile.tap(findTestObject('AT8 - Favorites ADD-REMOVE/android.widget.Spinner0 FavoriteList'), 0)
		
		Mobile.tap(findTestObject('AT8 - Favorites ADD-REMOVE/android.widget.CheckedTextView0 - Room A'), 0)
		
		Mobile.tap(findTestObject('AT8 - Favorites ADD-REMOVE/android.widget.ImageButton0 ADD TO Favorites'), 0)
		
	}
	
	@Then("I can check that It was added to the favorites list both sides")
	def i_can_check_that_It_was_added_to_the_favorites_list_both_sides() {
		Mobile.verifyElementExist(findTestObject('AT8 - Favorites ADD-REMOVE/android.widget.TextView0 - Room A (ADDED)'), 0)
		
		Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)
		
		Mobile.tap(findTestObject('Dashboard Objects/android.widget.CheckedTextView0 - Dashboard'), 0)
		
		Mobile.tap(findTestObject('AT5 - Check Rooms/android.widget.Spinner Room Change'), 0)
		
		Mobile.tap(findTestObject('AT5 - Check Rooms/android.widget.CheckedTextView0 - Room A'), 0)
		
		Mobile.closeApplication()
	}
}