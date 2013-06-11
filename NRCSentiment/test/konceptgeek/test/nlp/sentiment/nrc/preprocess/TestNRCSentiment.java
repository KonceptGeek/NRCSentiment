/**
 * Copyright KonceptGeeek
 */
package konceptgeek.test.nlp.sentiment.nrc.preprocess;

import konceptgeek.nlp.sentiment.nrc.impl.NRCSentiment;

/**
 * @author konceptgeek
 * 
 */
public class TestNRCSentiment {
	public static void main(String[] args) {
		NRCSentiment sent = new NRCSentiment();
		String tweet = "From Katz's pastrami to Magnolia's cupcakes, Goldbely ships the country's famous foods to your door: http://lifehac.kr/b6X7kpk ";
		sent.processTweets(tweet);
	}
}
