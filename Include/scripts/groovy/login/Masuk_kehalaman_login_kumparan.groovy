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



class Masuk_kehalaman_login_kumparan {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User mencari website kumparan melalui (.*)")
	def directToPage(String url) {
		WebUI.openBrowser(url)
		WebUI.click(findTestObject("Login/Alert/btn_tdk"))
		println ("user berhasil kehalaman kumparan")
	}

	@When("User klik button masuk")
	def klikbuttonMasuk() {
		WebUI.click(findTestObject("Login/Button/btn_Login"))
		println ("user berhasil mengklik button masuk")
	}

	@Then("user masuk kehalaman login kumparan")
	def verifyPage() {
		WebUI.verifyElementPresent(findTestObject("Login/Button/btn_Masuk_Dashboard"), 0)
		WebUI.takeScreenshot("C:/Users/user/Documents/Latihan Testing/Report katalon/BDD Report Login Katalon/Login_Neg_Masuk kehalaman login kumparan.png")
		println ("User berhasil kehalaman login")
	}
}