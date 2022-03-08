package Exercicio4;

public class Funcionario {
	
	//Atributos --> caracter�sticas
	
	String nome;
	String cargo;
	int salario;
	int tempoDeCasa;
	boolean comportamentoRuim;
	boolean comportamentoBom;
	boolean advertido;
	boolean estatico;
	boolean promovido;
	boolean demitido;
	
	public Funcionario (String nomeParam, String cargoParam, int salarioParam, int tempoDeCasaParam, boolean comportamentoRuimParam,
						boolean comportamentoBomParam)
	{
		this.nome = nomeParam;
		this.cargo = cargoParam;
		this.salario = salarioParam;
		this.tempoDeCasa = tempoDeCasaParam;
		this.comportamentoRuim = comportamentoRuimParam;
		this.comportamentoBom = comportamentoBomParam;
		
	}
	
	//M�todos --> comportamento
	
	public void demitir() 
	{
		
		if(advertido == true && comportamentoRuim == true)
		{
			this.demitido = true;
			
		}
		else 
		{
			this.demitido = false;
			
		}
		
	}
	
	public void promover() 
		{
			
			if(tempoDeCasa>5 && advertido == false && comportamentoBom == true)
			{
				this.promovido = true;
				
			}
			else 
			{
				this.promovido = false;
				
			}
		}
			
		public void estatizar()
		{
			if(tempoDeCasa<5 && comportamentoBom == true)
			{
				this.estatico = true;
			}
			else 
			{
				this.estatico = false;
			}
		}
			
		public void estado()
		{
			System.out.println("Nome: "+this.nome);
			System.out.println("Cargo: "+this.cargo);
			System.out.println("Sal�rio: "+this.salario);
			System.out.println("Ser� demitido? "+this.demitido);
			System.out.println("Ser� promovido? "+this.promovido);
			System.out.println("Ficar� no cargo atual? "+this.estatico);
			
		}

}
