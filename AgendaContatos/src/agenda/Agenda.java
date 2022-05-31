package agenda;

import java.util.ArrayList;

import contatos.contatos;

public class Agenda {
	
	private ArrayList<contatos> contato;

	public Agenda(ArrayList<contatos> contatos) {
		this.contato = contatos;
	}

	public ArrayList<contatos> getContatos() {
		return contato;
	}

	public void setContatos(ArrayList<contatos> contatos) {
		this.contato = contatos;
	}
	
	public void imprimeTodosContatosDaAgenda() {
		this.contato.forEach(contato -> {
			System.out.println(contato);
		});
	}
	
}