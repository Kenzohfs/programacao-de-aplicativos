import java.util.Scanner;

public class L {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor, ingresso;
		
		System.out.println("Informe o custo de um espet�culo teatral: ");
		valor = sc.nextDouble();
		
		System.out.println("Informe o pre�o do ingresso: ");
		ingresso = sc.nextDouble();
		
		System.out.println("Quantidade de ingressos que precisam ser vendidos para cobrir os custos do teatro: " + (valor / ingresso));
		
		sc.close();
	}
}
