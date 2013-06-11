/**
 * Copyright KonceptGeeek
 */
package konceptgeek.nlp.sentiment.nrc.impl;

import java.util.ArrayList;
import java.util.List;

import konceptgeek.nlp.sentiment.nrc.exception.PreProcessException;
import konceptgeek.nlp.sentiment.nrc.inf.IPreProcess;
import konceptgeek.nlp.sentiment.nrc.model.PreProcessBO;
import konceptgeek.nlp.sentiment.nrc.preprocess.PPTargets;
import konceptgeek.nlp.sentiment.nrc.preprocess.PPUrls;


/**
 * @author konceptgeek
 *
 */
public class PreProcess {
	private IPreProcess ppUrls;
	private IPreProcess ppTargets;
	private List<IPreProcess> ppClasses;
	
	public PreProcess() {
		ppUrls = new PPUrls();
		ppTargets = new PPTargets();
		ppClasses = addPreProcessClasses();
	}

	private List<IPreProcess> addPreProcessClasses() {
		ppClasses = new ArrayList<IPreProcess>();
		ppClasses.add(ppUrls);
		ppClasses.add(ppTargets);
		return ppClasses;
	}

	public void preProcess(PreProcessBO preProcessBO) {
		for(IPreProcess ppClass : ppClasses) {
			try {
				ppClass.preProcess(preProcessBO);
			} catch (PreProcessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		preProcessBO.setPreProcessedText(preProcessBO.getPreProcessedText().trim());
	}
	
}
