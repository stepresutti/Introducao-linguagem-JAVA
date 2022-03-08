package Exercicio1;

public class Cliente {

	//Atributos --> características
	
	String nome;
	String genero;
	int idade;
	boolean ativo;
	boolean fidelidade;
	boolean pagador;
	boolean devedor;
	int quantidadeCompras;
	
	public Cliente(String nomeParam, String generoParam, int idadeParam, int quantidadeParam, boolean devedorParam) 
	{
		this.nome = nomeParam;
		this.genero = generoParam;
		this.idade = idadeParam;
		this.quantidadeCompras = quantidadeParam;	
		this.devedor = devedorParam;
		this.ativar();
	}
	
	//Métodos --> comportamento
	
	
	public void ativar() 
	{
		
		if(devedor == true)
		{
			this.ativo = false;
			
		}
		else 
		{
			this.ativo = true;
			
		}
	}
		
	public void fidelizar()
	{
		if(quantidadeCompras>10)
		{
			this.fidelidade = true;
		}
		else 
		{
			this.fidelidade = false;
		}
	}
		
	public void estado()
	{
		System.out.println("Nome: "+this.nome);
		System.out.println("Gênero: "+this.genero);
		System.out.println("Idade: "+this.idade);
		System.out.println("Faz parte do grupo fidelidade? "+this.fidelidade);
		System.out.println("Status do perfil é ativo: "+this.ativo);
		
	}
	 
}
