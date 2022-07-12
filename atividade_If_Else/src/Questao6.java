import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------MENU----------- \n1 - Imposto \n2 - Novo Sal�rio \n3 - Classifica��o");
		int opcao = sc.nextInt();

		double salario;

		if (opcao > 3 || opcao < 1) {
			System.out.println("Op��o inv�lida.");
		} else if (opcao == 1) {
			System.out.println("Informe seu sal�rio: ");
			salario = sc.nextDouble();

			System.out.print("Valor do imposto: ");

			if (salario < 500) {
				System.out.println(salario * 0.05);
			} else if (salario >= 500 & salario <= 850) {
				System.out.println(salario * 0.1);
			} else {
				System.out.println(salario * 0.15);
			}
		} else if (opcao == 2) {
			System.out.println("Informe seu sal�rio: ");
			salario = sc.nextDouble();

			System.out.println("Novo sal�rio: ");

			if (salario > 1500) {
				System.out.println(salario + 25);
			} else if (salario <= 1500 && salario > 750) {
				System.out.println(salario + 50);
			} else if (salario >= 450 && salario <= 750) {
				System.out.println(salario + 75);
			} else {
				System.out.println(salario + 100);
			}
		} else if (opcao == 3) {
			System.out.println("Informe seu sal�rio: ");
			salario = sc.nextDouble();

			if (salario <= 700) {
				System.out.println("Mal remunerado");
			} else {
				System.out.println("Bem remunerado");
			}
		}

		sc.close();
	}
}
