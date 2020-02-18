//Media aluno aprovado ou reprovado
import java.util.Locale;
import java.util.Scanner;

public class uri1040 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
			float nota1, nota2, nota3, nota4, media,notaExame,notaFinal = 0;
			
			System.out.println("Digite a primeira nota: ");
			nota1 = sc.nextFloat();
			System.out.println("Didite a segunda nota:");
			nota2 = sc.nextFloat();
			System.out.println("Digite a terceira nota: ");
			nota3 = sc.nextFloat();
			System.out.println("Digite a quarta nota: ");
			nota4 = sc.nextFloat();
			
			
			media =((nota1* 2)+ (nota2*3) + (nota3*4) + (nota4*1))/10;
			System.out.printf("Media: %.1f%n", media);
			
			if(media >= 7.0 ) {
				System.out.println("Aluno Aprovado!");
			}
			else if (media < 5.0) {
				System.out.println("Aluno Reprovado!");
				}
			
			else if (media >= 5.0 && media < 6.9 ) {
				System.out.println("Aluno de Exame!");
				System.out.println("Digite a nota do exame");
				notaExame = sc.nextFloat();
				notaFinal = (notaExame + media)/2;
			if(notaFinal >=5) {
				System.out.println("Aluno aprovado!");
				
			           }
			
			}
			
			else {
				System.out.println("Aluno reprovado!");
			}
			
			
			System.out.printf("Media final: %.1f ",notaFinal);
		sc.close();
	}

}
