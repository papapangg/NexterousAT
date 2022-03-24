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

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/AddNewUser/PrivilegeGroup/div_System Administrators'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/AddNewUser/button_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/AddNewUser/button_Yes(Save)'))

WebUI.delay(3)

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/EditUser/img_Edit_testUser'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/EditUser/button_Remove item(IdentityAdmin)'))

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/EditUser/button_Remove item(IdentityWriter)'))

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/EditUser/button_Remove item(PGroupAdmin)'))

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/EditUser/button_Remove item(PGroupReader)'))

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/EditUser/button_Remove item(PGroupWriter)'))

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/EditUser/button_Remove item(SystemAdmin)'))

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/EditUser/button_Remove item(ValuesReader)'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/AddNewUser/button_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-142/AddNewUser/button_Yes(Save)'))

WebUI.delay(2)

