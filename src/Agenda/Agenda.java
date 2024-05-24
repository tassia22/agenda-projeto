package Agenda;

public class Agenda {
	
	private String nomeAgenda;
	private Pessoa [] contatos;
	
	
	
	
	public Agenda(String nomeAgenda, int tamanho) {
		this.nomeAgenda = nomeAgenda;
		this.contatos = new Pessoa[tamanho];
	}

	
	public boolean adicionaContato(Pessoa pessoa) {
		
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] == null) {
				contatos[i] = pessoa;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean removeContato(Pessoa pessoa) {
		
		boolean remove = false;
		
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null) {
				if(contatos[i].getNome() == pessoa.getNome()){
					contatos[i] = null;
					remove = true;
					
				}
			}
		}
		
		return remove;
	}
	
	public Pessoa buscaContato(String nome) {
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null) {
				if(contatos[i].getNome().equals(nome)) {
					return contatos[i];
				}
			}
		}
			return null;
	
	}
	
	public boolean alteraContato(String nome, Pessoa pessoa){
		for(int i = 0; i < contatos.length; i++){
			if(contatos[i] != null) {
				if(contatos[i].getNome().equals(nome)) {
					contatos[i] = pessoa;
							return true;
						}
						
					}
			}
		
		return false;
	}
	
	
	public Pessoa[] listaAniversarios(String mes) {
		int cont = 0;
		String [] aniversario;
		Pessoa [] aniversariante = new Pessoa[contatos.length];
		
		for(int i = 0; i < contatos.length; i++){
			if(contatos[i] != null) {
				aniversario = contatos[i].aniversario();
				if(aniversario[1].equals(mes)) {
					aniversariante[cont++] = contatos[i];
				}
			}
		}
		
		return aniversariante;
		
	}
	
	public Pessoa [] listaTelefone(){
		int cont = 0;
		
		Pessoa [] telefone = new Pessoa[contatos.length];
		for(int i = 0; i < contatos.length; i++){
			if(contatos[i] != null) {
				if(!contatos[i].getTelefone().equals("0")) {
					telefone[cont++] = contatos[i];
				}		
			}
		}
		
		return telefone;
		
	}
	
	
	
	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public Pessoa[] getcontatos(){
		return contatos;
	}
		
}
