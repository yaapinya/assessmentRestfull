package com.webservice.rest.assessment.endpoint;

import java.util.stream.LongStream;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.rest.assessment.beans.AlphabetSoupInput;
import com.webservice.rest.assessment.beans.AlphabetSoupOutput;
import com.webservice.rest.assessment.beans.FirstFactorialInput;
import com.webservice.rest.assessment.beans.FirstFactorialOutput;
import com.webservice.rest.assessment.beans.FirstReverseInput;
import com.webservice.rest.assessment.beans.FirstReverseOutput;
import com.webservice.rest.assessment.services.AlphabetSoupService;
import com.webservice.rest.assessment.services.FirstFactorialService;
import com.webservice.rest.assessment.services.FirstReverseService;

@RestController
public class AssessmentEndpoint {

//	@PostMapping("/api/firstfactorial/{n}")
//	public static long factorial1(@PathVariable int n) {
//		return LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);
//	}
	
	
	//firstFactorial
	@PostMapping("/api/firstfactorial")
	public FirstFactorialOutput firstFactorial(@RequestBody FirstFactorialInput num) {     
    	return FirstFactorialService.FirstFactorial(num);
	}
	
	//firstReverse
	@PostMapping("/api/rirstreverse")
	public FirstReverseOutput firstReverse(@RequestBody FirstReverseInput str) {     
    	return FirstReverseService.FirstReverse(str);
	}
	
	//alphabetSoup
	@PostMapping("/api/alphabetSoup")
	public AlphabetSoupOutput alphabetSoup(@RequestBody AlphabetSoupInput str) {     
    	return AlphabetSoupService.AlphabetSoup(str);
	}
}
