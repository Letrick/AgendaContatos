package nome;

public class Nome {

	
	public String nome;
	
	public Nome(String nome) {
	this.nome = nome;
	
	
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		return sb.toString();
	}
	


	

}
