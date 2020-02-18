import java.util.Scanner;

public class Exemplo_Comdicional_Simples_E_Composta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite que horas são:");
		int hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom Dia!");
		}
		else if(hora <= 18){
			System.out.println("Boa Tarde! ");
		}
		else  {
			
			System.out.println("Boa Noite!");
		}
		
		
		sc.close();
	}

}
