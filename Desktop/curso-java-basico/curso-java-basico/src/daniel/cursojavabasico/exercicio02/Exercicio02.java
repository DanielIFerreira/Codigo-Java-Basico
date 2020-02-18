package daniel.cursojavabasico.exercicio02;

import java.util.Scanner;

import java.util.Locale;

public class Exercicio02 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		
		System.out.println("Prodcuts: ");
		System.out.printf("%s, wich price is $ %.2f%n ",product1,price1);
		System.out.printf("%s, wich price is $ %.2f%n",product2,price2);
		System.out.printf("Record: %d years old, code %s and gender:%c%n",age,code,gender);
		System.out.printf("Measue wirh eight deciaml places:" + measure);
		System.out.printf("%nUS decimal point: %.3f%n", measure);
		System.out.println("Digite um valor :" + x);
		Locale.setDefault(Locale.US);
		sc.close();
	}

}
