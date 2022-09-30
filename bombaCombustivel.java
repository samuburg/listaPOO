package ListaPOO;

public class bombaCombustivel {
	private String tipoCombustivel;
	private float valorLitro;
	private float quantidadeCombustivel;
	
	
	public static float abastecePorValor(float precoLitro, float reais) {
		float quantidadeCombustivel = reais/precoLitro;
		
		return quantidadeCombustivel;
	}
	public static float abastecePorLitro(float precoLitro, float quantidadeLitros) {
		float quantidadeReais = quantidadeLitros*precoLitro;
		
		return quantidadeReais;
	}
	public void alterarValor(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	public void alterarTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public void alterarQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	
	
	
	
	
	
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	public float getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	public void setQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("bombaCombustivel [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append(", quantidadeCombustivel=");
		builder.append(quantidadeCombustivel);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
