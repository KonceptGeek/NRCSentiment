/**
 * Copyright KonceptGeeek
 */
package konceptgeek.nlp.sentiment.nrc.model;

/**
 * @author konceptgeek
 *
 */
public class Token {
	private String text;
	private String pos;
	
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the pos
	 */
	public String getPos() {
		return pos;
	}
	/**
	 * @param pos the pos to set
	 */
	public void setPos(String pos) {
		this.pos = pos;
	}
	
}

