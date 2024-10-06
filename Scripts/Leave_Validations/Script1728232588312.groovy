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

WebUI.callTestCase(findTestCase('TC_Login'), [('appURL') : 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'
        , ('userName') : 'Admin', ('password') : 'admin123'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_OrangeHRM/DashBoard/span_Leave'))

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/Leave_Page/h5_Leave List'), 0)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/Leave_Page/h6_Leave'), 0)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/Leave_Page/li_Apply'), 0)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/Leave_Page/li_Entitlements'), 0)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/Leave_Page/li_My Leave'), 0)

WebUI.verifyElementPresent(findTestObject('Page_OrangeHRM/Leave_Page/li_Reports'), 0)

WebUI.closeBrowser()

