package tp2;

public class Compardador {

	public static void main(String[] args) throws Exception{
		matrizNaivebayes matrizN = new matrizNaivebayes();
		matrizId3 matrizI = new matrizId3();
		//matriz simples naivebayes
		Object[] ObjetoN = matrizN.matrizCruzada();
		double[][] mtrNSimples = (double[][])ObjetoN[0];
		double VObitoN = mtrNSimples[0][0];
		double FNaoObitoN = mtrNSimples[0][1];
		double FObitoN = mtrNSimples[1][0];
		double VNaoObitoN = mtrNSimples[1][1];
		
		//totais
		double TotalExemplosN = (double)ObjetoN[1];
		double TotalExemplosNaoClassificadosN = TotalExemplosN -(VObitoN+
				FNaoObitoN+FObitoN+VNaoObitoN);
		double TotalExemplosObitoN = VObitoN + FNaoObitoN;
		double TotalExemplosNaoObitoN = FObitoN + VNaoObitoN;
		
		//Precisao Naivebayes
		double PrObitoN = VObitoN / (VObitoN + FObitoN);
		double PrNaoObitoN = VNaoObitoN / (VNaoObitoN + FNaoObitoN);
		double PrNMedia = (PrObitoN + PrNaoObitoN)/2;
		
		//Revocacao Naivebayes
		double ReObitoN = VObitoN / (VObitoN + FNaoObitoN);
		double ReNaoObitoN = VNaoObitoN / (VNaoObitoN + FObitoN);
		double ReNMedia = (ReObitoN + ReNaoObitoN)/2;
		
		 
		
		//acuracia Naivebayes
		double AcN = (VObitoN + VNaoObitoN) / TotalExemplosN;
		
		 //taxa de erro Naivebayes
	    double ErN = 1- AcN;
		
		//matriz simples Id3
	    Object[] ObjetoI = matrizI.matrizCruzada();
		double[][] mtrISimples = (double[][])ObjetoI[0];
		double VObitoI = mtrISimples[0][0];
		double FNaoObitoI = mtrISimples[0][1];
		double FObitoI = mtrISimples[1][0];
		double VNaoObitoI = mtrISimples[1][1];
		
		//totais
		double TotalExemplosI = (double)ObjetoI[1];
	    double TotalExemplosNaoClassificadosI = TotalExemplosI -(VObitoI+
						FNaoObitoI+FObitoI+VNaoObitoI);
	    double TotalExemplosObitoI = VObitoI + FNaoObitoI;
		double TotalExemplosNaoObitoI = FObitoI + VNaoObitoI;
		
		//preciasao Id3
		double PrObitoI = VObitoI / (VObitoI + FObitoI);
		double PrNaoObitoI = VNaoObitoI / (VNaoObitoI + FNaoObitoI);
		double PrIMedia = (PrObitoI + PrNaoObitoI)/2;
		
		//Revocacao Id3
		double ReObitoI = VObitoI / (VObitoI + FNaoObitoI);
		double ReNaoObitoI = VNaoObitoI / (VNaoObitoI + FObitoI);
		double ReIMedia = (ReObitoI + ReNaoObitoI)/2;
		
		//acuracia Id3
	    double AcI = (VObitoI + VNaoObitoI) / TotalExemplosI;
	    
	    //taxa de erro Id3
	    double ErI = 1- AcI;
	    
	    
	    
	    System.out.println("Resultados Matriz Simples: NaiveBayes / Id3");
	    System.out.println("Precisao Obito: " + PrObitoN + " / " + PrObitoI);
	    System.out.println("Precisao Nao Obito: " + PrNaoObitoN + " / " + PrNaoObitoI);
	    System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
	    System.out.println("Precisao Media: " + PrNMedia + " / " + PrIMedia);
	    System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
	    System.out.println("Revocação Obito: " + ReObitoN + " / " + ReObitoI);
	    System.out.println("Revocação Nao Obito: " + ReNaoObitoN + " / " + ReNaoObitoI);
	    System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
	    System.out.println("Revocação Media: " + ReNMedia + " / " + ReIMedia);
	    System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
	    System.out.println("Acuracia: " + AcN + " / " + AcI);
	    System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
	    System.out.println("Taxa de Erro: " + ErN + " / " + ErI);
	    System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
	    System.out.println("Total Exemplos Obito: " + (int)TotalExemplosObitoN + " / " + (int)TotalExemplosObitoI);
	    System.out.println("Total Exemplos Nao Obito: " + (int)TotalExemplosNaoObitoN + " / " + (int)TotalExemplosNaoObitoI);
	    System.out.println("Total Exemplos Nao Classificados: " + (int)TotalExemplosNaoClassificadosN + " / " + (int)TotalExemplosNaoClassificadosI);
	    System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
	    System.out.println("Total de Exemplos: " + (int)TotalExemplosN
	    		                          + " / " + (int)TotalExemplosI);
	    
	    

	}

}
