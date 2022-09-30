package ListaPOO;

public class quadrado {
	private float lado;
	
	public static float area(float lado) {
		float area = lado*lado;
		
		return area;
	}
	

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("quadrado [lado=");
		builder.append(lado);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
