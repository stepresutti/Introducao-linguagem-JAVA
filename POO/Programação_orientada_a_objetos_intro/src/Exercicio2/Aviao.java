package Exercicio2;

public class Aviao {
	
	//Atributos --> caracter�sticas
	
		String companhia;
		int numAviao;
		int capacidade;
		int quantidadePessoas;
		boolean levantaVoo;
		
		
		public Aviao(String companhiaParam, int numAviaoParam, int capacidadeParam, int pessoasParam) 
		{
			this.companhia = companhiaParam;
			this.numAviao = numAviaoParam;
			this.capacidade = capacidadeParam; 
			this.quantidadePessoas = pessoasParam;	
			this.voar();
			
		}
		
		//M�todos --> comportamento
		
		
		public void voar() 
		{
			
			if(quantidadePessoas <= capacidade)
			{
				this.levantaVoo = true;
				
			}
			else 
			{
				this.levantaVoo = false;
			}
		}
			
		public void estado()
		{
			System.out.println("Companhia: "+this.companhia);
			System.out.println("N�mero do avi�o: "+this.numAviao);
			System.out.println("Capacidade m�xima: "+this.capacidade);
			System.out.println("Pessoas a bordo: "+this.quantidadePessoas);
			System.out.println("Pode levantar voo? "+this.levantaVoo);
			
		}
		 
}

