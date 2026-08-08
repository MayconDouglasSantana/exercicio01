# exercicio01
calculadora de media

package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Calculadora de media:\n\n");
		
		System.out.println("Digite a primeria nota");
		double nota1 = scanner.nextDouble();

		System.out.println("Digite a segunda nota");
		double nota2 = scanner.nextDouble();

		System.out.println("Digite a terceira nota");
		double nota3= scanner.nextDouble();
		
		double media = ( nota1 + nota2 + nota3 )/3;
		
		if(media >= 7) {
			System.out.println("Passou!");
		}else if(media >= 5){
			System.out.println("Recuperação!");
		}else {
			System.out.println("Reprovou!");
		}
		
		
		scanner.close();

	}

}

