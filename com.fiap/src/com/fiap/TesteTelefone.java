package com.fiap;

import java.util.Scanner;

public class TesteTelefone {

	public static void main(String[] args) {
	
		Telefone telefone = new Telefone();
		receberTelefone(telefone);
		
		
}
	
	//teste telefone
	private static void receberTelefone(Telefone telefone) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Qual o tipo do seu telefone: ");
		String tipo = scanner.nextLine();

		System.out.print("Digite o seu DDD: ");
		byte DDD = scanner.nextByte();


		System.out.print("Digite o seu número: ");
		int nrCompleto = scanner.nextInt();

		if (nrCompleto > 999999999 || nrCompleto < 111111111) {
			System.out.println("Numero invalido");
		}else {	

			Telefone tel = new Telefone();
			tel.setDDD(DDD);
			tel.setNrCompleto(nrCompleto);
			tel.setTipo(tipo);

			

			System.out.println("Tipo: " + tel.getTipo() + ".(" + tel.getDDD() + ")" + tel.getNrCompleto());


			scanner.close();
		}

	}
}
