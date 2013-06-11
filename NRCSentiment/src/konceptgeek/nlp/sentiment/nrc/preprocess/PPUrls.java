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
public class PPUrls implements IPreProcess {

	@Override
	public void preProcess(PreProcessBO preProcessBO)
			throws PreProcessException {
		double urlCount = 0.0;
		String ppText = preProcessBO.getPreProcessedText();
		Pattern pattern = Regex.VALID_URL;//Pattern.compile(RegexConstants.PP_URL,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(ppText);
		
		while(matcher.find()) {
			ppText = matcher.replaceFirst(PreProcessEnum.URL_PRE.getValue());
			matcher.reset(ppText);
			urlCount++;
		}
		
		ppText = ppText.replaceAll(PreProcessEnum.URL_PRE.getValue(), PreProcessEnum.URL.getValue());
		preProcessBO.setPreProcessedText(ppText);
		preProcessBO.setUrlCount(urlCount);
	}

}
