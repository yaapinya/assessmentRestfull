package com.webservice.rest.assessment.No123;

import java.util.stream.LongStream;

public class Assessment1 {
	
	public static long firstFactorial(int num) {
	return LongStream.rangeClosed(1, num).reduce(1, (long a, long b) -> a * b);
}

	public static void main(String[] args){
		int num = 4;
		System.out.println(firstFactorial(num));
		
	}
}
