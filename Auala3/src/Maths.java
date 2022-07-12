import java.util.Scanner;

public class Maths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um n�mero: ");
		double num = sc.nextDouble();
				
		double quad = Math.pow(num, 2);
		double cub = Math.pow(num, 3);
		double raizq = Math.sqrt(num);
		double raizc = Math.cbrt(num);
		
		System.out.println("N�mero ao quadrado: " + quad);
		System.out.println("N�mero ao cubo: " + cub);
		System.out.println("Raiz quadrada: " + raizq);
		System.out.println("Raiz c�bica: " + raizc);
		
		sc.close();
	}
}
