/*Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y 
 uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.
 */
import java.util.Scanner;

public class uri1113 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int x, y ;
		
		System.out.println("digite um valor: ");
		x = sc.nextInt();
		
		System.out.println("Digte outro valor: ");
		y = sc.nextInt();
		
		while(x != y) {
			
			if(x < y) {
				System.out.println("Crescente!");
			}
			else  {
				System.out.println("Decrescente!");
			}
		System.out.println("digite um valor: ");
		x = sc.nextInt();
			
		System.out.println("Digte outro valor: ");
		y = sc.nextInt();
		}
		
		sc.close();

	}

}
