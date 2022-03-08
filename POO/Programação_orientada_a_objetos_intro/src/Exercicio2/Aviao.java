package Exercicio2;

public class Aviao {
	
	//Atributos --> características
	
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
		
		//Métodos --> comportamento
		
		
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
			System.out.println("Número do avião: "+this.numAviao);
			System.out.println("Capacidade máxima: "+this.capacidade);
			System.out.println("Pessoas a bordo: "+this.quantidadePessoas);
			System.out.println("Pode levantar voo? "+this.levantaVoo);
			
		}
		 
}

