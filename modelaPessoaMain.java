package ListaPOO;

import java.util.Scanner;

public class modelaPessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		modelaPessoa pessoa1 = new modelaPessoa();
		
		System.out.println("Nome: ");
		pessoa1.setNome(entrada.next());
		System.out.println("Idade: ");
		pessoa1.setIdade(entrada.nextInt());
		System.out.println("Altura(em centímetros): ");
		pessoa1.setAltura(entrada.nextFloat());
		System.out.println("Peso: ");
		pessoa1.setPeso(entrada.nextFloat());
		
		
		System.out.println("Envelhece 2 anos: "+pessoa1.envelhecer(pessoa1.getIdade(), 2));
		System.out.println("Engordar 4 quilos: "+pessoa1.engordar(pessoa1.getPeso(), 4));
		System.out.println("Emagrecer 8 quilos: "+pessoa1.emagrecer(pessoa1.getPeso(), 8));
		System.out.println("Crescer 20 centímetros: "+pessoa1.engordar(pessoa1.getAltura(), 20));
		

	}

}
