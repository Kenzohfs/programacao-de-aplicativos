import java.util.Scanner;

public class N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double peso, gramas;
		
		System.out.println("Informe o peso do saco de ração em KG: ");
		peso = sc.nextDouble();
		
		System.out.println("Quantidade de ração fornecida para cada gato em gramas: ");
		gramas = sc.nextDouble();
		
		System.out.println("Quantidade de ração que sobrará após 5 dias em gramas: " + (peso * 1000 - (gramas * 2 * 5)));
		
		sc.close();
	}
}
