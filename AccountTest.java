package ListaPOO;

import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args){
		Scanner entrada = new Scanner (System.in);
		
		Account account1 = new Account("Jane Green", 50.00);
		Account account2  = new Account("John BLue", -7.53);
		
		System.out.println(account1.getName() + ": "+account1.getBalance());
		System.out.println(account2.getName() + ": "+account2.getBalance());
		
		
		System.out.println("Entre com um depósito para a conta 1:");
		double depositAmount = entrada.nextDouble();
		System.out.println("Adicionando "+ depositAmount+" para a conta 1");
		account1.deposit(depositAmount);
		
		System.out.println(account1.getName() + ": "+account1.getBalance());
		System.out.println(account2.getName() + ": "+account2.getBalance());
		
		System.out.println("Entre com um depósito para a conta 2:");
		depositAmount = entrada.nextDouble();
		System.out.println("Adicionando "+ depositAmount+" para a conta 2");
		account2.deposit(depositAmount);
		
		System.out.println(account1.getName() + ": "+account1.getBalance());
		System.out.println(account2.getName() + ": "+account2.getBalance());
		
		
		
		
	}

}
