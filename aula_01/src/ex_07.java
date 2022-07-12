import java.util.Scanner;

public class ex_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome, endereco;
		int telefone;
		
		System.out.print("Informe o nome: ");
		nome = sc.next();
		System.out.print("Informe o endereço: ");
		endereco = sc.next();
		System.out.print("Informe o telefone: ");
		telefone = sc.nextInt();
		
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
		
		sc.close();
	}
}
