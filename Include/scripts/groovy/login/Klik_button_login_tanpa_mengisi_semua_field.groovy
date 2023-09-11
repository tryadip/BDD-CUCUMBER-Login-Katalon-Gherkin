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


class Klik_button_login_tanpa_mengisi_semua_field {
	
	@Given("User masuk kehalaman login kumparan")
	def Directtopage() {
		WebUI.openBrowser("https://kumparan.com")
		WebUI.click(findTestObject("Login/Alert/btn_tdk"))
		WebUI.click(findTestObject("Login/Button/btn_Login"))
		println ("berhasil kehalaman login")
	}

	@When("User mengklik button login tanpa mengisi semua filed")
	def blankfield() {
		println ("user berhasil mengosongkan field")
	}
	@And("User mengklik button login")
	def klikbutton() {
		WebUI.click(findTestObject("Login/Button/Btn_Masuk_Dashboard"))
	}

	@Then("user mendapatkan inline (.*)")
	def verifyText(String url) {
		WebUI.verifyTextPresent(url, false)
		WebUI.takeScreenshot("C:/Users/user/Documents/Latihan Testing/Report katalon/BDD Report Login Katalon/Login_Neg_klik button tanpa mengisi semua field.png")
		println ("User mendapatkan inline error")
	}
}