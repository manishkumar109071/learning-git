package com.TestApplication.utility.interviewQuestion;

public class ReverseString {

	public static String reverseString(String name) {
		String reversString = "";
		for (int x = 0; x < name.length(); x++) {
			reversString = name.charAt(x) + reversString;
		}
		return reversString;
	}

	public static Integer reverseNumber(Integer number) {

		Integer reverseNumber = 0;
		if (number < 10) {
			return number;
		}
		while (number != 0) {

			reverseNumber = reverseNumber * 10 + number % 10;
			number = number / 10;
		}

		return reverseNumber;
	}

	public static void main(String[] args) {
		final String NAME = "Manish";
		final Integer NUMBER = 123456789;
		System.out.println("Reverse of "+NAME+" is: "+ reverseString(NAME));
		System.out.println("Reverse of "+NUMBER+" is: "+ reverseNumber(NUMBER));

	}

}
