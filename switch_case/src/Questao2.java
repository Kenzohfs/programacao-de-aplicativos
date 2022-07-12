import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Código do produto: ");
		int codigo = sc.nextInt();
		
		System.out.println("Peso do produto (em KG): ");
		double peso = sc.nextDouble();
		
		System.out.println("Código do páis de origem");
		int codigoPais = sc.nextInt();
		
		double preco = 0;
		
		if (codigo > 0 && codigo < 5) {
			preco = 10 * peso * 1000;
		} else if (codigo > 4 && codigo < 8) {
			preco = 25 * peso * 1000;
		} else {
			preco = 35 * peso * 1000;
		}
		
		double imposto = 0;
		
		switch(codigoPais) {
		case 2:
			imposto = preco * 0.15;
			break;
		case 3:
			imposto = preco * 0.25;
			break;
		}
		
		System.out.println("Peso (Gramas): " + peso * 1000 + "\nPreço total: " + preco + "\nValor do imposto: " + imposto + "\nValor total: " + (preco + imposto));
		
		sc.close();
	}
}
