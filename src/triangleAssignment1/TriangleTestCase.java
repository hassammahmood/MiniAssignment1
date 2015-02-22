package triangleAssignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTestCase {

	@Test
	public void testCase1() {
		float a = 10;
		float b = 4;
		float c = 3;
		
		int expectedValue = 1; //1 if triangle exists
		
		TriangleClass myObj = new TriangleClass();
		int actualValue = myObj.classifyTriangle(a, b, c); //fetches the return value, 1 if triangle exists and 2 if it does not
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testCase2() {
		float a = 5;
		float b = 4;
		float c = 3;
		
		int expectedValue = 1; //1 if triangle exists
		
		TriangleClass myObj = new TriangleClass();
		int actualValue = myObj.classifyTriangle(a, b, c); //fetches the return value, 1 if triangle exists and 2 if it does not
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testCase3() {
		float a = Float.MAX_VALUE;
		float b = Float.MAX_VALUE;
		float c = 0;
		
		int expectedValue = 1; //1 if triangle exists
		
		TriangleClass myObj = new TriangleClass();
		int actualValue = myObj.classifyTriangle(a, b, c); //fetches the return value, 1 if triangle exists and 2 if it does not
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testCase4() {
		float a = Float.MAX_VALUE;
		float b = Float.MAX_VALUE;
		float c = Float.MAX_VALUE;
		
		int expectedValue = 1; //1 if triangle exists
		
		TriangleClass myObj = new TriangleClass();
		int actualValue = myObj.classifyTriangle(a, b, c); //fetches the return value, 1 if triangle exists and 2 if it does not
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testCase5() {
		float a = 0;
		float b = 4;
		float c = 3;
		
		int expectedValue = 1; //1 if triangle exists
		
		TriangleClass myObj = new TriangleClass();
		int actualValue = myObj.classifyTriangle(a, b, c); //fetches the return value, 1 if triangle exists and 2 if it does not
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testCase6() {
		float a = 0;
		float b = 0;
		float c = 0;
		
		int expectedValue = 1; //1 if triangle exists
		
		TriangleClass myObj = new TriangleClass();
		int actualValue = myObj.classifyTriangle(a, b, c); //fetches the return value, 1 if triangle exists and 2 if it does not
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testCase7() {
		float a = Float.MIN_VALUE;
		float b = Float.MIN_VALUE;
		float c = Float.MIN_VALUE;
		
		int expectedValue = 1; //1 if triangle exists
		
		TriangleClass myObj = new TriangleClass();
		int actualValue = myObj.classifyTriangle(a, b, c); //fetches the return value, 1 if triangle exists and 2 if it does not
		
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	public void testCase8() {
		float a = Float.MIN_VALUE;
		float b = Float.MIN_VALUE;
		float c = 0;
		
		int expectedValue = 1; //1 if triangle exists
		
		TriangleClass myObj = new TriangleClass();
		int actualValue = myObj.classifyTriangle(a, b, c); //fetches the return value, 1 if triangle exists and 2 if it does not
		
		assertEquals(expectedValue, actualValue);
	}
}
