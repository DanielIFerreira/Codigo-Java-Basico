import java.util.Locale;

import java.util.Scanner;

public class uri1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double nota1 = sc.nextDouble();
		double x1 = 3.5;
		double nota2 = sc.nextDouble();
		double x2 = 7.5;
		double media;
		
		media = (x1*nota1 + x2*nota2)/11;
		
		
		System.out.printf("MEDIA = %.5f%n", media);
		sc.close();
	}

}
