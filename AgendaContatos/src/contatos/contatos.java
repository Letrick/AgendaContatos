package contatos;

public class contatos {

	String nome;
//	String endereco;
//	Integer telefone;
//	String email;
	
	
	public contatos(String nome) {

		this.nome = nome;
//		this.endereco = endereco;
//		this.telefone = telefone;
//		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + nome);
		return sb.toString();
	}
	
	

}
