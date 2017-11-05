package TF_IDF;

import TF_IDF.VectorSpaceModel.WriteOption;

public class main_TF {

	public static void TF_IDF(String university) {
		VectorSpaceModel vsm = new VectorSpaceModel(university+"_analysis.txt");
		vsm.CalculateTFIDF();
		
		vsm.Write(university+"_tf_idf.txt",WriteOption.TFIDF);
		//TF-IDF
	}

}
