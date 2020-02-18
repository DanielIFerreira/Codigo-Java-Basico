package daniel.cursojavabasico.exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double larg = sc.nextDouble();
		double compr = sc.nextDouble();
		double metro = sc.nextDouble();
		
		double result = larg * compr;
		
		double valorTerreno = result * metro;
		
		System.out.printf("Area = %.2f%n" ,result);
		System.out.printf("Valor do terreno = %.2f%n" , valorTerreno);
		
		sc.close();
	}

}
