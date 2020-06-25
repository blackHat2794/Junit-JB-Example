package com.blackhat.mathutil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assume.assumeThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BasicSchoolMathOperationsTest {

	@Test
	// @EnableOnOS(OS.WINDOWS)
	@Tag("DEV")
	@DisplayName("This is adding the two positive number")
	void whenAddTwoPositiveNumbersThenReturnSumOfTwoGivenNumbers_postive() {
		BasicSchoolMathOperations mathOperations = new BasicSchoolMathOperations();
		int actual = mathOperations.add(10, 20);
		int expected = 30;

		assertEquals(expected, actual);
	}

	@Test
	@Disabled
	void whenAddTwoNegativeNumbersThenReturnSumOfTwoGivenNumbersShouldBePositive_addTest() {
		BasicSchoolMathOperations mathOperations = new BasicSchoolMathOperations();
		int actual = mathOperations.add(-10, -20);
		int expected = -30;

		assertEquals(expected, actual, "Should be -negative outcome");
	}

	@Test
	@Tag("DEV")
	@DisplayName("Adding one positive and one negative number")
	void whenAddOneNumberPositiveAndOneNumberNegativeThenReturnSumOfTwoGivenNumbers_negative() {
		BasicSchoolMathOperations mathOperations = new BasicSchoolMathOperations();
		int actual = mathOperations.add(-10, 20);
		int expected = 10;

		assertEquals(expected, actual);
	}

	@Test
	@Tag("PROD")
	@DisplayName("This is calculating area of circle")
	@RepeatedTest(5)
	// void whenGivenRadiusThenReturnAreaOf_CircleComputeTest(RepetitionInfo
	// repetitionInfo ) {
	void whenGivenRadiusThenReturnAreaOf_CircleComputeTest() {

		BasicSchoolMathOperations mathOperations = new BasicSchoolMathOperations();
		float actual = mathOperations.circleCompute(10);
		assertEquals(100.00, actual);
	}

	@Test
	@Tag("SIT")
	void whenGivenNumberDividedByZeroThenThrowArithmeticException() {
		BasicSchoolMathOperations mathOperations = new BasicSchoolMathOperations();
		assertThrows(ArithmeticException.class, () -> mathOperations.divide(1, 0), "divide by zero should throw AE");
	}

	@Test
	@Tag("TEST")
	void assumeThatTest() {
		assumeThat("Always passes", 1, is(1));
	}

	@Test
	@Tag("TEST")
	@DisplayName("subtract two numbers using assertAll()")
	void subtractionTest() {
		assertAll(() -> assertEquals(10, new BasicSchoolMathOperations().subtract(20, 10)),
				() -> assertEquals(-10, new BasicSchoolMathOperations().subtract(10, 20)),
				() -> assertEquals(-10, new BasicSchoolMathOperations().subtract(-20, -10)),
				() -> assertEquals(60, new BasicSchoolMathOperations().subtract(50, -10)),
				() -> assertEquals(-30, new BasicSchoolMathOperations().subtract(-20, 10)));
	}

	/*
	 * @Test void supplierForAssertMessage() {
	 * 
	 * assertEquals(100.00f, new BasicSchoolMathOperations().circleCompute(10), ()
	 * -> "Should return subtraction " + expected + "but retuned" + actual); }
	 */

	@Test
	void addTest() {
		BasicSchoolMathOperations mathOperations = new BasicSchoolMathOperations();
		int actual = mathOperations.add(-10, -20);
		int expected = -30;

		assertEquals(expected, actual, "Should be -negative outcome");
	}
}
