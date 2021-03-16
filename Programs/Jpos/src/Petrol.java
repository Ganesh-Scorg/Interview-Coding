import java.util.ArrayList;
import java.util.List;

//Java program to find circular tour for a truck 

public class Petrol {
	// A petrol pump has petrol and distance to next petrol pump
	static class petrolPump {
		int petrol;
		int distance;

		// constructor
		public petrolPump(int petrol, int distance) {
			this.petrol = petrol;
			this.distance = distance;
		}
	}

	public static int optimalPoint(List<Integer> magic, List<Integer> dist) {
		
		int start = 0;
		int end = 1;

		int curr_magic = magic.get(start) - dist.get(start);

		while (end != start || curr_magic < 0) {

			while (curr_magic < 0 && start != end) {

				curr_magic -= magic.get(start) - dist.get(start);
				start = (start + 1) % magic.size();

				if (start == 0)
					return -1;
			}
			
			curr_magic += magic.get(end) - dist.get(end);

			end = (end + 1) % magic.size();
		}

		return start;
	}

	// The function returns starting point if there is a possible solution,
	// otherwise returns -1
	static int printTour(petrolPump arr[], int n) {
		int start = 0;
		int end = 1;
		int magic1 = arr[start].petrol - arr[start].distance;

		// If current amount of petrol in truck becomes less than 0, then
		// remove the starting petrol pump from tour
		while (end != start || magic1 < 0) {

			// If current amount of petrol in truck becomes less than 0, then
			// remove the starting petrol pump from tour
			while (magic1 < 0 && start != end) {
				// Remove starting petrol pump. Change start
				magic1 -= arr[start].petrol - arr[start].distance;
				start = (start + 1) % n;

				// If 0 is being considered as start again, then there is no
				// possible solution
				if (start == 0)
					return -1;
			}
			// Add a petrol pump to current tour
			magic1 += arr[end].petrol - arr[end].distance;

			end = (end + 1) % n;
		}

		// Return starting point
		return start;
	}

	// Driver program to test above functions
	public static void main(String[] args) {

		petrolPump[] arr = { new petrolPump(6, 4), new petrolPump(3, 6), new petrolPump(7, 3) };

		ArrayList<Integer> magic = new ArrayList<>();
		ArrayList<Integer> dist = new ArrayList<>();

		magic.add(2);
		magic.add(4);
		magic.add(5);
		magic.add(2);

		dist.add(4);
		dist.add(3);
		dist.add(1);
		dist.add(3);

		int result = optimalPoint(magic, dist);

		int start = printTour(arr, arr.length);

		System.out.println(result == -1 ? "No Solution" : "Start = " + result);

	}

}
// This code is contributed by Sumit Ghosh
