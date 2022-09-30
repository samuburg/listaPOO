package ListaPOO;

import java.util.Scanner;

public class bombaCombustivelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		bombaCombustivel bomba1 = new bombaCombustivel();
		
		System.out.println("Digite o tipo de combustível: ");
		bomba1.setTipoCombustivel(entrada.next());
		System.out.println("Digite o valor por litro: ");
		bomba1.setValorLitro(entrada.nextFloat());
		System.out.println("Digite a quantidade de combustível: ");
		bomba1.setQuantidadeCombustivel(entrada.nextFloat());
		
		System.out.println("Abastecendo 20 Reais: "+bomba1.abastecePorValor(bomba1.getValorLitro(), 20)+" litros");
		System.out.println("Abastecendo 8 litros: "+bomba1.abastecePorLitro(bomba1.getValorLitro(), 8)+" reais");
		System.out.println("Altere o preço do litro: ");
		bomba1.alterarValor(entrada.nextFloat());
		System.out.println("Novo valor por litro: "+bomba1.getValorLitro());
		
	

	}

}
