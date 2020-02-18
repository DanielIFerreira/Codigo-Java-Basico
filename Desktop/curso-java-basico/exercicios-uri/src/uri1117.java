import java.util.Locale;
import java.util.Scanner;

public class uri1117 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1 = sc.nextInt();
		while(nota1 < 0.00 || nota1 >10.00) {
			System.out.println("nota invalida");
			nota1 = sc.nextDouble();
		}
		
		double nota2 = sc.nextInt();
		while(nota2<0.00 || nota2 <10.00){
				System.out.println("nota invalida");
			nota2 = sc.nextDouble();
		}
		double media = (nota1+ nota2)/2.00;
		System.out.printf("media = %.2f%n ",media);
		sc.close();
	}

}
