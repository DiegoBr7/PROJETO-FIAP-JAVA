package com.fiap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteCartao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CartaoDeCredito cartao = new CartaoDeCredito();
		cadastrarCartao(cartao);
	}
	//teste cartao de credito
	private static void cadastrarCartao(CartaoDeCredito cartao) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o nome no cartao: ");
		String nmCartao = scanner.nextLine();

		System.out.print("Digite o numero do cartao: ");
		String nrCartao = scanner.nextLine();


		System.out.print("Digite a data de expiração (no formato MM/YY): ");
		String dataExpiracaoString = scanner.nextLine();
		LocalDate dtExpiracao = LocalDate.parse(dataExpiracaoString + "/01", DateTimeFormatter.ofPattern("MM/yy/dd"));

		System.out.print("Digite o numero de segurança: ");
		int nrSeguranca = scanner.nextInt();
		if (nrSeguranca > 999 || nrSeguranca < 111) {
			System.out.println("Nº invalido");
		} else {

		CartaoDeCredito cc = new CartaoDeCredito();
		cc.setNmCartao(nmCartao);
		cc.setNrCartao(nrCartao);
		cc.setDtExpiracao(dtExpiracao);
		cc.setNrSeguranca(nrSeguranca);

		// Imprimindo as informações do cartão
		System.out.println("Nome: " + cc.getNmCartao());
		System.out.println("Número: " + cc.getNrCartao());
		System.out.println("Data de Expiração: " + cc.getDtExpiracao().format(DateTimeFormatter.ofPattern("MM/YY")));
		System.out.println("Nº: " + cc.getNrSeguranca());

		scanner.close(); // Fechando o scanner após todas as operações
	}
	}
}
