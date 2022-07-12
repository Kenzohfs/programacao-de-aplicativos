import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantidade de livros a serem comprados: ");
		int qtd = sc.nextInt();
		
		double precoA, precoB;
		precoA = 0.25 * qtd + 7.5;
		precoB = 0.5 * qtd + 2.5;
		
		String criterio = "B";
		
		if (precoA < precoB) {
			criterio = "A";
		}
		
		System.out.println("Melhor opção de desconto: " + criterio);
		
		sc.close();
	}
}
