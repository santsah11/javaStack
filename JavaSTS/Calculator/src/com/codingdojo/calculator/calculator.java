package com.codingdojo.calculator;
import java.util.*;

public class calculator {
	private static Scanner scanner = new Scanner( System.in );

	public static void main(String[] args) {

		System.out.println( "Type some data for the calculations: " );
		String input = scanner.nextLine();
		System.out.println("User has given us" +input);
		calculator.getResult();
	}
	public static void performOperation(double x,double y) {
		double result = x+y;
		System.out.println(result);

	}

	public static void getResult() {
		calculator.performOperation(10.5, 5.2);
		System.out.println("please add the first num");
		boolean firstNum =	scanner.hasNextLine();
		System.out.println("please add the second num");
		boolean secondNum =	scanner.hasNextLine();

	}
}
