import java.util.Scanner;

public class uri1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int numeroPeca1 = sc.nextInt();
		double valorUni1 = sc.nextDouble();
		
	
		int numeroPeca2 = sc.nextInt();
		double valorUni2 = sc.nextDouble();
		
		double valorFinal;
		
		valorFinal = (numeroPeca1 * valorUni1) + (numeroPeca2 * valorUni2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorFinal);
		sc.close();
	}
	
}
