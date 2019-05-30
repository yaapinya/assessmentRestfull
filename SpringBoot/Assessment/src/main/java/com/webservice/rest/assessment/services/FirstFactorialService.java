package com.webservice.rest.assessment.services;

import java.util.stream.LongStream;

import com.webservice.rest.assessment.beans.FirstFactorialInput;
import com.webservice.rest.assessment.beans.FirstFactorialOutput;

public interface FirstFactorialService {
	static FirstFactorialOutput FirstFactorial(FirstFactorialInput input) {

		// Calculate factorial
		long n = input.getInput();
		long o = LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);

		// Set output
		FirstFactorialOutput output = new FirstFactorialOutput();
		output.setOuput(o);

		// return output
		return output;
	}
	
	

}
