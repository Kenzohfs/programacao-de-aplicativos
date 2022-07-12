import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Primeira data: \nInforme o dia: ");
		int dia1 = sc.nextInt();

		System.out.print("Informe o mês: ");
		int mes1 = sc.nextInt();

		System.out.print("Informe o ano: ");
		int ano1 = sc.nextInt();

		System.out.print("Segunda data: \nInforme o dia");
		int dia2 = sc.nextInt();

		System.out.print("Informe o mês: ");
		int mes2 = sc.nextInt();

		System.out.print("Informe o ano: ");
		int ano2 = sc.nextInt();

		int data1, data2;

		data1 = dia1 + (mes1 * 30) + (ano1 * 365);
		data2 = dia2 + (mes2 * 30) + (ano2 * 365);

		if (data1 < data2) {
			System.out.println("Ordem cronológica: \n" + dia1 + "/" + mes1 + "/" + ano1);
			System.out.println(dia2 + "/" + mes2 + "/" + ano2);
		} else {
			System.out.println("Ordem cronológica: \n" + dia2 + "/" + mes2 + "/" + ano2);
			System.out.println(dia1 + "/" + mes1 + "/" + ano1);
		}

		sc.close();
	}
}
