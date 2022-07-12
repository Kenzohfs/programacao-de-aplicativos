import java.util.Scanner;

public class ex_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioMin, qtdkw = 1, valorkw, acrescimo = 0, fatura, faturamentoGeral = 0;
		int tipo, qtdConsumidorInter = 0;

		System.out.println("Salário mínimo: ");
		salarioMin = sc.nextDouble();
		valorkw = salarioMin / 8;

		while (qtdkw > 0) {
			System.out.println("Quantidade de quiloWatts gastos: ");
			qtdkw = sc.nextDouble();

			if (qtdkw > 0) {
				System.out.println("Tipo de consumidor: \n1 - Residencial \n2 - Comercial \n3 - Industrial");
				tipo = sc.nextInt();

				switch (tipo) {
				case 1:
					acrescimo = 0.05;
					break;
				case 2:
					acrescimo = 0.1;
					break;
				case 3:
					acrescimo = 0.15;
					break;
				}

				fatura = qtdkw * valorkw * (1 + acrescimo);
				faturamentoGeral += fatura;

				if (fatura > 500 && fatura < 1000) {
					qtdConsumidorInter++;
				}

				System.out.println("Valor do quilowatt: " + valorkw + "\nValor a ser pago: " + fatura + "\n");
			}
		}

		System.out.println("Faturamento geral da empresa: " + faturamentoGeral
				+ "\nQuantidade de consumidores que pagam entre 500 a 1000: " + qtdConsumidorInter);

		sc.close();
	}
}
