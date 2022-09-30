package ListaPOO;

public class operacaoBasica {
	
	private float n1;
	private float n2;

	
	public static float multiplica(float n1,float n2) {
		float multiplica = n1*n2;
		return multiplica;
	}
	
	public static float soma(float n1, float n2) {
		float soma = n1+n2;
		
		return soma;
	}
	
	public static float diminui(float n1, float n2) {
		float diminui = n1-n2;
		
		return diminui;
	}
	
	public static float divide(float n1, float n2) {
		float divide = n1/n2;
		
		return divide;
	}
	
	
	
	
	
	public float getN1() {
		return n1;
	}
	public void setN1(float n1) {
		this.n1 = n1;
	}
	public float getN2() {
		return n2;
	}
	public void setN2(float n2) {
		this.n2 = n2;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("operacaoBasica [n1=");
		builder.append(n1);
		builder.append(", n2=");
		builder.append(n2);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
