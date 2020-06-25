package com.blackhat.mathutil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestInstanceTest {
	BasicSchoolMathOperations mathOperations;

	@BeforeAll
	void contextBeforeAll() {
		System.out.println("This method will call just once before anything: contextAll()"
				+ BasicSchoolMathOperationsTest.class.getName());
	}

	@BeforeEach
	void initEach() {
		mathOperations = new BasicSchoolMathOperations();
		System.out.println("This Method will call before each and every test(method): initEach() : " + this.hashCode());
	}

	@Test
	void whenAddOneNumberPositiveAndOneNumberNegativeThenReturnSumOfTwoGivenNumbers_negative() {
		assertEquals(10, mathOperations.add(-10, 20));
	}

	@Test
	void whenGivenRadiusThenReturnAreaOf_CircleComputeTest() {
		assertEquals(100.00, mathOperations.circleCompute(10));
	}

	// If we will not enable annotation, junit will not call this method
	@AfterEach
	void destroyEach() {
		System.out.println("Before Destroyed Object hashCode : " + this.hashCode());
		mathOperations = null;
		System.out.println("Destroyed Object after each and every test call : " + this.hashCode());
	}

	@AfterAll
	void contextAfterAll() {
		System.out.println("This method will call just once before anything: contextAfterAll()"
				+ BasicSchoolMathOperationsTest.class.getName());
	}
}
