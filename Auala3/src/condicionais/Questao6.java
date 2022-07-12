package condicionais;

import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número " + num + " é par!");
		} 
		if (num % 2 != 0) {
			System.out.println("O número " + num + " é ímpar!");
		}
		
		sc.close();
	}
}
