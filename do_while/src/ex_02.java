import java.util.Scanner;

public class ex_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont = 0, cod, numVeiculos, numAcidentes, codMaiorAcidente = 0, codMenorAcidente = 0, qtdMaiorAcidente = 0,
				qtdMenorAcidente = 0, somaVeiculos = 0, numAcidentesMenor2000 = 0, qtdAcidentesMenor2000 = 0;

		do {
			System.out.println("C�digo da cidade: ");
			cod = sc.nextInt();

			System.out.println("N�mero de ve�culos de passeio: ");
			numVeiculos = sc.nextInt();

			System.out.println("N�mero de acidentes com v�timas: ");
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

		System.out.print("C�digo da cidade com maior �ndice de acidentes: " + codMaiorAcidente + "\nMaior �ndice de acidentes: "
				+ qtdMaiorAcidente + "\nC�digo da cidade com menor �ndice de acidentes: " + codMenorAcidente
				+ "\nMenor �ndice de acidentes: " + qtdMenorAcidente + "\nM�dia de ve�culos: " + (somaVeiculos / 5.0));

		if (qtdAcidentesMenor2000 > 0) {
			System.out.println("\nM�dia de acidentes em cidades com menos de 2000 ve�culos: "
					+ (numAcidentesMenor2000 / qtdAcidentesMenor2000));
		}

		sc.close();
	}
}
