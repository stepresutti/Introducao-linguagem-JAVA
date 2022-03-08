package Exercicio7;

import Exercicio5.Patinete;

public class PacientePS {
	
	//Atributos --> características
	
		String nome;
		int idade;
		String genero;
		boolean suspeitaCovid;
		boolean alaSeparada;
		boolean poucaUrgencia;
		boolean triagem3;
		boolean urgente;
		boolean triagem2;
		boolean emergencia;
		boolean triagem1;
		boolean atendimentoPrioritário;
		boolean triagemPrioritaria;
		
		
			public PacientePS (String nomeParam, int idadeParam, String generoParam, boolean suspeitaCovidParam, 
					boolean poucaUrgenciaParam, boolean urgenteParam, boolean emergenciaParam, boolean atendimentoPrioritárioParam)
			{
				this.nome = nomeParam;
				this.idade = idadeParam;
				this.genero = generoParam;
				this.suspeitaCovid = suspeitaCovidParam;
				this.poucaUrgencia = poucaUrgenciaParam;
				this.urgente = urgenteParam;
				this.emergencia = emergenciaParam;
				this.atendimentoPrioritário = atendimentoPrioritárioParam;
		
			}

			
			//Métodos --> comportamento
			
			
			public void transferirAla() 
			{
						
				if(suspeitaCovid == true)
				{
					this.alaSeparada = true;
							
				}
				else 
				{
				this.alaSeparada = false;
							
				}
			}
			
			public void transferirT3() 
			{
						
				if(poucaUrgencia == true)
				{
					this.triagem3 = true;
							
				}
				else 
				{
				this.triagem3 = false;
							
				}
			}
			
			public void transferirT2() 
			{
						
				if(urgente == true)
				{
					this.triagem2 = true;
							
				}
				else 
				{
				this.triagem2 = false;
							
				}
			}
			
			public void transferirT1() 
			{
						
				if(emergencia == true)
				{
					this.triagem1 = true;
							
				}
				else 
				{
				this.triagem1 = false;
							
				}
			}
			
			public void transferirPO() 
			{
						
				if(atendimentoPrioritário == true)
				{
					this.triagemPrioritaria = true;
							
				}
				else 
				{
				this.triagemPrioritaria = false;
							
				}
			}
			
			public void estado()
			{
				System.out.println("Nome do paciente: "+this.nome);
				System.out.println("Idade: "+this.idade);
				System.out.println("Gênero: "+this.genero);
				System.out.println("Vai pra ala covid? "+this.alaSeparada);
				System.out.println("Vai para T3? "+triagem3);
				System.out.println("Vai para T2? "+triagem2);
				System.out.println("Vai para T1? "+triagem1);
				System.out.println("Vai para PO? "+triagemPrioritaria);
				
				
			}
	}
