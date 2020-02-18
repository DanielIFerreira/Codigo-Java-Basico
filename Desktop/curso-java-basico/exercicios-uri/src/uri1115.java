import java.util.Scanner;

public class uri1115 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		int valor1,valor2 = 0;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		while(valor1 != 0 && valor2 !=0 ) {
			
			if(valor1 >0 && valor2 >0 ) {
				System.out.println("primeiro");
			}
			else if (valor1 >0 && valor2 <0) {
				System.out.println("quato");
			}
			else if(valor1 < 0 && valor2 < 0 ) {
				System.out.println("terceiro");
			}
			else if (valor1 < 0 && valor2 > 0 ) {
				System.out.println("segundo");
			}
			
			valor1 = sc.nextInt();
			valor2 = sc.nextInt();
		}
		
		
		
		sc.close();
	}

}
