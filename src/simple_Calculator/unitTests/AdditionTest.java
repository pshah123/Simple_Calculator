package simple_Calculator.unitTests;

import static org.junit.Assert.*;

import simple_Calculator.Calculator;

public class AdditionTest {

	@org.junit.Test
	public void additionWith_TwoPositiveIntegers(){
		assertEquals(10, Calculator.addition(5, 5), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_TwoPositiveDoubles(){
		assertEquals(10.5, Calculator.addition(5.4, 5.1), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_ZeroAndPositiveInteger(){
		assertEquals(10, Calculator.addition(0, 10), 0.0000001);
		assertEquals(10, Calculator.addition(10, 0), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_ZeroAndPositiveDouble() {
		assertEquals(10.1, Calculator.addition(0, 10.1), 0.0000001);
		assertEquals(10.3, Calculator.addition(10.3, 0), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_TwoNegativeIntegers()  {
		assertEquals(-12, Calculator.addition(-7, -5), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_TwoNegativeDoubles() {
		assertEquals(-10.5, Calculator.addition(-5.4, -5.1), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_ZeroAndNegativeInteger() {
		assertEquals(-5, Calculator.addition(0, -5), 0.0000001);
		assertEquals(-5, Calculator.addition(-5, 0), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_ZeroAndNegativeDouble() {
		assertEquals(-10.45, Calculator.addition(0, -10.45), 0.0000001);
		assertEquals(-10.3, Calculator.addition(-10.3, 0), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_Zeroes() {
		assertEquals(0, Calculator.addition(0, 0), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_PositiveAndNegativeIntegers_ResultPositive() {
		assertEquals(75, Calculator.addition(100, -25), 0.0000001);
		assertEquals(75, Calculator.addition(-25, 100), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_PositiveAndNegativeIntegers_ResultNegative() {
		assertEquals(-51.538, Calculator.addition(23.672, -75.21), 0.0000001);
		assertEquals(-51.538, Calculator.addition(-75.21, 23.672), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_PositiveAndNegativeIntegers_ResultZero() {
		assertEquals(0, Calculator.addition(50, -50), 0.0000001);
		assertEquals(0, Calculator.addition(-50, 50), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_PositiveAndNegativeDoubles_ResultPositive() {
		assertEquals(26.24, Calculator.addition(50.76, -24.52), 0.0000001);
		assertEquals(26.24, Calculator.addition(-24.52, 50.76), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_PositiveAndNegativeDoubles_ResultNegative() {
		assertEquals(26.24, Calculator.addition(50.76, -24.52), 0.0000001);
		assertEquals(26.24, Calculator.addition(-24.52, 50.76), 0.0000001);
	}

	@org.junit.Test
	public void additionWith_PositiveAndNegativeDoubles_ResultZero() {
		assertEquals(0, Calculator.addition(50.76, -50.76), 0.0000001);
		assertEquals(0, Calculator.addition(-50.76, 50.76), 0.0000001);
	}

	@org.junit.Test
	public void additionCallingItself() {
		assertEquals(50, Calculator.addition(Calculator.addition(20,5), Calculator.addition(15, 10)), 0.0000001);
	}

	@org.junit.Test(expected = ArithmeticException.class)
	public void additionWithOverflow() {
		Calculator.addition(Double.MAX_VALUE, Double.MAX_VALUE);
	}
}
