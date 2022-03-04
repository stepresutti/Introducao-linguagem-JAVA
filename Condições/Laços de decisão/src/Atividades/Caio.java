package Atividades;

import java.util.Scanner;

public class Caio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int numeros[] = new int[3];
		
		for(int i = 0; i<3; i++) {
			System.out.println("Digite um número: ");

			if(i == 0) {
				numeros[0] = scan.nextInt();
			}else if(i == 1) {
				int numero1 = scan.nextInt();
				
				if(numeros[0] > numero1) {
					int numTemp = numeros[0];
					numeros[0] = numero1;
					numeros[1] = numTemp;
				}
			}
			else {
				int numero2 = scan.nextInt();
				
				if(numero2 > numeros[1]) {
					numeros[2] = numero2;
				}else if(numero2 > numeros[0]) {
					numeros[2] = numeros[1];
					numeros[1] = numero2;
				}else {
					numeros[2] = numeros[1];
					numeros[1] = numeros[0];
					numeros[0] = numero2;
				}
			}
			
		}
		
		for(int j=0; j<3; j++) {
			System.out.println("\n" + numeros[j]);
		}
		
		
		
	}

}
