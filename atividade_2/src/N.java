import java.util.Scanner;

public class N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso, gramas;
		
		System.out.println("Informe o peso do saco de ra��o em KG: ");
		peso = sc.nextDouble();
		
		System.out.println("Quantidade de ra��o fornecida para cada gato em gramas: ");
		gramas = sc.nextDouble();
		
		System.out.println("Quantidade de ra��o que sobrar� ap�s 5 dias em gramas: " + (peso * 1000 - (gramas * 2 * 5)));
		
		sc.close();
	}
}
