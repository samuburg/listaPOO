package ListaPOO;

public class salarioLiquido {
	
	private float salarioHora;
	private int hora;
	
	public static float salarioBruto(float salarioHora, int hora) {
		float salarioBruto = salarioHora*hora;
		
		return salarioBruto;
	}
	
	public static float INSS(float salarioBruto) {
		float INSS = (float) (salarioBruto*0.08);
		
		return INSS;
	}
	
	public static float IR(float salarioBruto) {
		float IR = (float) (salarioBruto*0.11);
		
		return IR;
	}
	
	public static float sindicato(float salarioBruto) {
		float sindicato = (float) (salarioBruto*0.05);
		
		return sindicato;
	}
	
	public static float salarioLiquido(float salarioBruto) {
		float salarioLiquido = (float) (salarioBruto - (salarioBruto*0.24));
		
		return salarioLiquido;
	}
	
	
	
	
	
	
	public float getSalarioHora() {
		return salarioHora;
	}
	public void setSalarioHora(float salarioHora) {
		this.salarioHora = salarioHora;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("salarioLiquido [salarioHora=");
		builder.append(salarioHora);
		builder.append(", hora=");
		builder.append(hora);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
