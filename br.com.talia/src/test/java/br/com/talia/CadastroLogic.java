package br.com.talia;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

import utils.DriverManager;

public class CadastroLogic extends CadastroPage {

	public CadastroLogic() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	public void ClicarCadastrar() throws Throwable {
		clicarCadastrar.click();
		Thread.sleep(2000);
	}

	public void DigitarNome() throws Throwable {
		digitarnome.sendKeys("Teste Stefanini");
		Thread.sleep(2000);
	}

	public void DigitarEmail() throws Throwable {
		digitarEmail.sendKeys("teste@stefanini.com");
		Thread.sleep(2000);
	}

	public void DigitarSenha() throws Throwable {
		digitarPassword.sendKeys("Teste@321");
		Thread.sleep(2000);

	}

	public void DigitarNomeIncompleto() throws Throwable {
		digitarnome.sendKeys("Stefanini");
		Thread.sleep(2000);
	}

	public void DigitarEmailIncorreto() throws Throwable {
		digitarEmail.sendKeys("teste.com");
		Thread.sleep(2000);
	}

	public void DigitarSenhaIncorreta() throws Throwable {
		digitarPassword.sendKeys("321");
		Thread.sleep(2000);
	}

	public void DigitarSegundoNome() throws Throwable {
		digitarnome.sendKeys("Teste Stefanini Novo");
		Thread.sleep(2000);
	}

	public void DigitarSegundoEmail() throws Throwable {
		digitarEmail.sendKeys("testenovo@stefanini.com");
		Thread.sleep(2000);
	}

	public void DigitarSegundaSenha() throws Throwable {
		digitarPassword.sendKeys("Teste@123");
		Thread.sleep(2000);
	}

	public void ExcluirCadastro() throws Throwable {
		excluir.click();
		Thread.sleep(2000);
	}

	public void ValidaCadastroEfetuadoComSucesso() {
		Assert.assertTrue(DriverManager.getDriver().getPageSource().contains("cadastrar"));
	}

	public void ValidaoCampoNomeeObrigatorio() {
		Assert.assertTrue(DriverManager.getDriver().getPageSource().contains("Nome"));
	}

	public void ValidaoCampoEmaileObrigatorio() {
		Assert.assertTrue(DriverManager.getDriver().getPageSource().contains("E-mail"));
	}

	public void ValidaTesteSucesso() {
		Assert.assertTrue(DriverManager.getDriver().getPageSource().contains("Por favor"));
	}

	public void ValidaSenhaObrigatoria() {
		Assert.assertTrue(DriverManager.getDriver().getPageSource().contains("Obrigat�rio"));
	}

	public void ValidaCamposObrigatorios() {
		Assert.assertTrue(DriverManager.getDriver().getPageSource().contains("O campo"));

	}

	public void ValidaOCampoEnsiraNomeCompleto() {
		Assert.assertTrue(DriverManager.getDriver().getPageSource().contains("Completo"));
	}

	public void ValidaoCampoEnsiraEmailValido() {
		Assert.assertTrue(DriverManager.getDriver().getPageSource().contains("Válido"));
	}

	public void ValidaCampoSenhaDeveConterOitoCaracteres() {
		Assert.assertTrue(DriverManager.getDriver().getPageSource().contains("Caracteres"));
	}

	public void ValidaCadastrosEfetuadosComSucesso() {
		Assert.assertTrue(DriverManager.getDriver().getPageSource().contains("Usuários cadastrados"));

	}

	public void ValidaCadastrosExcluidoComSucesso() {
		Assert.assertTrue(DriverManager.getDriver().getPageSource().contains("Excluir"));
	}
}
