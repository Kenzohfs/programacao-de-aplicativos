import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioC, salarioJ;
		int meses = 0;

		System.out.println("Informe o salário de Carlos: ");
		salarioC = sc.nextDouble();

		salarioJ = salarioC / 3;
		
		while (salarioC > salarioJ) {
			meses++;
			salarioC *= 1.02;
			salarioJ *= 1.05;
		}
		
		System.out.println("Meses para a poupança de João ultrapassar a do Carlos: " + meses);

		sc.close();
	}
}
