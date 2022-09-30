package ListaPOO;

public class intervaloNumero {
	private int n1;
	private int n2;
	private int n3;
	
	public void verifica() {
		if (n2<n1) {
			n3 = n2;
			n2 = n1;
			n1 = n3;
		}
	}
	
	
	
	
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("intervaloNumero [n1=");
		builder.append(n1);
		builder.append(", n2=");
		builder.append(n2);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	

}
