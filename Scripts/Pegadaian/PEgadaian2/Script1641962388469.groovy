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

WebUI.navigateToUrl('http://10.253.12.33:7003/M24Front/m24')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_/input_NIK_txt_nik'), 'P87187')

WebUI.setEncryptedText(findTestObject('Object Repository/PEgadaian2/Page_/input_Kata Sandi_txt_kataSandi'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/PEgadaian2/Page_/span_Login'))

WebUI.click(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/span_Kredit'))

WebUI.click(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/span_Gadai'))

WebUI.click(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/span_Pengajuan Gadai'))

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input_No CIF_txt_noCIF'), '9006448414')

WebUI.selectOptionByValue(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/select_120 Hari'), '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/select_TidakYa'), '2', true)

WebUI.click(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input_Gadai Ulang Otomatis_gwt-uid-1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/select_Usaha  Modal KerjaInvestasiPembelian_936e6c'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/select_PertanianIndustriPerdaganganNelayanK_bfe6c7'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('PEgadaian2/Page_Passion - Dev/Page_Passion - Dev/select_KendaraanBarang GudangBarang ElektronikBarang Kantong'), 
    '5', true)

WebUI.click(findTestObject('PEgadaian2/Page_Passion - Dev/span_Tambah'))

WebUI.selectOptionByValue(findTestObject('PEgadaian2/Page_Passion - Dev/Page_Passion - Dev/Page_Passion - Dev/select_SEPEDA MOTORMOBILMESIN BERMOTORTRUKKENDARAAN RODA 3'), 
    '1', true)

WebUI.setText(findTestObject('PEgadaian2/Page_Passion - Dev/Page_Passion - Dev/Page_Passion - Dev/input_Detail Kriteria_txt_model'), 
    'test')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input__txt_noBPKB'), 'gt123')

WebUI.click(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/span_Cek BPKB'))

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input_Cek BPKB_txt_namaBPKB'), 'test')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input__txt_noSTNK'), 'tes123')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input__txt_noRangka'), 'test11')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input__txt_noMesin'), '11test')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input_Tahun Pembuatan_txt_tahunPembuatan'), 
    '2018')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input_Tahun Perakitan_txt_tahunPerakitan'), 
    '2022')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input__txt_merek'), 'test')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input__txt_warna'), 'hitam')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input__txt_isiSilinder'), '123')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input__txt_noPolisi'), 't123')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input__nf_hargaPasar'), '1000000')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/textarea_Keterangan_txa_keterangan'), 'test')

WebUI.click(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/span_Simpan'))

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input_Marketing Code_txt_marketingCode'), 
    '123')

WebUI.setText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/input_Nama Marketing_txt_namaMarketing'), 
    'test')

WebUI.click(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/span_Simpan'))

WebUI.verifyElementText(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/span_Yakin, Lanjutkan'), 'Yakin, Lanjutkan')

WebUI.click(findTestObject('Object Repository/PEgadaian2/Page_Passion - Dev/span_Yakin, Lanjutkan'))

WebUI.closeBrowser()

