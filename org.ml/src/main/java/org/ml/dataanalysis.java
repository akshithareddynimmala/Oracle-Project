package org.ml;
import java.io.IOException;
import tech.tablesaw.api.Table;
import tech.tablesaw.plotly.Plot;
import tech.tablesaw.plotly.components.Figure;
import tech.tablesaw.plotly.components.Layout;
import tech.tablesaw.plotly.traces.HistogramTrace;



public class dataanalysis {
	
	public static void main(String args[])
	{
		System.out.println("DataAnalysis");
		
		try {
			Table bank_data = Table.read().csv("D:\\ai-ml\\data_banknote_authentication.csv");
		
			System.out.println(bank_data.shape());
			
			System.out.println(bank_data.first(5));
			
			System.out.println(bank_data.structure());
		
			System.out.println(bank_data.summary());
			
			Layout layout1=Layout.builder().title("DISTRIBUTION OF VARIANCE").build();
			HistogramTrace trace1=HistogramTrace.builder(bank_data.nCol("variance")).build();
			Plot.show(new Figure(layout1,trace1));
			

			
			} catch (IOException e) {
			//
			e.printStackTrace();
		}
	}
	
  }