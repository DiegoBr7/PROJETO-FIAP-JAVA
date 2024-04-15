package com.fiap;

import java.time.LocalDate;
import java.util.Scanner;

public class TesteCarteira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carteira carteira = new Carteira();
		receberTransacao(carteira); // 
	}

	// Codigo de teste de (Transação e Carteira)
	public static void receberTransacao(Carteira carteira) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor da transação: ");
		double valor = scanner.nextDouble();
		scanner.nextLine(); // Consumir a quebra de linha pendente

		System.out.print("Digite a descrição da transação: ");
		String descricao = scanner.nextLine();

		Transacao transacao = new Transacao();
		transacao.setValor(valor);
		transacao.setDescricao(descricao);
		transacao.setData(LocalDate.now());

		if (descricao.equals("ganho")) {
			carteira.receber(transacao.getValor());
		} else {
			carteira.retirar(transacao.getValor());
		}

		System.out.println("Transação recebida:");
		System.out.println("Valor: " + transacao.getValor());
		System.out.println("Descrição: " + transacao.getDescricao());
		System.out.println("Data: " + transacao.getData());
		System.out.println("Saldo atual da carteira: " + carteira.getSaldo());

		scanner.close(); // Fechando o scanner após todas as operações 
	}
}
