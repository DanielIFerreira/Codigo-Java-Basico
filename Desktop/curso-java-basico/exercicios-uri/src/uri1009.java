import java.util.Scanner;

public class uri1009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		double salarioBonus;
		
		salarioBonus = salarioFixo + (totalVendas * 0.15);
		
		System.out.println("Nome do vendedor = " + nome);
		System.out.printf("TOTAL = R$ %.2f", salarioBonus);
		
		sc.close();
	}

}
