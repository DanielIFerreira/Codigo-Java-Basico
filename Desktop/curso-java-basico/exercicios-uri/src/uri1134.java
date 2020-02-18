/*
 Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus clientes.
 Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 4.Fim).
 Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido). 
 O programa ser� encerrado quando o c�digo informado for o n�mero 4.
 */
import java.util.Scanner;

public class uri1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		
		
		System.out.println("Digite [1] para �lcool [2] para Gasolina [3] para Disel ou [4] para Sair" );
		valor = sc.nextInt();
		
		while(valor != 4) {
			
			if (valor > 4 ) {
				System.out.println("-----------------------------------");
				System.out.println("Valor Invalido digite novamnete!");
				System.out.println("-----------------------------------");
			}
			
			switch (valor) {
			case 1:
				alcool+=1;
				break;
			case 2:
				gasolina+=1;
				break;
			case 3:
				disel+=1;
				break;
			}
			System.out.println("Digite [1] para �lcool [2] para Gasolina [3] para Disel ou [4] para Sair" );
			valor = sc.nextInt();
		}
		System.out.println("Muito Obrigado!");
		System.out.println("�lcool " + alcool);
		System.out.println("Gasolina " + gasolina);
		System.out.println("Disel " + disel);
		sc.close();

	}

}
