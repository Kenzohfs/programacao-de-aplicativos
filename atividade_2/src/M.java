import java.util.Scanner;

public class M {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioMin, qtdKW;
		
		System.out.println("Salário mínimo: ");
		salarioMin = sc.nextDouble();
		
		System.out.println("Quantidade de quiloWatts gastos: ");
		qtdKW = sc.nextDouble();
		
		System.out.println("Valor do quiloWatt: R$ " + (salarioMin / 5));
		System.out.println("Valor a ser pago: R$ " + ((salarioMin / 5) * qtdKW));
		System.out.println("Valor a ser pago com 15% de desconto: R$ " + (((salarioMin / 5) * qtdKW) * 0.85));
		
		sc.close();
	}
}
