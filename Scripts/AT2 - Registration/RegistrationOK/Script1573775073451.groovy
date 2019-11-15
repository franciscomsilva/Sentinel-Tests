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
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.util.KeywordUtil

Mobile.startApplication('E:\\Aulas\\3 Ano 1 Semestre\\TAES\\Projeto\\project\\app\\build\\outputs\\apk\\debug\\app-debug.apk', 
    false)

Mobile.verifyElementExist(findTestObject('Registration Objects/android.widget.EditText0 - E-mail'), 0)

Mobile.setText(findTestObject('Registration Objects/android.widget.EditText0 - E-mail'), 'email35@gmail.com', 0)

Mobile.verifyElementExist(findTestObject('Registration Objects/android.widget.EditText0 - Password'), 0)

Mobile.setText(findTestObject('Registration Objects/android.widget.EditText0 - Password'), 'password1!', 0)

Mobile.verifyElementExist(findTestObject('Registration Objects/android.widget.EditText0 - Password confirmation'), 0)

Mobile.setText(findTestObject('Registration Objects/android.widget.EditText0 - Password confirmation'), 'password1!', 0)

Mobile.verifyElementExist(findTestObject('Registration Objects/android.widget.Button0 - CREATE ACCOUNT'), 0)

Mobile.tap(findTestObject('Registration Objects/android.widget.Button0 - CREATE ACCOUNT'), 0)

AppiumDriver<?> driver = MobileDriverFactory.getDriver()
def toast = driver.findElementByXPath("//android.widget.Toast[@text='User created: email35@gmail.com']")
println("Toast element: " + toast)
if (toast == null) {
	KeywordUtil.markFailed('ERROR: Toast object not found!')
}

