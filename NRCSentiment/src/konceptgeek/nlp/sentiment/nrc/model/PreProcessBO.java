/**
 * Copyright KonceptGeeek
 */
package konceptgeek.nlp.sentiment.nrc.model;

import konceptgeek.nlp.sentiment.nrc.inf.IInputBO;

// TODO: Auto-generated Javadoc
/**
 * The Class PreProcessBO.
 * 
 * @author konceptgeek
 */
public class PreProcessBO implements IInputBO {

	/** The original text. */
	private String originalText;

	/** The pre processed text. */
	private String preProcessedText;

	/** The url count. */
	private double urlCount;

	/** The target count. */
	private double targetCount;

	/**
	 * Instantiates a new pre process bo.
	 *
	 * @param originalText the original text
	 */
	public PreProcessBO(String originalText) {
		this.originalText = originalText;
		this.preProcessedText = originalText;
	}
	
	/**
	 * Gets the original text.
	 * 
	 * @return the originalText
	 */
	public String getOriginalText() {
		return originalText;
	}

	/**
	 * Sets the original text.
	 * 
	 * @param originalText
	 *            the originalText to set
	 */
	public void setOriginalText(String originalText) {
		this.originalText = originalText;
	}

	/**
	 * Gets the pre processed text.
	 * 
	 * @return the preProcessedText
	 */
	public String getPreProcessedText() {
		return preProcessedText;
	}

	/**
	 * Sets the pre processed text.
	 * 
	 * @param preProcessedText
	 *            the preProcessedText to set
	 */
	public void setPreProcessedText(String preProcessedText) {
		this.preProcessedText = preProcessedText;
	}

	/**
	 * @return the urlCount
	 */
	public double getUrlCount() {
		return urlCount;
	}

	/**
	 * @param urlCount
	 *            the urlCount to set
	 */
	public void setUrlCount(double urlCount) {
		this.urlCount = urlCount;
	}

	/**
	 * @return the targetCount
	 */
	public double getTargetCount() {
		return targetCount;
	}

	/**
	 * @param targetCount
	 *            the targetCount to set
	 */
	public void setTargetCount(double targetCount) {
		this.targetCount = targetCount;
	}

}
