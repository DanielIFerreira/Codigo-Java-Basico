import java.util.Scanner;

public class uri1008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nFun = sc.nextInt();
		int nHoraTrabalhada = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		double salarioMes;
		
		salarioMes = nHoraTrabalhada * valorPorHora;
		
		System.out.println("Numero do funcionario = " + nFun);
		System.out.printf("Salario do Funcionario é : R$ %.2f", salarioMes);
		
		sc.close();
	}

}
