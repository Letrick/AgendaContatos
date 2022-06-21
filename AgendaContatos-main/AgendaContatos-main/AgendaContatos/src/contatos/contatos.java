package contatos;

public class contatos {

	String Nome;
//	String endereco;
//	Integer telefone;
//	String email;
	
	
	public contatos(String nome) {

		this.Nome = nome;
//		this.endereco = endereco;
//		this.telefone = telefone;
//		this.email = email;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append( Nome);
		return sb.toString();
	}
	
	

}
