/*Leia 2 valores inteiros (A e B). Ap�s, o programa deve 
 * mostrar uma mensagem "Sao Multiplos" ou 
 * "Nao sao Multiplos", indicando se os valores lidos s�o 
 * m�ltiplos entre si.*/
import java.util.Scanner;

public class uri1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A,B;
		
		System.out.println("Digite o primeiro numero: ");
		A = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		B = sc.nextInt();
		
		if(A % 2 == 0 && B % 2 == 0 ) {
			System.out.println("S�o Multiplos");
		}
		
		else {
			System.out.println("N�o s�o Multiplos");
		}
		sc.close();
	}

}
