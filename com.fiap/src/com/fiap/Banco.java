package com.fiap;

public class Banco 	{

	private byte nroBanco ;	
	private String nomeBanco ;
	private String agencia ;
	private String conta ;
	
	public Banco() {
	}


	public void incluirBanco (String nomeBanco , String agencia , String conta, byte nroBanco  ) {
		this.nroBanco = nroBanco;
		this.nomeBanco = nomeBanco;
		this.agencia = agencia;
		this.conta = conta;
	}

	public void consultaBanco(byte nroBanco) {
		System.out.println("Qual o numero do Banco ?");
		if(this.nroBanco == nroBanco) {
			System.out.println("Numero do Banco: " + this.nroBanco);
			System.out.println("Nome do Banco: " + this.nomeBanco);
			System.out.println("Agencia: " + this.agencia );
			System.out.println("Conta: " + this.conta);
		}else {
			System.out.println("Numero não encontrado ! ");
		}
	}

	public byte getNroBanco() {
		return nroBanco;
	}

	public void setNroBanco(byte nroBanco) {
		this.nroBanco = nroBanco;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}
}

