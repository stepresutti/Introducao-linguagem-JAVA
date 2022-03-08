package Exercicio5;

public class Patinete {
	
	//Atributos --> características
	
	int id;
	int bateria;
	boolean pagamento;
	boolean ativo;
	boolean desliga;
	boolean acelera;
	
	
	
		public Patinete (int idParam, int bateriaParam, boolean pagamentoParam)
		{
			this.id = idParam;
			this.bateria = bateriaParam;
			this.pagamento = pagamentoParam;
	
		}
		
		//Métodos --> comportamento
		
		
		public void ativarPatinete() 
		{
					
			if(bateria>0 && pagamento == true)
			{
				this.ativo = true;
						
			}
			else 
			{
			this.ativo = false;
						
			}
		}
		
		public void acelerar() 
		{
					
			if(bateria>50)
			{
				this.acelera = true;
						
			}
			else 
			{
			this.acelera = false;
						
			}
		}
		
		public void desligar() 
		{
					
			if(bateria == 0)
			{
				this.desliga = true;
						
			}
			else 
			{
			this.desliga = false;
						
			}
		}
		
		public void estado()
		{
			System.out.println("ID: "+this.id);
			System.out.println("Perentual de bateria: "+this.bateria+ "%");
			System.out.println("Esta pago?: "+this.pagamento);
			System.out.println("Pode acelerar? "+this.acelera);
			System.out.println("Pode desligar? "+this.desliga);
			
		}
	
	}
