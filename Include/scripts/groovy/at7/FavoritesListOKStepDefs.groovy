package at7
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


class FavoritesListOKStepDefs {
	@When("I press the Favorites button on the side tab")
	def i_press_the_Favorites_button_on_the_side_tab() {
		Mobile.verifyElementExist(findTestObject('Dashboard Objects/android.widget.ImageButton0 Lateral button'), 0)
		
		Mobile.tap(findTestObject('Dashboard Objects/android.widget.ImageButton0 Lateral button'), 0)
		
		Mobile.verifyElementExist(findTestObject('AT7 - Favorites List Objects/android.widget.CheckedTextView0 - Favorites'), 0)
		
		Mobile.tap(findTestObject('AT7 - Favorites List Objects/android.widget.CheckedTextView0 - Favorites'), 0)
		
		Mobile.verifyElementExist(findTestObject('AT7 - Favorites List Objects/android.widget.TextView0 - FAVORITES'), 0)
		
		Mobile.verifyElementText(findTestObject('AT7 - Favorites List Objects/android.widget.TextView0 - FAVORITES'), 'FAVORITES')
		
	}

	@Then("I can check that there are no favorites added")
	def i_can_check_that_there_are_no_favorites_added() {
		Mobile.verifyElementExist(findTestObject('AT7 - Favorites List Objects/android.widget.TextView0 - NO FAVORITES ADDED'), 0)
		
		Mobile.verifyElementText(findTestObject('AT7 - Favorites List Objects/android.widget.TextView0 - NO FAVORITES ADDED'), 'NO FAVORITES ADDED!')
		
		Mobile.closeApplication()
	}
}