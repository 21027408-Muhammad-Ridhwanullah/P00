import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest2 {
	private int a, b;
	Calculator cal;

	@Before
	public void setUp() throws Exception {
		// Arrange
		int a = 4321;
		int b = 1234;
		Calculator cal = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		// act
		int actual = cal.add(a, b);

		// assert
		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		// act
		int actual = cal.subtract(a, b);

		// assert
		int expected = 3087;
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiply() {
		// act
		int actual = cal.multiply(a, b);

		// assert
		int expected = 5332114;
		assertEquals(expected, actual);
	}

	@Test
	public void testDivide() {
		// act enhancement
		int actual = cal.divide(a, b);
		if (a == 0 || b == 0) {
			System.out.println("Numbers cannot be divided by 0.");
		}
		// act enhancement with try catch
		try {
			actual = cal.divide(a, b);
		}catch(ArithmeticException ae) {
			System.out.println("Numbers cannot be divided by 0.");
		}

		// assert
		int expected = 3;
		assertEquals(expected, actual);
		
		
	}

}
