
public class MAtrix01 {

	public static int[][] updateMatrix(int[][] matrix) {

		int[][] temp = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0)
					temp[i][j] = 0;
				else if (matrix[i][j] == 1) {
					int column = 0;
					while (column < matrix[i].length && matrix[i][column] != 1) {
						column++;
					}
					int row = 0;
					while (row < matrix.length && matrix[row][j] != 1) {
						row++;
					}
					if (row > column)
						temp[i][j] = column;
					else
						temp[i][j] = row;

				}

			}
		}

		return temp;

	}
	



	public static void main(String[] args) {

		int[][] matrix = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		
		int[][] temp =updateMatrix(matrix);
		
		for (int i = 0; i < temp.length; i++) { 
            for (int j = 0; j < temp[i].length; j++) { 
                System.out.print(temp[i][j] + " "); 
            } 
  
            System.out.println(); 
        } 
		

	}

}
