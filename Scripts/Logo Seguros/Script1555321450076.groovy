import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.logo.pt/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_Seguro Automvel Casa e Sade - Seguros LOGO/div_SIMULAR'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_Seguro Automvel Casa e Sade - Seguros LOGO/span_SADE'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/a_'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input__beannestedcontratopessoasSeguras0sexo'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input_Masculino_beannestedcontratopessoasSeguras1sexo'))

WebUI.setText(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input__beannestedcontratopessoasSeguras0idade'), 
    '40')

WebUI.setText(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input__beannestedcontratopessoasSeguras1idade'), 
    '18')

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input_Indique o parentesco de cada Pessoa Segura com o Tomador de Seguro_continuar'))

WebUI.waitForElementVisible(findTestObject('Logo Repository/Page_LOGO SADE/input__beancontratotomadorSeguronome'), 3)

WebUI.setText(findTestObject('Logo Repository/Page_LOGO SADE/input__beancontratotomadorSeguronome'), 'Rui Ramalho')

WebUI.setText(findTestObject('Logo Repository/Page_LOGO SADE/input__beancontratotomadorSeguroemailPrincipal'), 'ruimcramalhoxx@gmail.com')

WebUI.setText(findTestObject('Logo Repository/Page_LOGO SADE/input__beancontratotomadorSegurotelefonePrincipal'), '919999999')

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input_Insira os cdigos de oferta separados por ponto e vrgula_continuar'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input__check_capital_A0__1__DOIND__INTER__'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input__check_capital_A0__1__DOIND__CS____true'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input__check_capital_A0__1__DOIND__COINT__'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input__check_capital_A0__1__DOIND__DENTI__'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input__check_capital_A0__1__DOIND__OFTAL__'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input__check_capital_A0__1__DOIND__BEMES__'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input__check_capital_A0__2__DOIND__INTER__'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input__check_capital_A0__2__DOIND__CS____true'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input_Sem Capital_check_capital_A0__2__DOIND__COINT__'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input_Sem Capital_check_capital_A0__2__DOIND__DENTI__'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input_Sem Capital_check_capital_A0__2__DOIND__OFTAL__'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input_Sem Capital_check_capital_A0__2__DOIND__BEMES__'))

WebUI.click(findTestObject('Object Repository/Logo Repository/Page_LOGO SADE/input__calcularLogo_3'))

not_run: WebUI.verifyTextPresent('Compre Online!', false)

