package mypack

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class login {
	@Keyword
	public void getLogin() {
		int a = 2 ;
		for(int i=0;i <2;i++) {
			if(a == 2) {
				WebUI.maximizeWindow()

				WebUI.navigateToUrl('https://stmember.mediacartz.com/login')

				WebUI.setText(findTestObject('Coba1/Page_Login/input_Login_input svelte-13d0vui'), 'Test@gmail.com')

				WebUI.setEncryptedText(findTestObject('Coba1/Page_Login/input_Login_formpassword'), 'vOoj4tQjAWVV9mKJ1JcWEw==')

				WebUI.click(findTestObject('Coba1/Page_Login/button_Masuk'))

				WebUI.click(findTestObject('coba/Page_Customers/a_Customer'))

				WebUI.click(findTestObject('coba/Page_Customers/button_Buat Customer'))

				WebUI.setText(findTestObject('coba/Page_Customers/input_Nama Customer_input'), 'Test Aja')

				WebUI.setText(findTestObject('coba/Page_Customers/input_MSISDN_input'), '6285225007777')

				WebUI.setText(findTestObject('coba/Page_Customers/input_Email_input'), 'test@gmail.com')

				WebUI.selectOptionByValue(findTestObject('Object Repository/coba/Page_Customers/Page_Customers/select_- Pilih Jenis Kelamin -Laki-lakiPerempuan'),
						'm', true)

				WebUI.setText(findTestObject('coba/Page_Customers/input_Pekerjaan_input'), 'Test')

				WebUI.setText(findTestObject('coba/Page_Customers/input_Alamat_input'), 'test')

				WebUI.setText(findTestObject('coba/Page_Customers/input_Tempat Lahir_input'), 'test')
			}else {
				System.out.println(" if condition is false")
			}
		}
	}
}
