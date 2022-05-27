#language: pt
 
 @TodosCadastros 
 Funcionalidade: Cadastro
 
 @Cadastro_01
 Cenario: Realizar preenchimentos dos dados
 Dado que o usuario abra o navegador 
 E digita os dados 
 Entao valida dados preenchidos 
 
  @Cadastro_02
 Cenario: Realizar cadastro de usu�rio sem informar o nome
 Dado que o usuario abra o navegador 
 E digita os dados sem informar o nome
 Entao valida o campo nome e obrigatorio
 
 @Cadastro_03
 Cenario: Realizar cadastro de usu�rio sem informar o email
 Dado que o usuario abra o navegador 
 E digita os dados sem informar o email
 Entao valida o campo email e obrigatorio
 
 @Cadastro_04
 Cenario: Realizar cadastro de usu�rio sem informar o senha
 Dado que o usuario abra o navegador 
 E digita os dados sem informar a senha
 Entao valida o campo senha e obrigatorio
 
  @Cadastro_05
 Cenario: Realizar cadastro sem informacao
 Dado que o usuario abra o navegador 
 E clica em cadastrar
 Entao valida campos obrigatorios
 
 @Cadastro_06
 Cenario: Realizar cadastro de usu�rio com nome incompleto 
 Dado que o usuario abra o navegador 
 E digita os dados sem informar o nome completo
 Entao valida o campo ensira nome completo 
 
  @Cadastro_07
 Cenario: Realizar cadastro de usu�rio com email incorreto
 Dado que o usuario abra o navegador 
 E digita os dados informando email incorreto
 Entao valida o campo ensira email valido
 
 @Cadastro_08
 Cenario: Realizar cadastro de usu�rio senha incompleta
 Dado que o usuario abra o navegador 
 E digita os dados informando senha incompleta
 Entao valida campo senha deve conter oito caracteres 
 
  @Cadastro_09
 Cenario: Realizar cadastro efetuado com sucesso
 Dado que o usuario abra o navegador 
 E digita os dados para efetuar o cadastro
 Entao valida cadastro efetuado com sucesso 
 
  @Cadastro_10
 Cenario: Realizar mais de um cadastro com sucesso
 Dado que o usuario abra o navegador 
 E digita os dados para efetuar os cadastros
 Entao valida cadastros efetuados com sucesso 
 
  @Cadastro_11
 Cenario: Realizar exclusao de cadastro 
 Dado que o usuario abra o navegador 
 E cadastra usuario para fazer a exclusao
 Entao valida cadastros excluido com sucesso 