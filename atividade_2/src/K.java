import java.util.Scanner;

public class K {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas, minutos;
		
		System.out.println("Informe a hora: ");
		horas = sc.nextInt();
		
		System.out.println("Informe os minutos: ");
		minutos = sc.nextInt();
		
		System.out.println("Hora em minutos: " + (horas * 60));
		System.out.println("Total em minutos: " + (minutos + (horas * 60)));
		System.out.println("Total em segundos: " + (((minutos * 60) + ((horas * 60) * 60))));
		
		sc.close();
	}
}
