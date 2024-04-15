package com.fiap;

import java.util.Scanner;

public class TesteEndereco {
	public static void main(String[] args) { 
	
		Endereco endereco = new Endereco();
		receberEndereco(endereco);
	}
		
	private static void receberEndereco(Endereco endereco) {
		// TODO Auto-generared method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o código do seu endereço: ");
		int cdEndereco = scanner.nextInt();
		scanner.nextLine(); // Consumir a quebra de linha pendente
		
		System.out.print("Digite o tipo do seu endereço: ");
		String tipoEndereco = scanner.nextLine();
		
		System.out.print("Digite o seu Cep: ");
		int nrCep = scanner.nextInt();
		scanner.nextLine(); // Consumir a quebra de linha pendente
		
		System.out.print("Digite o nome da sua rua: ");
		String nmRua = scanner.nextLine();
		
		System.out.print("Digite o nome do seu bairro: ");
		String nmBairro = scanner.nextLine();
		
		System.out.print("Digite o nome da sua cidade: ");
		String nmCidade = scanner.nextLine();
		
		System.out.print("Digite o nome do seu estado: ");
		String nmEstado = scanner.nextLine();
		
		System.out.print("Digite o nº do seu imóvel: ");
		int nrImovel = scanner.nextInt();
		
	
		Endereco adress = new Endereco();
		adress.setCdEndereco(cdEndereco);
		adress.setTipoEndereco(tipoEndereco);
		adress.setNrCep(nrCep);
		adress.setNmRua(nmRua);
		adress.setNmBairro(nmBairro);
		adress.setNmCidade(nmCidade);
		adress.setNmEstado(nmEstado);
		adress.setNrImovel(nrImovel);
		
		System.out.println("Seu endereço completo é: " + tipoEndereco);
		System.out.println(nmRua + ", " + nrImovel + ", " + nmBairro + ", " + nmCidade + ", " + nmEstado + ", " + nrCep);
	
		scanner.close();
	}





	
}

