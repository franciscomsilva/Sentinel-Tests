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

Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)

Mobile.tap(findTestObject('AT3 Objects/android.widget.CheckedTextView0 - Login'), 0)

Mobile.setText(findTestObject('AT3 Objects/android.widget.EditText0 - E-mail'), 'email@gmail.com', 0)

Mobile.setText(findTestObject('AT3 Objects/android.widget.EditText0 - Password'), '123456', 0)

Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Login Button'), 0)

Mobile.tap(findTestObject('AT3 Objects/android.widget.ImageButton0 Lateral Menu Button'), 0)

Mobile.verifyElementExist(findTestObject('AT3 Objects/android.widget.TextView0 - emailgmail.com'), 0)

Mobile.closeApplication()

