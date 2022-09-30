package ListaPOO;

import java.util.Scanner;

public class intervaloNumerosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		intervaloNumero intervalo = new intervaloNumero();
		
		System.out.println("Digite o piso do intervalo: ");
		intervalo.setN1(entrada.nextInt());
		System.out.println("Digite o teto do intervalo: ");
		intervalo.setN2(entrada.nextInt());
		System.out.println("Caso o teto seja menor do que o piso, o programa inverterá os valores... ");
		intervalo.verifica();
		
		System.out.println("Números entre "+intervalo.getN1()+" e "+intervalo.getN2());
		
		for (int x=intervalo.getN1()+1;x<intervalo.getN2();x++) {
			System.out.print(x + " | ");
		}
		
		
	}

}
