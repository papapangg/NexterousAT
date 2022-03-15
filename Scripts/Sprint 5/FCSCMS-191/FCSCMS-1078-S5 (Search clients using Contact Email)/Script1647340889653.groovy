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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.delay(2)

WebUI.setText(findTestObject('Admin/Sprint 5/Element Veification SP5/input_Contact Email_Input_AS_ContactEmail'), 'Automation@gmail.com')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/button_Search'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/td_Smoke Test 3'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/button_Clear'))

WebUI.delay(2)

