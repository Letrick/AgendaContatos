package main;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import agenda.Agenda;
import contatos.contatos;
import nome.Nome;


public class Cliente {


	public static void main(String[] args) {
		Integer opc;
		do {
			opc = menu();
			
			switch (opc) {
			case 1:
				listar();
				
				
				break;
				
			case 2:
				visualizar();
				
			
				break;
				
			case 3:
				inserir();
				
				break;
				
			case 4:
				editar();
				break;
				
			case 5:
				excluir();
				break;
				
			case 0:
				System.out.println("Finalizando a aplicacao...");
				System.exit(0);
				break;
			}
		} while (opc != 0);
		

		
		
	}
	
	public static Integer menu() {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("===================================\n");
		sb.append("=========  AGENDA   ==========\n");
		sb.append("===================================\n");
		sb.append("Digite 1 para Listar Contatos \n");
		sb.append("Digite 2 para Visualizar um contato \n");
		sb.append("Digite 3 para Inserir um novo contato \n");
		sb.append("Digite 4 para Editar um contato existente \n");
		sb.append("Digite 5 para Excluir um contato existente \n");
		sb.append("Digite 0 para Finalizar\n");
		
		System.out.println(sb.toString());
		Integer opc = scan.nextInt();
		
		
		return opc;
	}
	
	public static ArrayList<contatos>  listar() {
		ArrayList<contatos> contato = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		sb.append("===================================\n");
		sb.append("=========  Listagem de Contatos   =====\n");
		sb.append("===================================\n");
		System.out.println(sb.toString());


		
		Agenda agenda = new Agenda(contato);
		System.out.print(agenda.getContato());

	
		
		return contato;
	}
	
	public static ArrayList<Double> visualizar() {
		return null;

	}
	
	
	public static ArrayList<contatos> inserir() {
		ArrayList<contatos> contato = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		StringBuilder sb = new StringBuilder();
		sb.append("===================================\n");
		sb.append("=========  Inserir Contatos   =====\n");
		sb.append("===================================\n");
		sb.append("\n");
		System.out.println(sb.toString());
		


		

		System.out.println( "Insira o nome: ");
		String nome = sc.nextLine();

		contatos contatos = new contatos(nome);
		
		contato.add(contatos);
		
		
		
//		System.out.println("Nome: " + nome);
		

		return contato;

	}
	
	
	
	
	
	
	public static ArrayList<Double> editar() {
		return null;

	}
	
	public static ArrayList<Double> excluir() {
		return null;

	}
	
	
	
}
