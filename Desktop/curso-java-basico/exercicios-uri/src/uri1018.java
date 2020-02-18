/*
 Leia um valor inteiro. A seguir, calcule o menor 
 n�mero de notas poss�veis (c�dulas) no qual o
 valor pode ser decomposto. As notas consideradas
 s�o de 100, 50, 20, 10, 5, 2 e 1. 
 A seguir mostre o valor lido e a rela��o de 
 notas necess�rias.
 */
import java.util.Scanner;


public class uri1018 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N, quociente, resto, nota;
		
		N = sc.nextInt();
		System.out.println(N);

		resto = N;

		nota = 100;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 50;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 20;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 10;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 5;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		nota = 2;
		quociente = resto / nota;
		System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
	    resto = resto % nota;

		System.out.println(resto + " nota(s) de R$ 1,00");

		sc.close();
	}
}