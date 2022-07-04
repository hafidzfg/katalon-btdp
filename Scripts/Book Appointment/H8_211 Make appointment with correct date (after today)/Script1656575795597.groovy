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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Test Call/Login Only'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AppointmentPage_CURA Healthcare Service/label_Medicaid'))

WebUI.selectOptionByValue(findTestObject('AppointmentPage_CURA Healthcare Service/select_Combo_FaciltyHealthcareCenter'), 
    'Hongkong CURA Healthcare Center', false)

WebUI.setText(findTestObject('AppointmentPage_CURA Healthcare Service/calendar_Visit Date (Required)_visit_date'), '29/07/2023')

WebUI.setText(findTestObject('AppointmentPage_CURA Healthcare Service/input_textarea_Comment'), 'Saya sakit kepala')

WebUI.click(findTestObject('AppointmentPage_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('AppointmentResult_CURA Healthcare Service/header_h2_Appointment Confirmation'), 
    5)

WebUI.verifyElementText(findTestObject('AppointmentResult_CURA Healthcare Service/text_AppointmentDateResult'), '29/07/2023')

WebUI.verifyElementText(findTestObject('AppointmentResult_CURA Healthcare Service/text_AppointmentFacilityResult'), 'Hongkong CURA Healthcare Center')

WebUI.verifyElementText(findTestObject('AppointmentResult_CURA Healthcare Service/text_CommentResult'), 'Saya sakit kepala')

WebUI.verifyElementText(findTestObject('AppointmentResult_CURA Healthcare Service/text_HealthcareProgramResult'), 'Medicaid')

WebUI.verifyElementText(findTestObject('AppointmentResult_CURA Healthcare Service/text_HospitalReadmissionResult'), 'No')

WebUI.closeBrowser()

