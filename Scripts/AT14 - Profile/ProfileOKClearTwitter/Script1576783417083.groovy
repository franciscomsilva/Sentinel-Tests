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

Mobile.startExistingApplication(GlobalVariable.appID, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)

Mobile.tap(findTestObject('AT3 Objects/android.widget.CheckedTextView0 - Login'), 0)

Mobile.setText(findTestObject('AT3 Objects/android.widget.EditText0 - E-mail'), 'testeprofile@gmail.com', 0)

Mobile.setText(findTestObject('AT3 Objects/android.widget.EditText0 - Password'), '123456', 0)

Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Login Button'), 0)

Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)

Mobile.tap(findTestObject('Dashboard Objects/android.widget.ImageButton0 Lateral button'), 0)

Mobile.verifyElementExist(findTestObject('AT14 Objects/Profile LatTab'), 0)

Mobile.tap(findTestObject('AT14 Objects/Profile LatTab'), 0)

Mobile.verifyElementExist(findTestObject('AT14 Objects/Current Password TextBox'), 0)

Mobile.setText(findTestObject('AT14 Objects/Current Password TextBox'), '123456', 0)

Mobile.verifyElementAttributeValue(findTestObject('AT14 Objects/Current Email'), 'text', 'testeprofile@gmail.com', 0)

Mobile.verifyElementExist(findTestObject('AT14 Objects/CheckBox Clear Twitter Login'), 0)

Mobile.checkElement(findTestObject('AT14 Objects/CheckBox Clear Twitter Login'), 0)

Mobile.verifyElementExist(findTestObject('AT14 Objects/SAVE Profile Changes'), 0)

Mobile.tap(findTestObject('AT14 Objects/SAVE Profile Changes'), 0)

Mobile.verifyElementExist(findTestObject('AT14 Objects/Success - Profile updated successfully'), 0)

Mobile.verifyElementText(findTestObject('AT14 Objects/Success - Profile updated successfully'), 'Profile updated successfully')

Mobile.tap(findTestObject('Dashboard Objects/android.widget.ImageButton0 Lateral button'), 0)

Mobile.tap(findTestObject('AT14 Objects/Profile LatTab'), 0)

Mobile.verifyElementNotExist(findTestObject('AT14 Objects/CheckBox Clear Twitter Login'), 2)

Mobile.closeApplication()

