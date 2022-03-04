import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int idade, pessoasComVinteUm=0, pessoasComCinquenta=0;
		
		Scanner leia = new Scanner (System.in);
	
		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		
		while(idade>0 && idade<99)
		{
			
			if(idade<21) {
				pessoasComVinteUm= pessoasComVinteUm +1;
				
			}
			else if(idade>50) {
				pessoasComCinquenta = pessoasComCinquenta+1;
			}
			
			System.out.println("Entre com a sua idade: ");
			idade = leia.nextInt();
			
		}
		
		System.out.printf("\nA quantidade de pessoas com menos de 21 anos foi: "+ pessoasComVinteUm);
		System.out.printf("\nA quantidade de pessoas com mais de 50 anos foi: "+ pessoasComCinquenta);
		
		leia.close();
	}

}
