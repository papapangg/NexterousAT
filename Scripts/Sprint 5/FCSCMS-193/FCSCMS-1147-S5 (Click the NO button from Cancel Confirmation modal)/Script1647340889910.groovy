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

WebUI.click(findTestObject('Admin/Sprint 5/AddNewClient/button_Add New Client'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/EditClientXpathNew/input_Client Name_b10-Input_ClientName'), 'Test Client Automation A')

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Admin/Sprint 5/Clients/EditClientXpathNew/StatusDropdownNew'), 'Active', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/EditClientXpathNew/input_Business Details_b10-Input_BusinessDetails'), 
    'AT BD A')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/EditClientXpathNew/input_IRS Number_b10-Input_IRSNumber'), '1222333')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/AddNewClient/ButtonsNewXpath/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Sprint 5/AddNewClient/ButtonsNewXpath/button_No(Save)'))

WebUI.delay(2)

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/AddNewClient/ClientDashboardNew'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/AddNewClient/span_Back'))

