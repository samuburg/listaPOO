package ListaPOO;

import java.util.Scanner;

public class televisorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		televisor monitor = new televisor();
		
		System.out.println("Digite o volume(máx 100): ");
		monitor.setVolume(entrada.nextInt());
		System.out.println("Digite o canal (máx 20): ");
		monitor.setCanal(entrada.nextInt());
		
		System.out.println("Aumentando 1 canal: "+monitor.aumentarCanal(monitor.getCanal(), 1));
		System.out.println("Diminuindo 2 canais: "+monitor.diminuirCanal(monitor.getCanal(), 2));
		System.out.println("Aumentando 4 volumes: "+monitor.aumentarVolume(monitor.getVolume(), 4));
		System.out.println("Diminuindo 3 volumes: "+monitor.diminuirVolume(monitor.getVolume(), 3));
		
		

	}

}
