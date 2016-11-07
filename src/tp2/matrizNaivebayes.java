package tp2;

import java.util.Random;

import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;

public class matrizNaivebayes {	
	
	public Object[] matrizSimples() throws Exception{
		baseDados base = new baseDados();
		Instances exemplosNaivebayes = base.tuplaDados();
		exemplosNaivebayes.setClassIndex(8);
		NaiveBayes arvore = new NaiveBayes();
		Evaluation evolucao = new Evaluation(exemplosNaivebayes);
		evolucao.evaluateModel(arvore,exemplosNaivebayes);
		Object[] a = new Object[2];
		a[0] = evolucao.confusionMatrix();
		a[1] = evolucao.numInstances();	
		return a;		
	}
	
	public Object[] matrizCruzada() throws Exception{
		int dobras = 4;
		Random rand = new Random(1);
		baseDados base = new baseDados();
		Instances exemplosNaivebayes = base.tuplaDados();
		exemplosNaivebayes.setClassIndex(8);
		NaiveBayes arvore = new NaiveBayes();
		Evaluation evolucao = new Evaluation(exemplosNaivebayes);
		evolucao.crossValidateModel(arvore, exemplosNaivebayes, dobras, rand);
		Object[] a = new Object[2];
		a[0] = evolucao.confusionMatrix();
		a[1] = evolucao.numInstances();		
		return a;		
	}

}
