package ListaPOO;

public class modelaPessoa {
	private String nome;
	private int idade;
	private float peso;
	private float altura;
	
	public static int envelhecer(int idade, int anos) {
		int envelhece = idade + anos;
		
		return envelhece;
		
	}
	
	public static float engordar(float peso, float quilo) {
		float engorda = peso + quilo;
		
		return engorda;
	}
	
	public static float emagrecer(float peso, float quilo) {
		float emagrece = peso-quilo;
		
		return emagrece;
	}
	
	public static float crescer(float altura, float centimetros) {
		float cresce = altura + centimetros;
		
		return cresce;
		
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("modelaPessoa [nome=");
		builder.append(nome);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", altura=");
		builder.append(altura);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
