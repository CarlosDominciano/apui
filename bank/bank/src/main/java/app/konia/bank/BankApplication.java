package app.konia.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankApplication {
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}
}
//3 - Desafio Java Spring Boot e React
//
//		Desenvolva uma API Rest em Spring Boot para operações bancárias.
//		A API deverá ter as seguintes funcionalidades:
//		- Criar boleto
//		- Listar boletos
//		- Ver detalhes dos boletos
//		- Pagar um boleto
//		- Cancelar um boleto
//
//		Para o desenvolvimento, utilize um banco de dados PostgreSQL com Docker.
//
//		Desenvolva um projeto React, que realize as operações bancárias consultando
//		os endpoints da API. A interface do usuário não precisa ser muito estilizada,
//		apenas responsiva e funcional.
//
//		Critérios de avaliação:
//		- Aplicação de padrões de código
//		- Tratamento de erros ao usuário
//		- Tratamento de erros em backend
//		- Usabilidade da interface
//
//Critérios obrigatórios:
//		- Criação de documentação técnica para execução do projeto (README)