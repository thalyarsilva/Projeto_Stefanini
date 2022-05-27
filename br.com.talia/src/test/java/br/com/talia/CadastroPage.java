package br.com.talia;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CadastroPage {

	@FindBy(how = How.XPATH, using = "//button[@id='register']")
	public WebElement clicarCadastrar;

	@FindBy(how = How.XPATH, using = "//input[@id='name']")
	public WebElement digitarnome;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public WebElement digitarEmail;

	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	public WebElement digitarPassword;

	@FindBy(xpath = "//*[@id='removeUser1']")
	protected WebElement excluir;

}
