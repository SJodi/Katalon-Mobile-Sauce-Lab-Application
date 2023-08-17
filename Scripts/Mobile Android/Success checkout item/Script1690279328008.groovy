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

Mobile.startApplication('bs://7f5afff47d175561397db41b991950df5d5bb367', true)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Username'), 'standard_user', 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Password'), 'secret_sauce', 0)

Mobile.tap(findTestObject('Object Repository/Android/android.view.ViewGroup'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Android/android.widget.ImageView'), 0)

String expected_price = '$29.99'

String product_name = 'Sauce Labs Backpack'

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - 29.99'), expected_price)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - Sauce Labs Backpack'), product_name)

Mobile.tap(findTestObject('Object Repository/Android/android.view.ViewGroup (3)'), 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - First Name'), 'Setiawan', 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - Last Name'), 'Jodi', 0)

Mobile.setText(findTestObject('Object Repository/Android/android.widget.EditText - ZipPostal Code'), '11640', 0)

Mobile.tap(findTestObject('Object Repository/Android/android.view.ViewGroup (4)'), 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Android/android.view.ViewGroup (5)'), 0)

Mobile.verifyElementText(findTestObject('Android/android.widget.TextView - 29.99'), expected_price)

Mobile.verifyElementText(findTestObject('Object Repository/Android/android.widget.TextView - FREE PONY EXPRESS DELIVERY'), 'FREE PONY EXPRESS DELIVERY!')

Mobile.closeApplication()

