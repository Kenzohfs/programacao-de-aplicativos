import java.util.Scanner;

public class ex_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num ;
		
		System.out.println("Informe um n�mero: ");
		num = sc.nextDouble();
		
		while (num > 0) {			
			System.out.println("Valor lido: " + num + "\nQuadrado: " + (num * num) + "\nCubo: " + Math.pow(num, 3) + "\nRaiz quadrada: " + Math.sqrt(num));;
			
			System.out.println("\nInforme um n�mero: ");
			num = sc.nextDouble();
		}
		
		sc.close();
	}
}
