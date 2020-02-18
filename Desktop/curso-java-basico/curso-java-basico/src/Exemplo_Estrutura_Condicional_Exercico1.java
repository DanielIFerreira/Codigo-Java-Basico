import java.util.Locale;
import java.util.Scanner;

public class Exemplo_Estrutura_Condicional_Exercico1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double nota1, nota2, mediaFinal;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		mediaFinal = (nota1 + nota2);
		
		if (mediaFinal > 60.00) {
			System.out.printf("Nota Final %.1f",mediaFinal);
		}
		else {
			System.out.printf("Media Final %.1f%n", mediaFinal);
			System.out.println("REPROVADO!");
		}
		sc.close();
	}

}
