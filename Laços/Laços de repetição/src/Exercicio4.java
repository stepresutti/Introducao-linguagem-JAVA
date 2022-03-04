import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int 
			quantidadeDePessoas=0, 
			idade, 
			genero, 
			psico=0, 
			mulheresNervosas=0, 
			homensAgressivos=0, 
			outrosCalmos=0, 
			pessoasCalmas=0,
			nervososMaisQuarenta=0,
			jovensCalmos=0;
			
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		System.out.println("Qual gênero se identifica? Responda usando: 1, 2 e 3");
		genero = leia.nextInt();
		System.out.println("Classifique sua caracteristica usando: 1, 2 e 3");
		psico = leia.nextInt();
		
		while(quantidadeDePessoas<150)
		{
			quantidadeDePessoas = quantidadeDePessoas+1;
			
			
			if(psico == 1)
			{
				pessoasCalmas = pessoasCalmas+1;
			}
			if(genero == 1 && psico == 2)
			{
				mulheresNervosas = mulheresNervosas+1;
			}
			
			if(genero == 2 && psico == 3) 
			{
				homensAgressivos = homensAgressivos+1;
			}
			if(genero == 3 && psico == 1) 
			{
				outrosCalmos = outrosCalmos+1;
			}
			if(idade>40 && psico == 2) 
			{
				nervososMaisQuarenta= nervososMaisQuarenta+1;
			}
			if(idade<18 && psico == 1) 
			{
				jovensCalmos = jovensCalmos+1;
			}
			
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			System.out.println("Qual gênero se identifica? Responda usando: 1, 2 e 3");
			genero = leia.nextInt();
			System.out.println("Classifique sua caracteristica usando: 1, 2 e 3");
			psico = leia.nextInt();
		}
		
		System.out.printf("O número de pessoas calmas foi: ", pessoasCalmas);
		System.out.printf("O número de mulheres nervosas foi: ", mulheresNervosas);
		System.out.printf("O número de homens agressivos foi: ", homensAgressivos);
		System.out.printf("O número de outros calmos foi: ", outrosCalmos);
		System.out.printf("O número de pessoas nervosas +40 foi: ", nervososMaisQuarenta);
		System.out.printf("O número de pessoas calmas -18 foi: ", jovensCalmos);
		
		
		leia.close();
		
	}

}
