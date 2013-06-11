/**
 * Copyright KonceptGeeek
 */
package konceptgeek.nlp.sentiment.nrc.inf;

import konceptgeek.nlp.sentiment.nrc.exception.PreProcessException;
import konceptgeek.nlp.sentiment.nrc.model.PreProcessBO;


/**
 * @author konceptgeek
 *
 */
public interface IPreProcess {
	public void preProcess(PreProcessBO preProcessBO) throws PreProcessException;
}
