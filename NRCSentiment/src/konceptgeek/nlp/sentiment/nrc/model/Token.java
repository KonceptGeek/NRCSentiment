/**
 * Copyright KonceptGeeek
 */
package konceptgeek.nlp.sentiment.nrc.model;

import konceptgeek.nlp.sentiment.nrc.constants.CMUPosTagsEnum;

/**
 * @author konceptgeek
 *
 */
public class Token {
	private String text;
	private CMUPosTagsEnum pos;
	
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
	public CMUPosTagsEnum getPos() {
		return pos;
	}
	
	/**
	 * @param pos the pos to set
	 */
	public void setPos(String pos) {
		this.pos = CMUPosTagsEnum.fromValue(pos);
	}
	
	/**
	 * Sets the pos.
	 *
	 * @param pos the new pos
	 */
	public void setPos(CMUPosTagsEnum pos) {
		this.pos = pos;
	}
	
}

