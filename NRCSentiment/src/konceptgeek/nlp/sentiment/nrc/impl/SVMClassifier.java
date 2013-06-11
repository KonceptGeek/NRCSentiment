/**
 * Copyright KonceptGeeek
 */
package konceptgeek.nlp.sentiment.nrc.impl;

import konceptgeek.nlp.sentiment.nrc.model.FeatureExtractorBO;
import konceptgeek.nlp.sentiment.nrc.model.OutputBO;

/**
 * @author konceptgeek
 *
 */
public class SVMClassifier {
	
	private final String modelPath;
	
	public SVMClassifier(String modelFile) {
		this.modelPath = modelFile;
	}
	
	public OutputBO classifyText(FeatureExtractorBO featureExtractorBO) {
		return null;
	}
	
	
}
