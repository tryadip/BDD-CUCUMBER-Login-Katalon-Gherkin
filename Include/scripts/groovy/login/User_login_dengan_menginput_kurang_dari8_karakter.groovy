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



class User_login_dengan_menginput_kurang_dari8_karakter {
	
	@Given("user diarahkan kehalaman login kumparan")
	def directtopage() {
		WebUI.openBrowser("https://kumparan.com")
		WebUI.click(findTestObject("Login/Alert/btn_tdk"))
		WebUI.click(findTestObject("Login/Button/btn_Login"))
		println ("berhasil kehalaman login")
	}

	@When("user menginput field (.*) dengan data valid dan field (.*) kurang dari 8 karakter")
	def inputccredential(String email, String password) {
		WebUI.setText(findTestObject("Login/TxtField/Field_email"), email)
		WebUI.setText(findTestObject("Login/TxtField/Field_pass"), password)
		println ("user berhasil menginput credential data")
	}
	
	@And("User klik button login pada menu login kumparan")
	def clickbutton() {
		WebUI.click(findTestObject("Login/Button/btn_Masuk_Dashboard"))
		println("User berhasil mengklik button masuk")
	}

	@Then("User mendapatkan error pada field passwor berupa inline (.*)")
	def verifyText(String error) {
		WebUI.verifyTextPresent(error, false)
		println("User menerima inline error pada field password")
	}
}