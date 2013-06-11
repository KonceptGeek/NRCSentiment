/**
 * Copyright KonceptGeeek
 */
package konceptgeek.nlp.sentiment.nrc.impl;

import java.io.IOException;
import java.util.List;

import konceptgeek.nlp.sentiment.nrc.constants.INRCSentimentConstants;

import cmu.arktweetnlp.Tagger;
import cmu.arktweetnlp.Tagger.TaggedToken;

/**
 * @author konceptgeek
 *
 */
public class CMUTagger {
	private Tagger tagger;
	
	public CMUTagger(String modelPath) throws IOException {
		tagger = new Tagger();
		tagger.loadModel(modelPath);
	}
	
	public List<TaggedToken> tagTweet(String tweet) {
		List<TaggedToken> taggedTokens = tagger.tokenizeAndTag(tweet);
		return taggedTokens;
	}
	
	public static void main(String[] args) {
		try {
			CMUTagger tagger = new CMUTagger(INRCSentimentConstants.CMU_TWEET_MODEL);
			List<TaggedToken> tagTweet = tagger.tagTweet("From Katz's pastrami to Magnolia's cupcakes, Goldbely ships the country's famous foods to your door: http://lifehac.kr/b6X7kpk ");
			for (TaggedToken taggedToken : tagTweet) {
				System.out.println(taggedToken.token + "\t" + taggedToken.tag );
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
