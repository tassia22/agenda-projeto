package Agenda;

public class Pessoa {
	private String nome;
	private String telefone;
	private Data nascimento;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, String telefone, Data nascimento) {
		this.nome = nome;
		this.telefone = "0";
		this.nascimento = new Data(1, 6, 1980);
	}
	
	public String [] aniversario() {
		String [] rsp = new String[2];
		rsp[0] = Integer.toString(nascimento.getDia());
		rsp[1] = Integer.toString(nascimento.getMes());
		return rsp;
		
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Data getNascimento() {
		return nascimento;
	}

	public void setNascimento(Data nascimento) {
		this.nascimento = nascimento;
	}
	
	
	
	

}
