package Exercicio6;

public class ContaBancaria {
	
	//Atributos --> características
	
	String nome;
	int cartao;
	int saldo;
	boolean chequeEspecial;
	boolean emprestimo;
	boolean devedor;
	boolean credito;
	
	public ContaBancaria (String nomeParam, int cartaoParam, int saldoParam)
	{
	this.nome = nomeParam;
	this.cartao = cartaoParam;
	this.saldo = saldoParam;
	}
	
	//Métodos --> comportamento
	
		public void chequeEspecial() 
		{
			
			if(saldo<0)
			{
				this.devedor = true;
				
			}
			else 
			{
				this.devedor = false;
				
			}
		}
		
		public void pegarEmprestimo() 
		{
			
			if(saldo<0)
			{
				this.emprestimo = true;
				
			}
			else 
			{
				this.emprestimo = false;
				
			}
		}
		
		public void ganharCredito() 
		{
			
			if(saldo>=0)
			{
				this.credito = true;
				
			}
			else 
			{
				this.credito = false;
				
			}
		}
		
		public void estado()
		{
			System.out.println("Nome: "+this.nome);
			System.out.println("Cartão: "+this.cartao);
			System.out.println("Saldo em conta: "+this.saldo);
			System.out.println("Esta no cheque especial? "+this.devedor);
			System.out.println("Pegou empréstimo? "+this.emprestimo);
			System.out.println("Não é devedor e tem crétido com o banco? "+this.credito);
			
		}
}
