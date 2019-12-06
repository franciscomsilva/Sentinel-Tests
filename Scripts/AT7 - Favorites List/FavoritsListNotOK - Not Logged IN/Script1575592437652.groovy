import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startExistingApplication(GlobalVariable.appID)

Mobile.verifyElementExist(findTestObject('Dashboard Objects/android.widget.ImageButton0 Lateral button'), 0)

Mobile.tap(findTestObject('Dashboard Objects/android.widget.ImageButton0 Lateral button'), 0)

Mobile.verifyElementExist(findTestObject('Dashboard Objects/android.widget.TextView0 - Not logged in'), 0)

Mobile.verifyElementText(findTestObject('Dashboard Objects/android.widget.TextView0 - Not logged in'), 'Not logged in')

Mobile.verifyElementNotExist(findTestObject('AT7 - Favorites List Objects/android.widget.CheckedTextView0 - Favorites'), 2)

Mobile.verifyElementNotExist(findTestObject('AT7 - Favorites List Objects/android.widget.TextView0 - FAVORITES'), 2)

Mobile.verifyElementNotExist(findTestObject('AT7 - Favorites List Objects/android.widget.TextView0 - NO FAVORITES ADDED'), 2)

Mobile.closeApplication()