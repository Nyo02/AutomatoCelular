package xchart;

import java.util.List;

public class CellularAutomata {

	 List<CellularAutomataState> geracoes;
	 int linhas;
	 int colunas;
	 int populacao = colunas*linhas;
	 MooreNeighborhood[][] geracaoAtual;
	
	
	
	public CellularAutomata(int linhas, int colunas/*Vizinhança celular,Class<S>*/) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.geracaoAtual = new MooreNeighborhood[linhas][colunas];
	 
	}
	
	
	public void printarGeracao() {
		String linha ="";
		
	
		for(int i=0;i<linhas;i++) {
			
			for(int k=0;k<colunas;k++) {
				geracaoAtual[k][i]= new MooreNeighborhood();
				linha +="["+geracaoAtual[k][i].x+"]";
		    }
			System.out.println(linha);
			linha ="";
		}
		

     }
	
	void infectar(){
		geracaoAtual[4][4].x='1';	
	}
}
