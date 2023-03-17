package com.qa.demo;

public class Factorial {

	public int returnFactorial(int num) {
		int result = 1;

		if (num == 0) {
			return result;
		} else if (num > 1) {
			for (int index = num; index >= 1; index--) {
				result = result * index;

			}
		} else {
			result = -1;
		}

		return result;

	}

	public static void main(String[] args) {

	}

}
