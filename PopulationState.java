package xchart;

import java.util.List;

public enum PopulationState  {
	
	SUSPEITA(1,"suspeita",0.0),
	INFECTADO(2,"infectado",0.0),
	RECUPERADO(3,"recuperado",0.0);
	
	//variaveis
		private int valor;
		private String descricao;
		private double porcentagemDaPopulacao;
		
		private PopulationState(int valor, String descricao, double porcentagemDaPopulacao) {
			this.valor = valor;
			this.descricao = descricao;
			this.porcentagemDaPopulacao = porcentagemDaPopulacao;
		}

		
	
		
	}
	
	
	

