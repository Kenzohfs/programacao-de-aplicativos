import java.util.Scanner;

public class ex_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int classe, pecasTotais = 0, pecasTotaisH = 0, pecasTotaisM = 0, qtdH = 0, qtdM = 0, numOpMaiorSalario = 0;
		double salario, totalFolhaPagamento = 0, maiorSalario = 0;

		for (int i = 0; i < 3; i++) {
			salario = 1200;
			System.out.println("Digite seu número: ");
			int num = sc.nextInt();

			System.out.println("Número de peças fabricadas no mês: ");
			int pecas = sc.nextInt();

			System.out.println("Sexo: \n1- Feminino \n2 - Masculino");
			int sexo = sc.nextInt();

			if (pecas <= 30) {
				classe = 1;
			} else if (pecas > 30 && pecas <= 50) {
				classe = 2;
				salario += salario * 0.03 * (pecas - 30);
			} else {
				classe = 3;
				salario += salario * 0.05 * (pecas - 30);
			}

			if (sexo == 1) {
				qtdM++;
				pecasTotaisM += pecas;
			} else {
				qtdH++;
				pecasTotaisH += pecas;
			}

			if (i == 0) {
				maiorSalario = salario;
				numOpMaiorSalario = num;
			} else if (maiorSalario < salario) {
				maiorSalario = salario;
				numOpMaiorSalario = num;
			}

			totalFolhaPagamento += salario;
			pecasTotais += pecas;

			System.out.println("Número do operário: " + num + "\nSalário: " + salario + "\nClasse: " + classe);
		}

		System.out.println("Folha de pagamento da empresa: " + totalFolhaPagamento
				+ "\nNúmero total de peças fabricadas: " + pecasTotais + "\nMédia das peças fabricadas pelos homens: "
				+ (pecasTotaisH / qtdH) + "\nMéida das peças fabricadas pelas mulheres: " + (pecasTotaisM * 1.0 / qtdM)
				+ "\nNúmero do operário de maior salário: " + numOpMaiorSalario + "\nSalário: " + maiorSalario);

		sc.close();
	}
}
