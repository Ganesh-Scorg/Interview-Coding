
package org.gs;

/**
 * Class MagicSquare - This class is used to convert the Matrix Sqaure into Magic Square
 * 
 */
public class MagicSquare
{
	private int matrixsquare[][] = {{5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
	private int lengthofsquareside = 3;
	private int middleindex;
	private int middlelement;
	private int rowandcolsum;
	private int replacementcost;
	
	MagicSquare()
	{
		init();
	}
	
	/**
	 * 
	 * Constructs a new <code>MagicSquare</code> instance.
	 * 
	 * @param lengthofsquareside
	 * @param matrixsquare
	 */
	MagicSquare(int lengthofsquareside, int[][] matrixsquare)
	{
		this.lengthofsquareside = lengthofsquareside;
		this.matrixsquare = matrixsquare;
		init();
	}
	
	/***
	 * Initialized the required parameters for Magic Square processing
	 *
	 */
	void init()
	{
		rowandcolsum = lengthofsquareside * (lengthofsquareside * lengthofsquareside + 1) / 2;
		
		if (lengthofsquareside % 2 != 0)
		{
			middleindex = lengthofsquareside / 2;
			middlelement = rowandcolsum / lengthofsquareside;
		}
	}
	
	public int[][] getMatrixsquare()
	{
		return matrixsquare;
	}
	
	public int getLengthofsquareside()
	{
		return lengthofsquareside;
	}
	
	public int getReplacementcost()
	{
		return replacementcost;
	}
	
	/**
	 * Print the Matrix Square in table format
	 * 
	 */
	public void printMatrix()
	{
		for (int row = 0; row < lengthofsquareside; row++)
		{
			for (int col = 0; col < lengthofsquareside; col++)
			{
				System.out.print(" " + matrixsquare[row][col]);
			}
			
			System.out.println();
		}
	}
	
	/**
	 * Method - convertMartixToMagicMatrix It converts the matrix sqaure into Magic Matrix whose row
	 * and column sum is same.
	 *
	 * @throws Exception
	 */
	public void convertMartixToMagicMatrix() throws Exception
	{
		int rowsum[] = new int[lengthofsquareside];
		int colsum[] = new int[lengthofsquareside];
		
		updateSum(rowsum, colsum);
		
		System.out.println();
		System.out.print("All Row Totals : ");
		for (int i = 0; i < lengthofsquareside; i++)
		{
			System.out.print(" " + rowsum[i]);
		}
		System.out.println();
		System.out.print("All Column Totals : ");
		for (int i = 0; i < lengthofsquareside; i++)
		{
			System.out.print(" " + colsum[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < lengthofsquareside; i++)
		{
			for (int j = 0; j < lengthofsquareside; j++)
			{
				if (middleindex != 0 && i == j && j == middleindex)
				{
					if (matrixsquare[i][j] != middlelement)
					{
						replacementcost = replacementcost + Math.abs(middlelement - matrixsquare[i][j]);
						
						matrixsquare[i][j] = middlelement;
						updateSum(rowsum, colsum);
					}
					continue;
				}
				
				if ((rowsum[i] != rowandcolsum && colsum[j] != rowandcolsum))
				{
					
					Integer change = rowandcolsum - (colsum[j] - matrixsquare[i][j]);
					
					if (colsum[j] < rowsum[i])
					{
						change = rowandcolsum - (rowsum[i] - matrixsquare[i][j]);
						// Is change ok? -> does not affect the sum of attached column?
						if (colsum[j] != rowandcolsum &&
							rowandcolsum == (colsum[j] - matrixsquare[i][j] + change))
						{
							// System.out.print("This change is valid..");
						}
						else
						{
							continue;
						}
					}
					else
					{
						// Is change ok? -> does not affect sum of attached row?
						if (rowsum[i] != rowandcolsum &&
							rowandcolsum == (rowsum[i] - matrixsquare[i][j] + change))
						{
							// System.out.print("This change is valid..");
						}
						else
						{
							continue;
						}
					}
					
					if (!(change >= 1 && change <= (lengthofsquareside * lengthofsquareside)))
					{
						throw new Exception("Invalid Square Matrix");
					}
					
					replacementcost = replacementcost + Math.abs(change - matrixsquare[i][j]);
					
					matrixsquare[i][j] = change;
					
					updateSum(rowsum, colsum);
				}
			}
			
		}
		
		if (isValidMagicMatrix(rowsum, colsum))
		{
			System.out.println("Matrix Converted to Magical Sqaure successfully");
		}
		else
		{
			System.out.println("Something went wrong, need to debug");
		}
		
		System.out.println("==================Print Converted Magic Matrix=================");
		printMatrix();
	}
	
	/**
	 * Check whether current matrix is Magical or not
	 * 
	 * @param rowsum
	 * @param colsum
	 * @return true if sum of each row and column is same, false otherwise
	 */
	public boolean isValidMagicMatrix(int rowsum[], int colsum[])
	{
		for (int i = 0; i < lengthofsquareside; i++)
		{
			if (rowsum[i] != rowandcolsum || colsum[i] != rowandcolsum)
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	/**
	 * Calculate sum for each row and column
	 * @param rowsum - array of sum of each row
	 * @param colsum - array of sum of each column
	 */
	public void updateSum(int rowsum[], int colsum[])
	{
		for (int i = 0; i < lengthofsquareside; i++)
		{
			rowsum[i] = 0;
			colsum[i] = 0;
			for (int j = 0; j < lengthofsquareside; j++)
			{
				rowsum[i] += matrixsquare[i][j];
				colsum[i] += matrixsquare[j][i];
			}
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		
		System.out.println("==================Magical Matrix Program=================");
		System.out.println("Matrix rules as follow:");
		System.out.println(
			"1. User will be asked to enter length of a square size e.g. length = 3 will create square of size 3*3 having values 1 to sqaure(3)=9");
		System.out.println(
			"2. The sum of any row, column, or diagonal of length n is always equal to the same number");
		System.out.println(
			"3. We can convert any digit a to any other digit b in the range [1,9] at cost of |a - b|. Given s, convert it into a magic square at minimal cost. Print this cost on a new line.");
		
		MagicSquare s = new MagicSquare();
		System.out.println("Current Input Matrix");
		s.printMatrix();
		s.convertMartixToMagicMatrix();
		
		System.out
			.println("Square Matrix converted to Magic Square at the cost of " + s.replacementcost);
		
		System.out.println("===================================");
		
		int fourby4matrx[][] = {{16, 5, 3, 13}, {5, 11, 10, 8}, {9, 7, 6, 12}, {4, 14, 15, 1}};
		
		MagicSquare s2 = new MagicSquare(4, fourby4matrx);
		System.out.println("Current Input Matrix");
		s2.printMatrix();
		s2.convertMartixToMagicMatrix();
		
		System.out
			.println("Square Matrix converted to Magic Square at the cost of " + s2.replacementcost);
		
		System.out.println("===================================");
		
		int fiveby5matrix[][] = {{9, 3, 22, 16, 15}, {2, 21, 20, 14, 8}, {25, 19, 13, 7, 1},
			{18, 12, 6, 10, 24}, {11, 5, 4, 23, 17}};
		
		MagicSquare s3 = new MagicSquare(5, fiveby5matrix);
		System.out.println("Current Input Matrix");
		s3.printMatrix();
		s3.convertMartixToMagicMatrix();
		
		System.out
			.println("Square Matrix converted to Magic Square at the cost of " + s3.replacementcost);
	}
	
}
