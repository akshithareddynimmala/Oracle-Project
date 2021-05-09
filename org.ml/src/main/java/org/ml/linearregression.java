package org.ml;
import java.io.IOException;
import weka.classifiers.Evaluation;
import weka.classifiers.functions.LinearRegression;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class linearregression {
		public static void main(String[] args) throws Exception {
			DataSource source =new DataSource("D:\\\\ai-ml\\\\data_banknote_authentication.csv");
			Instances dataset=source.getDataSet();
			dataset.setClassIndex(dataset.numAttributes()-1);
			//linear Regression
			LinearRegression lr=new LinearRegression();
			lr.buildClassifier(dataset);
			
			Evaluation lreval =new Evaluation(dataset);
		    lreval.evaluateModel(lr,dataset);
			System.out.println(lreval.toSummaryString());
			
			
		}

	}