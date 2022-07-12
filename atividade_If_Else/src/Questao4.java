import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora1, hora2, minuto1, minuto2;

		System.out.print("Hora de início do jogo: \nHora: ");
		hora1 = sc.nextInt();

		System.out.print("Minutos: ");
		minuto1 = sc.nextInt();

		System.out.print("Hora de término do jogo: \nHora: ");
		hora2 = sc.nextInt();

		System.out.print("Minutos: ");
		minuto2 = sc.nextInt();

		int minutosTotais1, minutosTotais2, minutosTotais;

		minutosTotais1 = (hora1 * 60) + minuto1;
		minutosTotais2 = (hora2 * 60) + minuto2;
		minutosTotais = minutosTotais1 - minutosTotais2;

		if (minutosTotais == 0) {
			System.out.println("O jogo não pode ter mais que 24 horas!");
		} else {
			if (minutosTotais < 0) {
				minutosTotais *= -1;
			}
			System.out.println("Duração do jogo: " + ((int) minutosTotais / 60) + ":" + minutosTotais % 60);
		}

		sc.close();
	}
}
