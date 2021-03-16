import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// C++ Code implementation for above problem 

// QItem for current location and distance 
// from source location 
class QItem {
	int row;
	int col;
	int dist;

	public QItem(int row, int col, int dist) {
		super();
		this.row = row;
		this.col = col;
		this.dist = dist;
	}

}

public class amazon {

	public static void main(String[] args) {
		
		
		int grid[][] = { { 1, 0, 0 }, { 1, 0, 0 }, { 1, 9, 1 }, };

		System.out.println(minDistance(grid));

	}

	public static int minDistance(int[][] grid) {
		QItem source = new QItem(0, 0, 0);

		// To keep track of visited QItems. Marking
		// blocked cells as visited.
		boolean visited[][] = new boolean[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (grid[i][j] == 1)
					visited[i][j] = true;
				else
					visited[i][j] = false;

				// Finding source
					
			}
		}
		
		source.row = 0;
		source.col = 0;

		// applying BFS on matrix cells starting from source
		Queue<QItem> q = new LinkedList<QItem>();
		q.add(source);
		visited[source.row][source.col] = true;
		while (!q.isEmpty()) {
			QItem p = q.peek();
			q.remove();

			// Destination found;
			if (grid[p.row][p.col] == 9)
				return p.dist;

			// moving up
			if (p.row - 1 >= 0 && visited[p.row - 1][p.col] == false) {
				q.add(new QItem(p.row - 1, p.col, p.dist + 1));
				visited[p.row - 1][p.col] = true;
			}

			// moving down
			if (p.row + 1 < 3 && visited[p.row + 1][p.col] == false) {
				q.add(new QItem(p.row + 1, p.col, p.dist + 1));
				visited[p.row + 1][p.col] = true;
			}

			// moving left
			if (p.col - 1 >= 0 && visited[p.row][p.col - 1] == false) {
				q.add(new QItem(p.row, p.col - 1, p.dist + 1));
				visited[p.row][p.col - 1] = true;
			}

			// moving right
			if (p.col + 1 < 3 && visited[p.row][p.col + 1] == false) {
				q.add(new QItem(p.row, p.col + 1, p.dist + 1));
				visited[p.row][p.col + 1] = true;
			}
		}
		return -1;
	}

	// Driver code

}
