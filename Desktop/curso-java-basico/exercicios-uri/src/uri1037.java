import java.util.Scanner;

public class uri1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n;
		
		System.out.println("Digite um numero qualque: ");
		n = sc.nextFloat();
		
		if( n >= 0f && n <= 25f ) {
			System.out.println("Intervalo  [0,25]");
		}
		else if (n >25f && n <= 50f) {
			System.out.println("Intervalo [25,50]");
		}
		
		else if (n >50f && n <= 75f) {
			System.out.println("Intervalo [50,75]");
		}
		else if (n > 75 && n <= 100){
			System.out.println("Intervalo [75,100]");
			
			}
		else {
			System.out.println("Fora do Intervalo");
		}
		
		sc.close();
	}

}
