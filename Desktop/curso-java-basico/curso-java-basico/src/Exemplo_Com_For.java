import java.util.Scanner;

public class Exemplo_Com_For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int soma = 0;
		
		for(int i=0; i<n;i++) {
			int x = sc.nextInt();
			soma = soma +x;
		}
		System.out.println(soma);
		//para mostrar e somar o valor 
		for(int i = 0; i<5; i ++) {
			System.out.println("Valor do i "+i);
		}
		System.out.println();
		//para mostrar e decrementar o valor.
		for(int i = 4; i>0; i --) {
			System.out.println("Valor do i "+i);
		}
		sc.close();

	}

}
