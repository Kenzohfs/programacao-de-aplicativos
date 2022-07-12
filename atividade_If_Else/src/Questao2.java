import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mesData, dia, ano;
		double hora;
		boolean verificacao = true;

		System.out.println("Informe o dia:");
		dia = sc.nextInt();
		if (dia > 31 || dia < 1) {
			verificacao = false;
		}

		System.out.println("Informe o mes: ");
		mesData = sc.nextInt();
		
		if (mesData > 12 || mesData < 1) {
			verificacao = false;
		}

		System.out.println("Informe o ano: ");
		ano = sc.nextInt();
		
		if (ano < 0) {
			verificacao = false;
		}

		System.out.println("Informe a hora: ");
		hora = sc.nextDouble();
		
		if (hora < 0 || hora > 23) {
			verificacao = false;
		}

		String mes = "Dezembro";

		if (mesData == 1) {
			mes = "Janeiro";
		} else if (mesData == 2) {
			mes = "Fevereiro";
		} else if (mesData == 3) {
			mes = "Março";
		} else if (mesData == 4) {
			mes = "Abril";
		} else if (mesData == 5) {
			mes = "Maio";
		} else if (mesData == 6) {
			mes = "Junho";
		} else if (mesData == 7) {
			mes = "Julho";
		} else if (mesData == 8) {
			mes = "Agosto";
		} else if (mesData == 9) {
			mes = "Setembro";
		} else if (mesData == 10) {
			mes = "Outubro";
		} else if (mesData == 11) {
			mes = "Novembro";
		}
		
		if (verificacao ) {			
			System.out.println("Data: " + dia + "/" + mes + "/" + ano + " - " + ((int) hora) + ":" + (int) (hora % 1 * 60) );
		} else {
			System.out.println("Data inválida!");
		}

		sc.close();
	}
}
