package br.com.talia;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import utils.DriverManager;
import utils.Screenshot;

public class CadastroSteps extends DriverManager {

	DriverManager navegador = new DriverManager();
	CadastroLogic cadastro = new CadastroLogic();
	Screenshot captura = new Screenshot();

	@Dado("que o usuario abra o navegador")
	public void que_o_usuario_abra_o_navegador_e_acessa_o_site() {
		navegador.getDriver();

	}

	@E("digita os dados para efetuar o cadastro")
	public void digita_os_dados_para_efetuar_o_cadastro() throws Throwable {
		cadastro.DigitarNome();
		cadastro.DigitarEmail();
		cadastro.DigitarSenha();
		captura.screen();
	}

	@Entao("valida cadastro efetuado com sucesso")
	public void valida_cadastro_efetuado_com_sucesso() {
		cadastro.ValidaCadastroEfetuadoComSucesso();
		navegador.close();
	}

	@Dado("digita os dados")
	public void digita_os_dados() throws Throwable {
		cadastro.DigitarNome();
		cadastro.DigitarEmail();
		cadastro.DigitarSenha();
		captura.screen();
	}

	@Entao("valida dados preenchidos")
	public void valida_dados_preenchidos() {
		navegador.close();

	}

	@Dado("digita os dados sem informar o nome")
	public void digita_os_dados_sem_informar_o_nome() throws Throwable {
		cadastro.DigitarEmail();
		cadastro.DigitarSenha();
		cadastro.ClicarCadastrar();
		captura.screen();
	}

	@Entao("valida o campo nome e obrigatorio")
	public void valida_o_campo_nome_e_obrigatorio() {
		cadastro.ValidaoCampoNomeeObrigatorio();
		navegador.close();
	}

	@Dado("digita os dados sem informar o email")
	public void digita_os_dados_sem_informar_o_email() throws Throwable {
		cadastro.DigitarNome();
		cadastro.DigitarSenha();
		cadastro.ClicarCadastrar();
		captura.screen();
	}

	@Entao("valida o campo email e obrigatorio")
	public void valida_o_campo_email_e_obrigatorio() {
		cadastro.ValidaoCampoEmaileObrigatorio();
		navegador.close();
	}

	@Dado("digita os dados sem informar a senha")
	public void digita_os_dados_sem_informar_a_senha() throws Throwable {
		cadastro.DigitarNome();
		cadastro.DigitarEmail();
		cadastro.ClicarCadastrar();
		captura.screen();
	}

	@Entao("valida o campo senha e obrigatorio")
	public void valida_o_campo_senha_e_obrigatorio() {
		cadastro.ValidaSenhaObrigatoria();
		navegador.close();
	}

	@Dado("clica em cadastrar")
	public void clica_em_cadastrar() throws Throwable {
		cadastro.ClicarCadastrar();
		captura.screen();
	}

	@Entao("valida campos obrigatorios")
	public void valida_campos_obrigatorios() {
		cadastro.ValidaCamposObrigatorios();
		navegador.close();
	}

	@Dado("digita os dados sem informar o nome completo")
	public void digita_os_dados_sem_informar_o_nome_completo() throws Throwable {
		cadastro.DigitarNomeIncompleto();
		cadastro.DigitarEmail();
		cadastro.DigitarSenha();
		cadastro.ClicarCadastrar();
		captura.screen();
	}

	@Entao("valida o campo ensira nome completo")
	public void valida_o_campo_ensira_nome_completo() {
		cadastro.ValidaOCampoEnsiraNomeCompleto();
		navegador.close();
	}

	@Dado("digita os dados informando email incorreto")
	public void digita_os_dados_informando_email_incorreto() throws Throwable {
		cadastro.DigitarNome();
		cadastro.DigitarEmailIncorreto();
		cadastro.DigitarSenha();
		cadastro.ClicarCadastrar();
	}

	@Entao("valida o campo ensira email valido")
	public void valida_o_campo_ensira_email_valido() {
		cadastro.ValidaoCampoEnsiraEmailValido();
		navegador.close();
	}

	@Dado("digita os dados informando senha incompleta")
	public void digita_os_dados_informando_senha_incompleta() throws Throwable {
		cadastro.DigitarNome();
		cadastro.DigitarEmail();
		cadastro.DigitarSenhaIncorreta();
		cadastro.ClicarCadastrar();
	}

	@Entao("valida campo senha deve conter oito caracteres")
	public void valida_campo_senha_deve_conter_oito_caracteres() {
		cadastro.ValidaCampoSenhaDeveConterOitoCaracteres();
		navegador.close();
	}

	@Dado("digita os dados para efetuar os cadastros")
	public void digita_os_dados_para_efetuar_os_cadastros() throws Throwable {
		cadastro.DigitarNome();
		cadastro.DigitarEmail();
		cadastro.DigitarSenha();
		cadastro.ClicarCadastrar();
		cadastro.DigitarSegundoNome();
		cadastro.DigitarSegundoEmail();
		cadastro.DigitarSegundaSenha();
		cadastro.ClicarCadastrar();
		captura.screen();
	}

	@Entao("valida cadastros efetuados com sucesso")
	public void valida_cadastros_efetuados_com_sucesso() {
		cadastro.ValidaCadastrosEfetuadosComSucesso();
		navegador.close();
	}

	@Dado("cadastra usuario para fazer a exclusao")
	public void cadastra_usuario_para_fazer_a_exclusao() throws Throwable {
		cadastro.DigitarNome();
		cadastro.DigitarEmail();
		cadastro.DigitarSenha();
		cadastro.ClicarCadastrar();
		cadastro.ExcluirCadastro();
		captura.screen();
	}

	@Entao("valida cadastros excluido com sucesso")
	public void valida_cadastros_excluido_com_sucesso() {
		cadastro.ValidaCadastrosExcluidoComSucesso();
		navegador.close();

	}

}
