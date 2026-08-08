package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Tabuada do numero escolhido:\n\n");
		
		System.out.println("Digite o numero");
		double numero = scanner.nextDouble();
		
		for(int i = 1; i < 11; i++) {
			System.out.println(numero+" * "+ i +" = "+ i*numero +"\n");
		}

		
		
		scanner.close();

	}

}
