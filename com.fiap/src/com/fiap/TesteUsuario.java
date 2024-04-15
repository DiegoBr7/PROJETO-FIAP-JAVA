package com.fiap;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteUsuario {

	public static void main(String[] args) {

		Usuario usuario = new Usuario() ;
		receberUsuario(usuario);

	}
	private static void receberUsuario(Usuario usuario) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nomeCompleto = scanner.nextLine();

		System.out.print("Digite a data do seu aniversario (no formato DD/MM/YYYY): ");
		String dtAniversarioString = scanner.nextLine();
		LocalDate dtAniversario = LocalDate.parse(dtAniversarioString + "", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		/*		System.out.print("Digite a data de expiração (no formato MM/YY): ");
		String dataExpiracaoString = scanner.nextLine();
		LocalDate dtExpiracao = LocalDate.parse(dataExpiracaoString + "/01", DateTimeFormatter.ofPattern("MM/yy/dd")); */
		
		System.out.print("Digite o seu cpf: ");
		String nrCpf = scanner.nextLine();  
		
		System.out.print("Digite o seu sexo: ");
		String dsSexo = scanner.nextLine();
		
		System.out.print("Qual a sua profissão? ");
		String dsProfissao = scanner.nextLine();
		
		System.out.print("Digite o seu e-mail: ");
		String dsEmail = scanner.nextLine();
		
		System.out.print("Digite o valor do seu salario: ");
		double vlSalario = scanner.nextDouble();

		Usuario user = new Usuario();
		user.setNomeCompleto(nomeCompleto);
		user.setDtAniversario(dtAniversario);
		user.setNrCPF(nrCpf);
		user.setDsSexo(dsSexo);
		user.setDsProfissao(dsProfissao);
		user.setDsEmail(dsEmail);
		user.setVlSalario(vlSalario);


		System.out.println("Nome do usuário: " + user.getNomeCompleto());
		System.out.println("CPF do usuário: " + user.getNrCPF());
		System.out.println("Aniversário do usuário: " + user.getDtAniversario());
		System.out.println("Sexo do usuário: " + user.getDsSexo());
		System.out.println("Profissão do usuário: " + user.getDsProfissao());
		System.out.println("Email do usuário: " + user.getDsEmail());
		System.out.println("Salário do usuário: " + user.getVlSalario());


		scanner.close();
	}

}
