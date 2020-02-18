import java.util.Scanner;

public class uri1072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma=0, soma1=0;
		
		for(int i = 0; i < N; i++) {
			
			int	x = sc.nextInt();
			if(x >= 10 && x <= 20 ) {
				soma = soma +1;
			}
			else {
				soma1 = soma1 + 1;
			}
		}
		System.out.println(soma+ " Dentro!");
		System.out.println(soma1+ " Fora!");
		sc.close();

	}

}
