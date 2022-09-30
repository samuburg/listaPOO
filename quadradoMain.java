package ListaPOO;

import java.util.Scanner;

public class quadradoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		quadrado quadrado = new quadrado();
		
		System.out.println("Por favor, digite a medida do lado do quadrado: ");
		quadrado.setLado(entrada.nextFloat());
		
		System.out.println("Valor do lado: "+quadrado.getLado());
		System.out.println("Valor da área: "+quadrado.area(quadrado.getLado()));

	}

}
