package ListaPOO;

import java.util.Scanner;

public class operacaoBasicaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		operacaoBasica numeros = new operacaoBasica();
		
		System.out.println("Digite um valor para n1: ");
		numeros.setN1(entrada.nextFloat());
		
		System.out.println("Digite um valor para n2: ");
		numeros.setN2(entrada.nextFloat());
		
		System.out.println("Multiplicação: "+numeros.multiplica(numeros.getN1(),numeros.getN2()));
		System.out.println("divisão: "+numeros.divide(numeros.getN1(),numeros.getN2()));
		System.out.println("subtração: "+numeros.diminui(numeros.getN1(),numeros.getN2()));
		System.out.println("Adição: "+numeros.soma(numeros.getN1(),numeros.getN2()));
		
		

	}

}
