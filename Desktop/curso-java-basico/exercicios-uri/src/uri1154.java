import java.util.Scanner;

public class uri1154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
			int idade, cont = 0, soma = 0;
			double media;
			
			System.out.println("Qual a sua idade?");
			idade = sc.nextInt();
			
			
			while (idade > 0) {
				cont = cont + 1;
				soma = soma + idade;
				System.out.println("Qual a sua idade?");
				idade = sc.nextInt();
				
			}
		media = (double) soma/ cont;
		System.out.printf("media de idade : %.2f", media);
		sc.close();

	}

}
