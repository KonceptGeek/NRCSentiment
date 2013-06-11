/**
 * Copyright KonceptGeeek
 */
package konceptgeek.nlp.sentiment.nrc.constants;

/**
 * @author konceptgeek
 * 
 */
public enum PreProcessEnum {
	URL_PRE(" SA_U "),
	URL(" http://someurl"),
	TARGET_PRE(" SA_T "),
	TARGET(" @someuser");

	private final String value;

	private PreProcessEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public PreProcessEnum fromValue(String value) {
		if (value != null) {
			for (PreProcessEnum ppEnum : PreProcessEnum.values()) {
				if(ppEnum.value.equalsIgnoreCase(value)) {
					return ppEnum;
				}
			}
		}
		return null;
	}
}
