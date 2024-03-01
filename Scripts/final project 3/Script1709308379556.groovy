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

WebUI.navigateToUrl('https://www.tokopedia.com/')

WebUI.setText(findTestObject('Object Repository/tokped/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Kategori_css-3017qm exxxdg63'), 
    'iphone 13')

WebUI.sendKeys(findTestObject('Object Repository/tokped/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/input_Kategori_css-3017qm exxxdg63'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/tokped/Page_Jual iphone 13  Tokopedia/div_AppShoppe_css-ty7p6o'))

WebUI.click(findTestObject('Object Repository/tokped/Page_Jual iphone 13  Tokopedia/div_Apple iPhone 13 Garansi Resmi - 128GB 2_03711e'))

WebUI.click(findTestObject('Object Repository/tokped/Page_Promo Apple iPhone 13 Garansi Resmi - _e11c7a/button_Keranjang'))

