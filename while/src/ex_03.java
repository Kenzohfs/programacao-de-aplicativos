import java.util.Scanner;

public class ex_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, soma = 0, qtdNum = 0, maiorNum, menorNum, qtdNumPar = 0, somaNumPar = 0, qtdNumImpar = 0;

		System.out.println("Digite um n�mero: ");
		num = sc.nextDouble();
		maiorNum = num;
		menorNum = num;

		while (num != 30000) {
			soma += num;
			qtdNum++;

			if (maiorNum < num) {
				maiorNum = num;
			}

			if (menorNum > num) {
				menorNum = num;
			}

			if (num % 2 == 0) {
				qtdNumPar++;
				somaNumPar += num;
			} else {
				qtdNumImpar++;
			}

			System.out.println("Digite um n�mero: ");
			num = sc.nextDouble();
		}

		System.out.println("Soma: " + soma + "\nQuantidade de n�meros digitados: " + qtdNum + "\nMaior n�mero: "
				+ maiorNum + "\nMenor n�mero: " + menorNum + "\nM�dia dos n�meros pares: " + (somaNumPar / qtdNumPar)
				+ "\nPorcentagem dos n�meros �mpares sobre todos n�meros: " + (qtdNumImpar * 100.0 / qtdNum ) + "%");

		sc.close();
	}
}
