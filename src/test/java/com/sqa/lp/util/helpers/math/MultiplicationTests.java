/**
 *   File Name: MyMathTests.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Apr 13, 2016
 *
 */

package com.sqa.lp.util.helpers.math;

import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.*;

import com.sqa.lp.util.helpers.*;

/**
 * MyMathTests //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Nepton, Jean-francois
 * @version 1.0.0
 * @since 1.0
 *
 */
@RunWith(Parameterized.class)
public class MultiplicationTests {

	@Parameters
	public static Object[][] getData() {
		Object[][] data = { { new double[] { 2.0, 3.0, 4.0, 2.0 }, 50 }, { new double[] { 2.0, 1.0, 5.0 }, 10.0 },
				{ new double[] { 3.0, 1.5 }, 4.5 }, { new double[] { 0.0, 5.0, 15.0, 10.0 }, 0.0 },
				{ new double[] { 1.0, 2.0, 2.5, 3.0, 6.0 }, 90.0 }, { new double[] { 1.5, 5.5, 0.0 }, 0.0 } };
		return data;
	}

	private double expectedResult;
	private double[] numbers;

	public MultiplicationTests(double[] numbers, double expectedResult) {
		this.numbers = numbers;
		this.expectedResult = expectedResult;
	}

	@Test
	public void testMultiplication() {
		double actualResult = MyMath.multNumbers(this.numbers);
		String numbersString = Arrays.toString(this.numbers);
		String errorMessage = String.format(
				"Error: The result of multiplying all numbers %s " + " is actually %.2f not expected.", numbersString,
				actualResult);
		String message = String.format("The result of multiplying all numbers %s " + " is %.2f.", numbersString,
				actualResult);
		System.out.println(message);
		Assert.assertEquals(errorMessage, this.expectedResult, actualResult, 2);
	}
}