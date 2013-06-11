/**
 * Copyright KonceptGeeek
 */
package konceptgeek.nlp.sentiment.nrc.constants;

/**
 * @author konceptgeek
 *
 */
public enum CMUPosTagsEnum {
	COMMON_NOUN("N"),
	PRONOUN("O"),
	NOMINAL_POSSESSIVE("S"),
	PROPER_NOUN("^"),
	PROPER_NOUN_POSSESSIVE("Z"),
	NOMINAL_VERB("L"),
	PROPER_NOUN_VERBAL("M"),
	VERB("V"),
	ADJECTIVE("A"),
	ADVERB("R"),
	INTERJECTION("!"),
	DETERMINER("D"),
	CONJUNCTION("P"),
	COORDINATING_CONJUNCTION("&"),
	VERB_PARTICLE("T"),
	EXISTENTIAL("X"),
	X_VERBAL("Y"),
	HASHTAG("#"),
	AT_MENTION("@"),
	DISCOURSE_MARKER("~"),
	URL_EMAIL("U"),
	EMOTICON("E"),
	NUMERAL("$"),
	PUNCTUATION(","),
	FOREIGN("G");
	
	
	private final String value;
	
	private CMUPosTagsEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public static CMUPosTagsEnum fromValue(String value) {
		if(value != null) {
			for(CMUPosTagsEnum posTagsEnum : CMUPosTagsEnum.values()) {
				if(posTagsEnum.value.equalsIgnoreCase(value)) {
					return posTagsEnum;
				}
			}
		}
		return null;
	}
	 
}
