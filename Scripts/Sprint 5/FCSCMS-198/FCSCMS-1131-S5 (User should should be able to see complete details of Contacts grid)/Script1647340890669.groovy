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

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/FCSCMS-198/Contacts/ContactGrid'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/FCSCMS-198/Element Verification/th_Action'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/FCSCMS-198/Element Verification/th_Address'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/FCSCMS-198/Element Verification/th_City'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/FCSCMS-198/Element Verification/th_Contact Name'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/FCSCMS-198/Element Verification/th_Contact Type'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/FCSCMS-198/Element Verification/th_Country'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/FCSCMS-198/Element Verification/th_State'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/FCSCMS-198/Element Verification/th_Zip Code'))

WebUI.delay(2)

