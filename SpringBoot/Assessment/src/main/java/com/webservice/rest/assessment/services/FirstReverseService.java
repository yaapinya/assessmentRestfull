package com.webservice.rest.assessment.services;

import com.webservice.rest.assessment.beans.FirstReverseInput;
import com.webservice.rest.assessment.beans.FirstReverseOutput;

public interface FirstReverseService {
	
	        
			static FirstReverseOutput FirstReverse(FirstReverseInput str) {
				
				StringBuilder input = new StringBuilder(); 
		        input.append(str.getInput()); 
		        
		        //reverse
				input = input.reverse(); 

				FirstReverseOutput output = new FirstReverseOutput();		
				output.setOutput(input.toString());

				// return output
				return output;
			}

}
