import java.util.Scanner;

public class Maths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		double num = sc.nextDouble();
				
		double quad = Math.pow(num, 2);
		double cub = Math.pow(num, 3);
		double raizq = Math.sqrt(num);
		double raizc = Math.cbrt(num);
		
		System.out.println("Número ao quadrado: " + quad);
		System.out.println("Número ao cubo: " + cub);
		System.out.println("Raiz quadrada: " + raizq);
		System.out.println("Raiz cúbica: " + raizc);
		
		sc.close();
	}
}
