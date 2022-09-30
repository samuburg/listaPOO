package ListaPOO;

import java.util.Scanner;

public class cardapioMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		cardapio menu = new cardapio();
		int codigo = 0;
		float total =0;
		boolean sit = true;
		
		while (sit==true) {
			
			do {
				System.out.println("Código do item: (99 finaliza)");
				codigo = entrada.nextInt();
				if (codigo<99&& codigo<106){
					System.out.println("Por favor, digite apenas o código entre 100 e 105(ou 99 para finalizar)");
				}else {
					menu.setCodigo(codigo);
					total = menu.preco(codigo)+total;
				}
			}while (codigo<99&& codigo<106);
			if (codigo==99) {
				sit=false;
			}
		}
		
		
		System.out.println("Total dos produtos selecionados: "+total);

		
		
		

	}

}
