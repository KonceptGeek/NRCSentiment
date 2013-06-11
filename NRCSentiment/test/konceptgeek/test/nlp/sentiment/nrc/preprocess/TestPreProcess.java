/**
 * Copyright KonceptGeeek
 */
package konceptgeek.test.nlp.sentiment.nrc.preprocess;

import konceptgeek.nlp.sentiment.nrc.impl.PreProcess;
import konceptgeek.nlp.sentiment.nrc.model.PreProcessBO;


/**
 * @author konceptgeek
 *
 */
public class TestPreProcess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PreProcess pp = new PreProcess();
		String text = ".@Intel Capital plans to invest US$ 16 million in three e-commerce companies - Snapdeal, Bright Lifecare & Reebonz. http://goo.gl/Rbkbi "; 
				
		PreProcessBO ppBO = new PreProcessBO(text);
		
		pp.preProcess(ppBO);
		System.out.println(ppBO.getOriginalText());
		System.out.println(ppBO.getPreProcessedText());
		System.out.println(ppBO.getUrlCount());
		System.out.println(ppBO.getTargetCount());

	}

}
