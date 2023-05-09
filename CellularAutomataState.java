package xchart;

import java.util.List;

public interface CellularAutomataState {
	
	public int getValor();
	public String getDescricao();
	public CellularAutomataState aplicarRegra(List<CellularAutomataState> celulas);
	public double getPorcentagem();
	

}
