/**
 * Copyright KonceptGeeek
 */
package konceptgeek.nlp.sentiment.nrc.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cmu.arktweetnlp.Tagger.TaggedToken;

import konceptgeek.nlp.sentiment.nrc.constants.INRCSentimentConstants;
import konceptgeek.nlp.sentiment.nrc.model.FeatureExtractorBO;
import konceptgeek.nlp.sentiment.nrc.model.OutputBO;
import konceptgeek.nlp.sentiment.nrc.model.PreProcessBO;
import konceptgeek.nlp.sentiment.nrc.model.Token;

/**
 * The Class NRCSentiment.
 *
 * @author konceptgeek
 */
public class NRCSentiment {

	/** The pre process. */
	private PreProcess preProcess;
	
	/** The cmu tagger. */
	private CMUTagger cmuTagger;
	
	/** The feature extractor. */
	private FeatureExtractor featureExtractor;
	
	/**
	 * Instantiates a new nRC sentiment.
	 */
	public NRCSentiment() {
		// TODO Auto-generated constructor stub
		preProcess = new PreProcess();
		try {
			cmuTagger = new CMUTagger(INRCSentimentConstants.CMU_TWEET_MODEL);
		} catch (IOException e) {
			e.printStackTrace();
		}
		featureExtractor = new FeatureExtractor();
		
	}
	
	/**
	 * Process tweets.
	 *
	 * @param tweet the tweet
	 * @return the output bo
	 */
	public OutputBO processTweets(String tweet) {
		PreProcessBO preProcessBO = preProcessText(tweet);
		List<Token> tweetTokens = tagAndTokenizeTweet(preProcessBO);
		FeatureExtractorBO featureExtractorBO = extractFeatures(preProcessBO, tweetTokens);
		OutputBO outputBO = classifyTweet(featureExtractorBO);
		return outputBO;
	}

	/**
	 * Classify tweet.
	 *
	 * @param featureExtractorBO the feature extractor bo
	 * @return the output bo
	 */
	private OutputBO classifyTweet(FeatureExtractorBO featureExtractorBO) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Extract features.
	 *
	 * @param preProcessBO the pre process bo
	 * @param tweetTokens the tweet tokens
	 * @return the feature extractor bo
	 */
	private FeatureExtractorBO extractFeatures(PreProcessBO preProcessBO,
			List<Token> tweetTokens) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Tag and tokenize tweet.
	 *
	 * @param preProcessBO the pre process bo
	 * @return the list
	 */
	private List<Token> tagAndTokenizeTweet(PreProcessBO preProcessBO) {
		List<TaggedToken> taggedTokens = cmuTagger.tagTweet(preProcessBO.getPreProcessedText());
		List<Token> tokens = new ArrayList<>();
		for (TaggedToken taggedToken : taggedTokens) {
			Token token = new Token();
			token.setText(taggedToken.token);
			token.setPos(taggedToken.tag);
			tokens.add(token);
		}
		return tokens;
	}

	/**
	 * Pre process text.
	 *
	 * @param tweet the tweet
	 * @return the pre process bo
	 */
	private PreProcessBO preProcessText(String tweet) {
		PreProcessBO bo = new PreProcessBO(tweet);
		preProcess.preProcess(bo);
		return bo;
	}
	
}
