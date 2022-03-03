package Atividades;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int n1, n2, n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		n1= leia.nextInt();
		System.out.println("\nDigite outro número: ");
		n2= leia.nextInt();
		System.out.println("\nDigite outro número: ");
		n3= leia.nextInt();
		
        
		int listaCrescente[]= {n1, n2, n3};
		Arrays.sort(listaCrescente);
		
		System.out.println("E a ordem crescente é: \n" + listaCrescente[0] + " /" + listaCrescente[1] + " /" + listaCrescente[2]);
		
		leia.close();
	}
}
