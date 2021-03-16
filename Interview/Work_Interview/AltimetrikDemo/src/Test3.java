import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Find the first N words with the highest frequency in an array of strings. The result needs to be
 * sorted by frequency.
 * 
 * For example:
 * 
 * An array of String:
 * 
 * Inputs:
 * 
 * {"Believe", "for", "good", "Believe", "for", "trust", "Believe", "forsake", "Believe", "Believe",
 * "in", "you", "youtube", "Google", "for", "learning", "virtual", "data"}
 * 
 * and the first 2 words with the highest frequency.
 *
 */

public class Test3
{
	
	public static void main(String[] args)
	{
		List<String> strlist = new ArrayList<>(
			Arrays.asList(
				"Believe",
				"for",
				"good",
				"Believe",
				"for",
				"trust",
				"Believe",
				"forsake",
				"Believe",
				"Believe",
				"in",
				"you",
				"youtube",
				"Google",
				"for",
				"learning",
				"virtual",
				"data"));
		
		HashMap<String, Integer> strfreq = new HashMap<>();
		strlist.stream().forEach(s -> {
			if (strfreq.containsKey(s))
			{
				strfreq.put(s, strfreq.get(s) + 1);
			}
			else
			{
				strfreq.put(s, 1);
			}
		});
		
		// strfreq.values().stream().sorted().forEach(s -> System.out.println(s+" - "));
		Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String, Integer>>()
			{
				@Override
				public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2)
				{
					Integer v1 = e1.getValue();
					Integer v2 = e2.getValue();
					return v2-v1;
				}
			};
		
		strfreq.entrySet().stream().sorted(valueComparator).forEach(
			(k) -> System.out.println(k.getKey() + " - " + k.getValue()));
		

	}
	
}
