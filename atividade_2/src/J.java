import java.util.Scanner;

public class J {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dinheiro;
		
		System.out.println("Informe a quantidade de dinheiro possu�da: ");
		dinheiro = sc.nextDouble();
		
		System.out.println("D�lar: " + (dinheiro / 4.97 ) + "\nEuro: " + (dinheiro / 5.23) + "\nLibra Esterlina: " + (dinheiro / 6.25));
		
		sc.close();
	}
}
