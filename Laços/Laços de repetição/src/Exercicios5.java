import java.util.Scanner;

public class Exercicios5 {

	public static void main(String[] args) {
		
		int num, soma=0;
		
		Scanner leia = new Scanner (System.in);
		
		do
		{
			System.out.println("Entre com um número: ");
			num = leia.nextInt();
			
			soma = soma + num;
			
		}
		while(num != 0);
		
		System.out.printf("A soma dos números digitados é: %d",soma);
		leia.close();

	}

}
