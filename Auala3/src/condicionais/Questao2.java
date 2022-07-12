package condicionais;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3;

		System.out.print("Informe a primeira nota: ");
		nota1 = sc.nextDouble();

		System.out.print("Informe a segunda nota: ");
		nota2 = sc.nextDouble();

		System.out.print("Informe a terceira nota: ");
		nota3 = sc.nextDouble();

		double media = (nota1 + nota2 + nota3) / 3;

		System.out.println("Média: " + media);

		if (media < 3) {
			System.out.println("Reprovado");
		}
		if (media >= 3 && media < 7) {
			System.out.println("Em exame \nNota necessária no exame: " + (6 - media));
		}
		if (media >= 7) {
			System.out.println("Aprovado");
		}

		sc.close();
	}
}
