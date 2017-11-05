import KoreanAnalysis.Morph_Main;
import TF_IDF.Get_DF;
import TF_IDF.Get_Word;
import TF_IDF.Get_keyword;
import TF_IDF.TF_IDF_write;
import TF_IDF.main_TF;

public class web_main {
	public static void main(String[] args) {
		String university = "cau_25000";
//		Morph_Main.Morph(university); // 형태소분석
//		System.out.println("형태소분석 완료");
		
		main_TF.TF_IDF(university); // tf_idf 구하기
		System.out.println("tf_idf 구함");
		
		TF_IDF_write.function(university); // tf_idf 평균 구하기
		System.out.println("tf_idf 평균구함");
		
		Get_Word.function(university); // 단어 중복 지우기
		System.out.println("단어 중복 지움");
		
		Get_keyword.function(university); // 키워드 구하기
		System.out.println("키워드구함");
		
		Get_DF.function(university);
		System.out.println("모두 완료");
		
		
		
	}
}
