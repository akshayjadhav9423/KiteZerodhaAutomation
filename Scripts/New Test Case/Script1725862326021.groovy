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

WebUI.navigateToUrl('https://kite.zerodha.com/')

WebUI.setText(findTestObject('Object Repository/Page_Kite - Zerodhas fast and elegant flags_964fa9/input_Login to Kite_userid'), 
    'TV8223')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Kite - Zerodhas fast and elegant flags_964fa9/input_Phone number or User ID_password'), 
    'KwrfV2szmBsBjtzuXt9E6w==')

WebUI.click(findTestObject('Object Repository/Page_Kite - Zerodhas fast and elegant flags_964fa9/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Kite - Zerodhas fast and elegant flags_964fa9/a_Problem with Mobile App Code'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Kite/button_I understand'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Kite/a_AS  TV8223'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard  Kite/a_Holdings'))

WebUI.click(findTestObject('Object Repository/Page_Holdings  Kite/h4_2,904.51'))

WebUI.click(findTestObject('Object Repository/Page_Holdings  Kite/span_2,643.56'))

