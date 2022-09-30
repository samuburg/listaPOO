package ListaPOO;

public class cardapio {
	
	private int codigo;
	
	public static float preco(int codigo) {
		float preco = 0;
		
		if (codigo == 100) {
			preco = (float) 1.2;
			
		}else if (codigo==101) {
			preco = (float) 1.3;
		}else if (codigo==102) {
			preco = (float) 1.5;
		}else if (codigo==103) {
			preco = (float) 1.2;
		}else if (codigo==104) {
			preco = (float) 1.3;
		}else if (codigo==105) {
			preco = (float) 1.0;
		}
		
		
		
		return preco;
		
	}
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("cardapio [codigo=");
		builder.append(codigo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
