import java.util.Locale;
import java.util.Scanner;

public class uri1020 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int resto, result, ano;
		int idade = sc.nextInt();
		
		
		resto = idade;
		
		ano = 365;
		result = resto/ano;
		System.out.println(result + " ano(s)");
		resto = resto % ano;
		
		ano = 30;
		result = resto/ano;
		System.out.println(result + " mes(es)");
		resto = resto % ano;
		
		System.out.println(resto + " dia(s)");
	
		sc.close();
	}

}
