package condicionais;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1, nota2, nota3;

		System.out.print("Informe a nota de exame de laboratório: ");
		nota1 = sc.nextDouble();

		System.out.print("Informe a nota de avaliação semestral: ");
		nota2 = sc.nextDouble();

		System.out.print("Informe a nota de exame final: ");
		nota3 = sc.nextDouble();

		double mp = ((nota1 * 2 + nota2 * 3 + nota3 * 5) / 10);

		String conceito = "A";

		if (mp < 5) {
			conceito = "E";
		}
		if (mp >= 5 && mp < 6) {
			conceito = "D";
		}
		if (mp >= 6 && mp < 7) {
			conceito = "C";
		}
		if (mp >= 7 && mp < 8) {
			conceito = "B";
		}
		if (mp >= 8) {
			conceito = "A";
		}

		System.out.println("Média ponderada: " + mp);
		System.out.println("Conceito: " + conceito);

		sc.close();
	}
}
