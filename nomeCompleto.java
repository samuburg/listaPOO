package ListaPOO;

public class nomeCompleto {
	private String nome;
	private String sobrenome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nomeCompleto [nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
