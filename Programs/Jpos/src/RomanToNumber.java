
// Program to convert Roman Numerals to Numbers 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class RomanToNumber {

	static HashMap<Integer, String> map = new HashMap<>();

	static int value(char r) {
		if (r == 'I')
			return 1;
		if (r == 'V')
			return 5;
		if (r == 'X')
			return 10;
		if (r == 'L')
			return 50;
		if (r == 'C')
			return 100;
		if (r == 'D')
			return 500;
		if (r == 'M')
			return 1000;
		return -1;
	}

	static int romanToDecimal(String str) {
		int res = 0;

		for (int i = 0; i < str.length(); i++) {
			int s1 = value(str.charAt(i));

			if (i + 1 < str.length()) {
				int s2 = value(str.charAt(i + 1));

				if (s1 >= s2) {
					res = res + s1;
				} else {
					res = res + s2 - s1;
					i++;
				}
			} else {
				res = res + s1;
				i++;
			}
		}

		return res;
	}

	public static List<String> sortRoman(List<String> names) {

		List<String> result = new ArrayList<String>();

		for (String temp : names) {
			String name_str = temp.substring(0, temp.indexOf(" "));
			String romain_str = temp.substring(temp.indexOf(" ") + 1, temp.length());

			int decimal_int = romanToDecimal(romain_str.trim());
			map.put(decimal_int, romain_str);
			String temp1 = name_str.concat(" ").concat(String.valueOf(decimal_int));
			result.add(temp1);
		}

		// System.out.println(result);

		/*
		 * Collections.sort(result, new Comparator<String>() {
		 * 
		 * @Override public int compare(String o1, String o2) {
		 * 
		 * String res = o1.substring(0, o1.indexOf(" ")); String res1 =
		 * o1.substring(o1.indexOf(" ")+1, o1.length());
		 * 
		 * int result = res.compareTo(res1); if (result == 0) { result =
		 * res1.compareTo(res1); } return result;
		 * 
		 * }
		 * 
		 * 
		 * });
		 */

		Collections.sort(result, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return extract(o1) - extract(o2);

			}

			private int extract(String o1) {

				return Integer.parseInt(o1.substring(o1.indexOf(" ") + 1), o1.length());
			}

		});

		Collections.sort(result, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o1.compareTo(o2);

			}

		});

		List<String> resultant = new ArrayList<>();

		// for (int j = 0; j < result.size(); j++) {
		for (String res : result) {
			String[] temp = res.split(" ");
			resultant.add(temp[0].concat(" ").concat(map.get(Integer.parseInt(temp[1]))));
		}

		return resultant;

	}

	// Driver method
	public static void main(String args[]) {
		RomanToNumber ob = new RomanToNumber();

		// Considering inputs given are valid
		List<String> test = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		test.add("David IX");
		test.add("Mary XV");
		test.add("Mary XII");

		test.add("Mary XX");
		test.add("Steven XI");

		result = sortRoman(test);
		System.out.println(result);

		// System.out.println("Integer form of Roman Numeral" + " is " +
		// ob.romanToDecimal(str));
	}
}
