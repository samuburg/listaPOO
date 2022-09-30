package ListaPOO;

import java.util.Scanner;

public class nomeCompletoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		nomeCompleto nome = new nomeCompleto();
		
		System.out.println("digite o seu nome: ");
		nome.setNome(entrada.nextLine());
		System.out.println("Digite seu sobrenome: ");
		nome.setSobrenome(entrada.nextLine());
		
		System.out.println("O nome completo é: "+nome.getNome()+" "+nome.getSobrenome());

	}

}
