package project1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestCase
{
	@Test
	public void testAddition()
	{
		MathOperations math = new MathOperations();
		
		assertEquals(math.add(10, 10), 20);
		
	}
	
	@Test
	public void testSub()
	{
		MathOperations math = new MathOperations();
		
		assertEquals(math.sub(20, 10), 10);
		
	}
	
	@Test
	public void testMul()
	{
		MathOperations math = new MathOperations();
		
		assertEquals(math.mul(5, 3), 15);
		
	}
	
	@Test
	public void testDiv()
	{
		MathOperations math = new MathOperations();
		
		assertEquals(math.div(20, 5), 4);
		
	}
	
}