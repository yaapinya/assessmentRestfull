package com.webservice.rest.assessment.No123;

import java.util.Arrays;

import com.webservice.rest.assessment.beans.AlphabetSoupOutput;

public class AlphabetSoup3 {

	public static String alphabetSoup(String str) {

		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		String result = new String(charArray);
		System.out.println("input :" + result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "coderbyte";
		alphabetSoup(str);
	}

}
