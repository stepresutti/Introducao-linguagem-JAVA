package Atividades;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		int n1, n2, n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um n�mero: ");
		n1= leia.nextInt();
		System.out.println("\nDigite outro n�mero: ");
		n2= leia.nextInt();
		System.out.println("\nDigite outro n�mero: ");
		n3= leia.nextInt();
		
        
		int listaCrescente[]= {n1, n2, n3};
		Arrays.sort(listaCrescente);
		
		System.out.println("E a ordem crescente �: \n" + listaCrescente[0] + " /" + listaCrescente[1] + " /" + listaCrescente[2]);
		
		leia.close();
	}
}
