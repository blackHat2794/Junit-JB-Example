package com.blackhat.mathutil;

/*
 *Manually Testing: We need to format the success and failure in format so that 
 *one can understand where is the problem, what is expected, what is the actual, but 
 *when comes to huge code base this will be difficult to identify what is the success 
 *message or what is the failure, we can do one thing, we can differentiate by using 
 *System.err.println() method, that will give you the nice color. 
 */
public class BasicSchoolOperationsMathManullyTest {

	public static void main(String[] args) {

		BasicSchoolMathOperations mathOperations = new BasicSchoolMathOperations();
		int sum;
		int sub;
		float div;
		int mul;

		sum = mathOperations.add(10, 20);

		if (sum != 30) {
			System.err.println("Addition Test Failed");
		} else {
			System.out.println("Addition Test Pass");
		}

		sub = mathOperations.subtract(20, 10);

		if (sub != 10) {
			System.err.println("Substraction Test Failed");
		} else {
			System.out.println("Subtraction Test Pass");
		}

		div = mathOperations.divide(20, 5);
		if (div != 4) {
			System.err.println("Division Test Failed");
		} else {
			System.out.println("Divison Test Pass");
		}
		mul = mathOperations.multiplication(20, 7);
		if (mul != 80) {
			System.err.println("Multiplication Test Failed");
		} else {
			System.out.println("Multiplication Test Pass");
		}
	}
}
