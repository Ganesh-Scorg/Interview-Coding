package org.gs;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MagicSquareTester
{
	@Before
	public void setup()
	{
		
	}
	
	/**
	 * Test conversion of 3*3 Matrix into magic square and assert the result.
	 * Also assert replacement cost of conversion
	 */
	@Test
	public void test3by3MagicSquare()
	{
		System.out.println("===============test3by3MagicSquare====================");
		MagicSquare s = new MagicSquare();
		System.out.println("Current 3*3 Input Matrix");
		s.printMatrix();
		
		try
		{
			s.convertMartixToMagicMatrix();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(
			"Square Matrix converted to Magic Square at the cost of " + s.getReplacementcost());
		
		int threeby3expectedmagicsqaure[][] = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
		assertEquals(7, s.getReplacementcost());
		assertEquals(threeby3expectedmagicsqaure, s.getMatrixsquare());
	}
	
	/**
	 * Test conversion of 3*3 Matrix (wrong middle case)into magic square and assert the result.
	 * Also assert replacement cost of conversion
	 */
	@Test
	public void test3by3MagicSquare2()
	{
		System.out.println("===============test3by3MagicSquare====================");
		int threeby3matrix[][] = {{5, 3, 4}, {1, 9, 8}, {6, 4, 2}};
		MagicSquare s = new MagicSquare(3,threeby3matrix);
		System.out.println("Current 3*3 Input Matrix");
		s.printMatrix();
		
		try
		{
			s.convertMartixToMagicMatrix();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(
			"Square Matrix converted to Magic Square at the cost of " + s.getReplacementcost());
		
		int threeby3expectedmagicsqaure[][] = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
		assertEquals(11, s.getReplacementcost());
		assertEquals(threeby3expectedmagicsqaure, s.getMatrixsquare());
	}
	
	/**
	 * Test conversion of 4*4 Matrix into magic square and assert the result.
	 * Also assert replacement cost of conversion
	 */
	@Test
	public void test4by4MagicSquare()
	{
		System.out.println("===============test4by4MagicSquare====================");
		int fourby4matrx[][] = {{16, 5, 3, 13}, {5, 11, 10, 8}, {9, 7, 6, 12}, {4, 14, 15, 1}};
		
		MagicSquare s = new MagicSquare(4, fourby4matrx);
		System.out.println("Current 4*4 Input Matrix");
		s.printMatrix();
		
		try
		{
			s.convertMartixToMagicMatrix();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(
			"Square Matrix converted to Magic Square at the cost of " + s.getReplacementcost());
		
		int fourby4expectedmagicsquare[][] = {{16, 2, 3, 13}, {5, 11, 10, 8}, {9, 7, 6, 12}, {4, 14, 15, 1}};
		
		assertEquals(3, s.getReplacementcost());
		assertEquals(fourby4expectedmagicsquare, s.getMatrixsquare());
	}
	
	/**
	 * Test conversion of 5*5 Matrix into magic square and assert the result.
	 * Also assert replacement cost of conversion
	 */
	@Test
	public void test5by5MagicSquare()
	{
		System.out.println("===============test5by5MagicSquare====================");
		int fiveby5matrix[][] = {{9, 3, 22, 16, 15}, {2, 21, 20, 14, 8}, {25, 19, 13, 7, 1},
			{18, 12, 6, 12, 24}, {11, 10, 4, 23, 17}};
		
		MagicSquare s = new MagicSquare(5, fiveby5matrix);
		System.out.println("Current 5*5 Input Matrix");
		s.printMatrix();
		
		try
		{
			s.convertMartixToMagicMatrix();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(
			"Square Matrix converted to Magic Square at the cost of " + s.getReplacementcost());
		
		int fiveby5expectedMagicSqaure[][] = {{9, 3, 22, 16, 15}, {2, 21, 20, 14, 8}, {25, 19, 13, 7, 1},
			{18, 12, 6, 5, 24}, {11, 10, 4, 23, 17}};
		
		assertEquals(7, s.getReplacementcost());
		assertEquals(fiveby5expectedMagicSqaure, s.getMatrixsquare());
	}
}
