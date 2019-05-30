package com.webservice.rest.assessment.No123;

import com.webservice.rest.assessment.beans.FirstReverseInput;
import com.webservice.rest.assessment.beans.FirstReverseOutput;

public class Assessment2 {
	
	public static String firstRevers(String str) {
		
		StringBuilder input = new StringBuilder(); 
        input.append(str);         
        //reverse
		input.reverse(); 
		// return output
		System.out.println(input.toString());
		return input.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "coderbyte";
		firstRevers(str);
	}

}
