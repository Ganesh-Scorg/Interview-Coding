public class Mindtickle {

	public static void main(String[] args) {

		String a = "abc__"; //ad
		String b = "a";  //ad

		System.out.println(check(a, b));

	}

	private static boolean check(String a, String b) {

		for (int i = a.length() - 1, j = b.length() - 1; i >= 0 && j >= 0; i--, j--) {
			int count1 = 0;
			int count2 = 0;

			while (a.charAt(i) == '_' || count1 > 0) {
				if (a.charAt(i) == '_') {
					count1++;
					i--;
				} else {
					count1--;
					i--;
				}
			}

			while (b.charAt(j) == '_' || count2 > 0) {
				if (b.charAt(j) == '_') {
					count2++;
					j--;
				} else {
					count2--;
					j--;
				}
			}

			if (!(a.charAt(i) == b.charAt(j))) {
				return false;
			}
		}
		return true;
	}
}
