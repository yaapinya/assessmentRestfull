package com.webservice.rest.assessment.services;

import java.util.Arrays;

import com.webservice.rest.assessment.beans.AlphabetSoupInput;
import com.webservice.rest.assessment.beans.AlphabetSoupOutput;
import com.webservice.rest.assessment.beans.FirstFactorialInput;
import com.webservice.rest.assessment.beans.FirstFactorialOutput;

public interface AlphabetSoupService {
	
	static AlphabetSoupOutput AlphabetSoup(AlphabetSoupInput str) {
		
		String  input = str.getInput();

		char[] charArray = input.toString().toCharArray();
		Arrays.sort(charArray);
		
		AlphabetSoupOutput output = new AlphabetSoupOutput();
		String result = new String(charArray);
		 output.setOutput(result);

		return output;
	}

}
