import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		int num, soma=0, repeticoes=0, media=0;
		
		Scanner leia = new Scanner (System.in);

		do
		{
			System.out.println("Entre com um número: ");
			num = leia.nextInt();
			
			if(num%3 == 0)
			{
				soma = soma+num;
				repeticoes = repeticoes+1;
				
			}
			
		}
		while(num != 0);
		
		media = soma/repeticoes;
		
		System.out.printf("A média dos multiplos de 3 foi: %d", media);
		leia.close();
	}

}
