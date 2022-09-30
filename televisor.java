package ListaPOO;

public class televisor {
	private int canal;
	private int volume;
	
	
	public static int aumentarVolume(int volume, int aumento) {
		int volumeTotal = volume+aumento;
		
		return volumeTotal;
	}
	public static int diminuirVolume(int volume, int decrescimo) {
		int volumeTotal = volume-decrescimo;
		
		return volumeTotal;
	}
	public static int diminuirCanal(int canal, int decrescimo) {
		int canalTotal = canal-decrescimo;
		
		return canalTotal;
	}
	public static int aumentarCanal(int canal, int aumento) {
		int canalTotal = canal+aumento;
		
		return canalTotal;
	}
	
	
	
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if (canal>=0&&canal<20) {
			this.canal = canal;
		}
	
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if (volume>=0||volume<100) {
			this.volume = volume;
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("televisor [canal=");
		builder.append(canal);
		builder.append(", volume=");
		builder.append(volume);
		builder.append("]");
		return builder.toString();
	}

	

}
