package ListaPOO;

import java.util.Scanner;

public class salarioLiquidoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		salarioLiquido dinheiro = new salarioLiquido();
		
		System.out.println("Quanto você ganha por hora? ");
		dinheiro.setSalarioHora(entrada.nextFloat());
		System.out.println("Quantas horas você trabalhou este mes? ");
		dinheiro.setHora(entrada.nextInt());
		
		System.out.println("Salário bruto: "+dinheiro.salarioBruto(dinheiro.getSalarioHora(), dinheiro.getHora()));
		System.out.println("Total INSS: "+dinheiro.INSS(dinheiro.salarioBruto(dinheiro.getSalarioHora(), dinheiro.getHora())));
		System.out.println("Total IR: "+dinheiro.IR(dinheiro.salarioBruto(dinheiro.getSalarioHora(), dinheiro.getHora())));
		System.out.println("Total Sindicato: "+dinheiro.sindicato(dinheiro.salarioBruto(dinheiro.getSalarioHora(), dinheiro.getHora())));
		System.out.println("Salario liquido: "+dinheiro.salarioLiquido(dinheiro.salarioBruto(dinheiro.getSalarioHora(), dinheiro.getHora())));
		
		
		
		
		
		
		

	}

}
