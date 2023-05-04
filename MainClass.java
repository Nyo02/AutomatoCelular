package xchart;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import org.knowm.xchart.HeatMapChart;
import org.knowm.xchart.HeatMapChartBuilder;
import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.style.Styler;
import org.knowm.xchart.style.Styler.ChartTheme;


public class MainClass {

	public static void main(String[] args) {
		// Dados de exemplo em uma matriz 2D
        double[][] data = new double[][] {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        // Cria o gráfico de grade usando o tipo de gráfico HeatMap
        HeatMapChart chart = new HeatMapChartBuilder()
                .width(800)
                .height(600)
                .title("Exemplo de Grade")
                .theme(ChartTheme.Matlab)
                .xAxisTitle("Colunas")
                .yAxisTitle("Linhas")
                .build();

        // Define os valores dos eixos x e y e os valores de dados da matriz
        chart.setMatrixData(Arrays.asList(data));
        chart.setXAxisData(Arrays.asList("Col 1", "Col 2", "Col 3", "Col 4"));
        chart.setYAxisData(Arrays.asList("Lin 1", "Lin 2", "Lin 3", "Lin 4"));

        // Define uma paleta de cores personalizada para o gráfico
        chart.getStyler().setHeatMapColorInterpolation(Styler.GradientInterpolationMethod.LINEAR);
        chart.getStyler().setHeatMapColors(new Color[] { Color.YELLOW, Color.ORANGE, Color.RED });

        // Renderiza o gráfico
        new SwingWrapper<>(chart).displayChart();
		
		
		
		
		
		//Declaração de variaveis
		int MAX = 20;
		int geracao[] = new int[9];
		int novaGeracao[] = new int[9];
		int matriz_evolucao[][] = new int[MAX][geracao.length];
		
		//Define a geração inicial
		geracao[geracao.length/2] = 1;
		
		//testes
		int[] codigo = converteBinario(50);
		
		// loop para varrer todas as linhas
		for(int i=0; i<MAX ; i++) {
			
			//loop para varrer cada coluna  inserindo geração
			for(int j = 0; j<geracao.length;j++) {
				matriz_evolucao[i][j] = geracao[j];
				String res = "["+matriz_evolucao[i][j]+"]";
			}
			
			//loop para aplicar regra
			for(int k=0;k<geracao.length;k++){
				if(geracao[(k-1+geracao.length)%geracao.length]==0 && geracao[k]==0 && geracao[(k+1)%geracao.length]==0) {
					novaGeracao[k] = codigo[7];
				}
				if(geracao[(k-1+geracao.length)%geracao.length]==0 && geracao[k]==0 && geracao[(k+1)%geracao.length]==1) {
					novaGeracao[k] = codigo[6];
				}
				if(geracao[(k-1+geracao.length)%geracao.length]==0 && geracao[k]==1 && geracao[(k+1)%geracao.length]==0) {
					novaGeracao[k] = codigo[5];
				}
				if(geracao[(k-1+geracao.length)%geracao.length]==0 && geracao[k]==1 && geracao[(k+1)%geracao.length]==1) {
					novaGeracao[k] = codigo[4];
				}
				if(geracao[(k-1+geracao.length)%geracao.length]==1 && geracao[k]==0 && geracao[(k+1)%geracao.length]==0) {
					novaGeracao[k] = codigo[3];
				}
				if(geracao[(k-1+geracao.length)%geracao.length]==1 && geracao[k]==0 && geracao[(k+1)%geracao.length]==1) {
					novaGeracao[k] = codigo[2];
				}
				if(geracao[(k-1+geracao.length)%geracao.length]==1 && geracao[k]==1 && geracao[(k+1)%geracao.length]==0) {
					novaGeracao[k] = codigo[1];
				}
				if(geracao[(k-1+geracao.length)%geracao.length]==1 && geracao[k]==1 && geracao[(k+1)%geracao.length]==1) {
					novaGeracao[k] = codigo[0];
				}
				
				geracao = novaGeracao.clone();
			}
		}
		
		
	}

	static int[] converteBinario(int numero) {
		int[] arrBin = {0,0,0,0,0,0,0,0};
		String binario = Integer.toBinaryString(numero);
		char[] binSplit = binario.toCharArray();
		int c = arrBin.length-1;
		
		for(int k=binSplit.length-1;k>=0;k--) {
			arrBin[c] = Character.getNumericValue(binSplit[k]);
			c--;
		}
		return arrBin;
	}
	
	

}