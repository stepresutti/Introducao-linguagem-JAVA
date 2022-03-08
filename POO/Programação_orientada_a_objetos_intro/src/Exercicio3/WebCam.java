package Exercicio3;

public class WebCam {

	//Atributos --> características
	
		int id;
		String cor;
		String modelo;
		boolean ativo;
		boolean plugadaUSB;
		boolean filma;
		boolean desliga;
		
		public WebCam(int idParam, String corParam, String modeloParam, boolean plugadaUSBParam) 
		{
			this.id = idParam;
			this.cor = corParam;
			this.modelo = modeloParam;
			this.plugadaUSB = plugadaUSBParam;
		}
		
		//Métodos --> comportamento
		
		
		public void ativarWebCam() 
		{
			
			if(plugadaUSB == true)
			{
				this.ativo = true;
				
			}
			else 
			{
				this.ativo = false;
				
			}
		}
			
		public void filmar()
		{
			if(plugadaUSB ==  true)
			{
				this.filma = true;
			}
			else 
			{
				this.filma = false;
			}
		}
		
		public void desligar()
		{
			if(plugadaUSB == true)
			{
				this.desliga = true;
				System.out.println("Desligando... "+this.desliga);
			}
			else 
			{
				this.desliga = false;
			}
		}
		
			
		public void estado()
		{
			System.out.println("ID: "+this.id);
			System.out.println("Cor: "+this.cor);
			System.out.println("Modelo: "+this.modelo);
			System.out.println("A câmera está ativa: "+this.ativo);
			System.out.println("A câmera está filmando: "+this.filma);
			
		}
}
