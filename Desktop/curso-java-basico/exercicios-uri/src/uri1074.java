import java.util.Scanner;

public class uri1074 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			if( x % 2 ==0 && x > 0) {
				System.out.println("Par Positivo");
			}
			else if ( x % 2 == 0 && x < 0) {
				System.out.println("Par Negativo");
			}
			else if ( x % 2 != 0 && x > 0) {
				System.out.println("Impar Positivo");
			}
			else if ( x % 2 != 0 && x < 0) {
				System.out.println("Impar negativo");
			}
			else if (x == 0) {
				System.out.println("Nulo");
			}
		}
		
		sc.close();

	}

}
