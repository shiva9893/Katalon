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

WebUI.openBrowser('')

def expected_Dahsboard_Title = 'Dashboard'

WebUI.navigateToUrl(appURL)

WebUI.waitForPageLoad(10)

WebUI.maximizeWindow()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), userName)

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), password)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/h6_Dashboard'))

String actual_Dashboard_Title = WebUI.getText(findTestObject('Object Repository/Page_OrangeHRM/h6_Dashboard'))

WebUI.verifyEqual(expected_Dahsboard_Title, actual_Dashboard_Title)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_Upgrade_oxd-icon bi-caret-down-fill oxd-u_ca92f9'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

