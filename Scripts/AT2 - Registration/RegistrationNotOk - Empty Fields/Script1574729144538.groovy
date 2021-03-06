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

Mobile.startApplication('E:\\Aulas\\3 Ano 1 Semestre\\TAES\\Projeto\\project\\app\\build\\outputs\\apk\\debug\\app-debug.apk', 
    false)

Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('AT2 Objects/android.widget.ImageButton0'), 0)

Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.CheckedTextView0 - Create Account'), 0)

Mobile.tap(findTestObject('AT2 Objects/android.widget.CheckedTextView0 - Create Account'), 0)

Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.TextView0 - REGISTER'), 0)

Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.EditText0 - E-mail'), 0)

Mobile.tap(findTestObject('AT2 Objects/android.widget.Button0 - CREATE ACCOUNT'), 0)

Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.TextView0 - Email field is mandatory'), 0)

Mobile.setText(findTestObject('AT2 Objects/android.widget.EditText0 - E-mail'), 'email@gmail.com', 0)

Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.EditText0 - Password'), 0)

Mobile.tap(findTestObject('AT2 Objects/android.widget.Button0 - CREATE ACCOUNT'), 0)

Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.TextView0 - Password field is mandatory'), 0)

Mobile.setText(findTestObject('AT2 Objects/android.widget.EditText0 - Password'), 'password!1', 0)

Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.EditText0 - Password confirmation'), 0)

Mobile.tap(findTestObject('AT2 Objects/android.widget.Button0 - CREATE ACCOUNT'), 0)

Mobile.verifyElementExist(findTestObject('AT2 Objects/android.widget.TextView0 - Password confirmation field is mandatory'), 
    0)

Mobile.closeApplication()

