import java.util.Scanner;

public class ex_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0, cod, numVeiculos, numAcidentes, codMaiorAcidente = 0, codMenorAcidente = 0, qtdMaiorAcidente = 0,
				qtdMenorAcidente = 0, somaVeiculos = 0, numAcidentesMenor2000 = 0, qtdAcidentesMenor2000 = 0;

		do {
			System.out.println("Código da cidade: ");
			cod = sc.nextInt();

			System.out.println("Número de veículos de passeio: ");
			numVeiculos = sc.nextInt();

			System.out.println("Número de acidentes com vítimas: ");
			numAcidentes = sc.nextInt();

			if (cont == 0) {
				codMaiorAcidente = cod;
				codMenorAcidente = cod;
				qtdMaiorAcidente = numAcidentes;
				qtdMenorAcidente = numAcidentes;
			}

			if (qtdMaiorAcidente < numAcidentes) {
				codMaiorAcidente = cod;
				qtdMaiorAcidente = numAcidentes;
			}

			if (qtdMenorAcidente > numAcidentes) {
				codMenorAcidente = cod;
				qtdMenorAcidente = numAcidentes;
			}

			somaVeiculos += numVeiculos;

			if (numVeiculos < 2000) {
				qtdAcidentesMenor2000++;
				numAcidentesMenor2000 += numAcidentes;
			}

			cont++;
		} while (cont < 5);

		System.out.print("Código da cidade com maior índice de acidentes: " + codMaiorAcidente + "\nMaior índice de acidentes: "
				+ qtdMaiorAcidente + "\nCódigo da cidade com menor índice de acidentes: " + codMenorAcidente
				+ "\nMenor índice de acidentes: " + qtdMenorAcidente + "\nMédia de veículos: " + (somaVeiculos / 5.0));

		if (qtdAcidentesMenor2000 > 0) {
			System.out.println("\nMédia de acidentes em cidades com menos de 2000 veículos: "
					+ (numAcidentesMenor2000 / qtdAcidentesMenor2000));
		}

		sc.close();
	}
}
