/**
 * Copyright KonceptGeeek
 */
package konceptgeek.nlp.sentiment.nrc.preprocess;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import konceptgeek.nlp.sentiment.nrc.constants.PreProcessEnum;
import konceptgeek.nlp.sentiment.nrc.constants.Regex;
import konceptgeek.nlp.sentiment.nrc.exception.PreProcessException;
import konceptgeek.nlp.sentiment.nrc.inf.IPreProcess;
import konceptgeek.nlp.sentiment.nrc.model.PreProcessBO;


/**
 * @author konceptgeek
 *
 */
public class PPTargets implements IPreProcess {

	/* (non-Javadoc)
	 * @see org.konceptgeek.nlp.sentiment.nrc.inf.IPreProcess#preProcess(org.konceptgeek.nlp.sentiment.nrc.model.PreProcessBO)
	 */
	@Override
	public void preProcess(PreProcessBO preProcessBO)
			throws PreProcessException {
		double targetCount = 0.0;
		String ppText = preProcessBO.getPreProcessedText();
		Pattern pattern = Regex.VALID_MENTION_OR_LIST;
		Matcher matcher = pattern.matcher(ppText);
		
		while(matcher.find()) {
			ppText = matcher.replaceFirst(PreProcessEnum.TARGET_PRE.getValue());
			matcher.reset(ppText);
			targetCount++;
		}
		
		ppText = ppText.replaceAll(PreProcessEnum.TARGET_PRE.getValue(), PreProcessEnum.TARGET.getValue());
		preProcessBO.setPreProcessedText(ppText);
		preProcessBO.setTargetCount(targetCount);

	}

}
