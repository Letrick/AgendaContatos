package agenda;

import java.util.ArrayList;

import contatos.contatos;

public class Agenda {
	
	private ArrayList<contatos> contato;

	public Agenda(ArrayList<contatos> contatos) {
		this.setContato(contatos);
	}

	public ArrayList<contatos> getContatos() {
		return getContato();
	}

	public void setContatos(ArrayList<contatos> contatos) {
		this.setContato(contatos);
	}
	
	public void imprimeTodosContatosDaAgenda() {
		this.getContato().forEach(contato -> {
			System.out.println(contato);
		});
	}

	public ArrayList<contatos> getContato() {
		return contato;
	}

	public void setContato(ArrayList<contatos> contato) {
		this.contato = contato;
	}
	
}