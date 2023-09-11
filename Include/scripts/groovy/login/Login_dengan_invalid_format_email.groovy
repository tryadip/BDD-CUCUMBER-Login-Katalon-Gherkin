package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login_dengan_invalid_format_email {
	@Given("user berhasil masuk kedalam halaman login")
	def directtopage() {
		WebUI.openBrowser("kumparan.com")
		WebUI.click(findTestObject("Login/Alert/btn_tdk"))
		WebUI.click(findTestObject("Login/Button/btn_Login"))
		println("user berhasil masuk kehalaman login")
	}
	
	@When("user input dengan invalid (.*) dan (.*) yang valid")
	def inputcredential(String email, String password) {
		WebUI.setText(findTestObject("Login/TxtField/Field_email"), email)
		WebUI.setText(findTestObject("Login/TxtField/Field_pass"), password)
	}
	@And("user mengklik button masuk pada halaman login")
	def klikbutton() {
		WebUI.click(findTestObject("Login/Button/btn_Masuk_Dashboard"))
	}
	
	@Then("user mendapatkan (.*) invalid pada field email")
	def verifytext(String error) {
		WebUI.verifyTextPresent(error, false)
	}
	
}