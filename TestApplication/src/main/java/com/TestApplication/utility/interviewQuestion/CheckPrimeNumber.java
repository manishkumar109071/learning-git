package com.TestApplication.utility.interviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class CheckPrimeNumber {

	public static boolean checkPrimeNumber(int num) {
		if (num < 2) {
			return false;
		} else {

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> primeNumberList = new ArrayList<>();
		List<Integer> nonPrimeNumberList = new ArrayList<>();
		for (int x = 1; x <= 30; x++) {
			if (checkPrimeNumber(x)) {
				primeNumberList.add(x);
			} else {
				nonPrimeNumberList.add(x);
			}
		}
		System.out.println("Prime:" + primeNumberList.size() + " \n" + primeNumberList);
		System.out.println("Non Prime:" + nonPrimeNumberList.size() + " \n" + nonPrimeNumberList);

	}

}
