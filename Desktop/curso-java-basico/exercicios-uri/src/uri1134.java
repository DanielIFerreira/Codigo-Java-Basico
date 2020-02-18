/*
 Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
 Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
 Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
 O programa será encerrado quando o código informado for o número 4.
 */
import java.util.Scanner;

public class uri1134 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		
		
		System.out.println("Digite [1] para Àlcool [2] para Gasolina [3] para Disel ou [4] para Sair" );
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
			System.out.println("Digite [1] para Àlcool [2] para Gasolina [3] para Disel ou [4] para Sair" );
			valor = sc.nextInt();
		}
		System.out.println("Muito Obrigado!");
		System.out.println("Álcool " + alcool);
		System.out.println("Gasolina " + gasolina);
		System.out.println("Disel " + disel);
		sc.close();

	}

}
