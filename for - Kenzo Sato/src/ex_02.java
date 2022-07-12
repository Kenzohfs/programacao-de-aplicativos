import java.util.Scanner;

public class ex_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, jogMenor18 = 0, somaIdade, qtdJog = 0, qtdJog80kg = 0;
		double peso, altura, somaAltura = 0;

		for (int i = 0; i < 2; i++) {
			somaIdade = 0;
			for (int a = 0; a < 11; a++) {
				System.out.println("Informe sua idade: ");
				idade = sc.nextInt();

				System.out.println("Informe seu peso (em KG):");
				peso = sc.nextDouble();

				System.out.println("Informe sua altura: ");
				altura = sc.nextDouble();

				if (idade < 18) {
					jogMenor18++;
				}

				if (peso > 80) {
					qtdJog80kg++;
				}

				qtdJog++;
				somaIdade += idade;
				somaAltura += altura;
			}

			System.out.println("Média de idade do time " + (i + 1) + ": " + (somaIdade / 11.0));
		}

		System.out.println("Quantidade de jogadores com idade menor que 18: " + jogMenor18 + "\nMédia de altura: "
				+ (somaAltura / 22.0) + "\nPorcentagem de jogadores com mais de 80KG: "
				+ (100.0 * qtdJog80kg / qtdJog));

		sc.close();
	}
}
