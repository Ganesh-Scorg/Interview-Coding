import java.util.stream.IntStream;

public class Test {
	public static int solution(int[] data) {

		/*
		 * Create an array of diffs. If two or more values are equal, that is
		 * considered a period.
		 */
		int[] diffs = IntStream.range(0, data.length - 1).map(i -> data[i] - data[i + 1]).toArray();
		/*
		 * Now simply iterate over the diffs, collecting them into the largest
		 * periods and Once the boundaries of the largest period have been
		 * established, simply sum them. The summing process takes into account
		 * any sub periods.
		 */
		int d = diffs[0];
		int start = 0;
		int allPeriods = 0;
		for (int i = 1; i < diffs.length; i++) {
			if (diffs[i] != d) {
				if (i - start > 1) {
					int n = i - start;

					allPeriods += n * (n - 1) / 2;
				}
				start = i;
				d = diffs[start];
			}
		}
		if (start + 1 < diffs.length) {
			int n = diffs.length - start;
			allPeriods += n * (n - 1) / 2;
		}
		return allPeriods;
	}
	
	public static void main(String[] args) {
		int a[]={-1,1,3,3,3,2,3,2,1,0};
		System.out.println(solution(a));
	}
}
