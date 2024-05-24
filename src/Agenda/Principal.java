package Agenda;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda("minha agenda", 100);
		
		int opc = scan.nextInt();
		
		do {
			
			System.out.println("1-cadastrar contato");
			System.out.println("2-remover contato");
			System.out.println("3-alterar contato");
			System.out.println("4-listar contato");
			System.out.println("5-listar aniversariantes");
			System.out.println("6-sair");
			
			
			switch(opc) {
				case 1: 
					System.out.println("informe o nome: ");
					String nome = scan.nextLine();
					scan.nextLine();
					System.out.println("informe o numero de telefone: ");
					String telefone = scan.nextLine();
					System.out.println("informe o dia, mes e ano de nascimento: ");
					int dia = scan.nextInt();
					int mes = scan.nextInt();
					int ano = scan.nextInt();
					
					Data data = new Data(dia, mes, ano);
					Pessoa pessoa = new Pessoa (nome, telefone, data);
					if(agenda.adicionaContato(pessoa)) {
						System.out.println("o seu contato foi adicionado com sucesso ");
					}else {
						System.out.println("contato ja exite ");
					
					}
					break;
					
				case 2: 
					System.out.println("informe o nome do contato que voce quer remover");
					String nomeRemov = scan.nextLine();
					
					Pessoa remove = new Pessoa(nomeRemov);
					if(agenda.removeContato(remove)){
						System.out.println("o seu contato foi removido ");
					}else {
						System.out.println("esse contato nao existe ");
			        }
					break;
					
				case 3: 
					System.out.println("informe o nome do contato da pessoa que voce quer alterar");
					String nomeAltera = scan.nextLine();
					System.out.println("informe o novo nome");
					String nomeNovo = scan.nextLine();
					System.out.println("informe um novo telefone");
					String telNovo = scan.nextLine();
					System.out.println("dia, mes e ano de nascimento");
					int diaNovo = scan.nextInt();
					int mesNovo = scan.nextInt();
					int anoNovo = scan.nextInt();
					
					Data dataAltera = new Data(diaNovo, mesNovo,anoNovo);
					Pessoa pessoaAltera = new Pessoa(nomeNovo, telNovo, dataAltera);
					
					if(agenda.alteraContato(nomeAltera, pessoaAltera)) {
						System.out.println("contato alterado com sucesso");
					}else {
						System.out.println("nao foi possivel alterar o contato");
					}
					
					
					break;
					
				case 4:
					System.out.println("contatos na lista: ");
					agenda.listaTelefone();
					break;
					
				case 5: 
					System.out.println("informe o mes de aniversario");
					String  mes01 = scan.nextLine();
					
					agenda.listaAniversarios(mes01);
					break;
				case 6:
					default:
						break;
					
					
					
				}
					
			
			
		}while(opc != 0);
		
		
	
	scan.close();
	}
		
	
		
	
}
