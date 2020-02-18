import java.util.Scanner;

public class Exemplo_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x, soma=0;
		x = sc.nextInt();
		
		
		while (x != 0) {
			x = sc.nextInt();
				
			
			if(x %2 == 0) {
				soma = soma+x;	
			}
		}
		System.out.println(soma);
		
		sc.close();

	}

}
