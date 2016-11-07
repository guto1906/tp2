package tp2;

import java.util.Random;

import weka.classifiers.Evaluation;
import weka.classifiers.trees.Id3;
import weka.core.Instances;

public class matrizId3 {
	
	public Object[] matrizSimples() throws Exception{
		baseDados base = new baseDados();
		Instances exemplosId3 = base.tuplaDados();
		exemplosId3.setClassIndex(8);
		Id3 arvore = new Id3();
		Evaluation evolucao = new Evaluation(exemplosId3);
		evolucao.evaluateModel(arvore,exemplosId3);
		Object[] a  = new Object[2];
		a[0] = evolucao.confusionMatrix();
		a[1] = evolucao.numInstances();
		return a;		
	}
	
	public Object[] matrizCruzada() throws Exception{
		int dobras = 4;
		Random rand = new Random(1);
		baseDados base = new baseDados();
		Instances exemplosId3 = base.tuplaDados();
		exemplosId3.setClassIndex(8);
		Id3 arvore = new Id3();
		Evaluation evolucao = new Evaluation(exemplosId3);
		evolucao.crossValidateModel(arvore, exemplosId3, dobras, rand);
		Object[] a  = new Object[2];
		a[0] = evolucao.confusionMatrix();
		a[1] = evolucao.numInstances();
		return a;		
	}

}
