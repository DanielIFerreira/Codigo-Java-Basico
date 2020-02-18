/*Salario com aumento*/
import java.util.Locale;
import java.util.Scanner;

public class uri1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double salarioA, nSalario = 0, reaju =0,porcem;
		
		System.out.println("Digite o salario do funcionario R$ ");
		salarioA = sc.nextDouble();
		
		if (salarioA >=0 && salarioA <= 400.00) {
			reaju= reaju + (salarioA * 0.15);
			nSalario = salarioA + (salarioA * 0.15);
			porcem = 15;
		}
		
		else if (salarioA >400.01 && salarioA <= 800.00) {
			reaju= reaju + (salarioA * 0.12);
			
			nSalario = salarioA+ (salarioA * 0.12);
			porcem = 12;
		}
		
		else if (salarioA >=800.01 && salarioA <= 1200.00) {
			reaju= reaju + (salarioA * 0.10);
		
			nSalario = salarioA + (salarioA * 0.10);
			porcem = 10;
		}
		else if (salarioA >1200.01 && salarioA <= 2000.00) {
			reaju= reaju + (salarioA * 0.07);
			
			nSalario = salarioA + (salarioA * 0.07);
			porcem = 7;
		}
		else {
			reaju= reaju + (salarioA * 0.04);
			nSalario = salarioA + (salarioA * 0.04);
			porcem = 4;
		}
		System.out.printf("Novo salario R$ %.2f%n", nSalario);
		System.out.printf("Reajuste ganhoo %.2f%n", reaju);
		System.out.println("Em percentual: " + porcem + " %");
		sc.close();
	}

}
