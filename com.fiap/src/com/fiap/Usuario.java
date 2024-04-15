package com.fiap;
 
import java.time.LocalDate;
 
public class Usuario {
 
	protected String nomeCompleto;
	protected String nrCpf;
	protected String cdUsuario;
 
	private LocalDate dtAniversario;
	private String dsSexo;
	private String dsProfissao;
	private String dsEmail;
	private double vlSalario;
	
 
	public Usuario() {
		this.nomeCompleto = new String(new char[40]);
		this.dsProfissao = new String(new char[15]);
		this.dsEmail = new String(new char[40]);
		this.dsSexo = new String(new char[10]);
	}
	
 
 
	public void Incluir (LocalDate dtAniversario , String dsSexo , String dsProfissao , String dsEmail , double vlSalario  ) {
 
		this.dtAniversario = dtAniversario;
		this.dsSexo = dsSexo;
		this.dsProfissao = dsProfissao;
		this.dsEmail = dsEmail;
		this.vlSalario = vlSalario;
 
	}
 
	public Usuario buscaUsuario(String nome) {
		return null;
 
	}
 
 
 
	public void cadastrarEndereco(String rua, int numero, String bairro, String cidade, String estado, String cep) {
 
		String endereco = rua + ", " + numero + ", " + bairro + ", " + cidade + ", " + estado + ", " + cep;
 
 
		System.out.println("Endereço cadastrado com sucesso!");
	}
 
	private int telefone;
 
	public void cadastrarTelefone(int telefone) {
		this.telefone = telefone;
	}
 
	private double carteira ;
	
	public void cadastrarCarteira(double Carteira) {
		this.carteira = Carteira;
	}
	private int cartaoDeCredito ;
	
	public void cadastrarCartaoDeCredito(int CartaoDeCredito) {
		this.cartaoDeCredito = CartaoDeCredito ;
	}
 
	private String banco ;  
	
	public void cadastrarBanco(String Banco) {
		this.banco = Banco ;
	}
 
 
	public String getDsEmail() {
		return dsEmail;
	}
 
	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}
 
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getNrCPF() {
		return nrCpf;
	}
	public void setNrCPF(String nrCPF) {
		this.nrCpf = nrCPF;
	}
	public String getCdUsuario() {
		return cdUsuario;
	}
	public void setCdUsuario(String cdUsuario) {
		this.cdUsuario = cdUsuario; // WARNING
	}
	public LocalDate getDtAniversario() {
		return dtAniversario;
	}
	public void setDtAniversario(LocalDate dtAniversario) {
		this.dtAniversario = dtAniversario;
	}
	public String getDsSexo() {
		return dsSexo;
	}
	public void setDsSexo(String dsSexo) {
		this.dsSexo = dsSexo;
	}
	public String getDsProfissao() {
		return dsProfissao;
	}
	public void setDsProfissao(String dsProfissao) {
		this.dsProfissao = dsProfissao;
	}
	public double getVlSalario() {
		return vlSalario;
	}
	public void setVlSalario(double vlSalario) {
		this.vlSalario = vlSalario;
	}
 
 
}

 