
public class StringCompressor {
	
	static String getComprssedString(String str)
	{
		if(str == null || str.isEmpty())
		{
			return str;
		}
		
		char prev = str.charAt(0);
		
		int freq = 1;
		
		StringBuilder result = new StringBuilder();
		
		for(int index = 1; index <str.length();index++)
		{
			if(prev == str.charAt(index))
			{
				freq++;
			}
			else
			{
				result.append(prev).append(freq);
				freq = 1;
				prev = str.charAt(index);
			}
		}
		
		result.append(prev).append(freq);
		
		if(result.length() >= str.length())
		{
			result = new StringBuilder(str);
		}
		
		return result.toString();
	}

	public static void main(String[] args) {
		
		String resultstr = getComprssedString(null);
		
		System.out.println("Compressed String = "+resultstr);
		
		resultstr = getComprssedString("");
		
		System.out.println("Compressed String = "+resultstr);
		
		
		String inputstr1 = "aaabcccddddeeaaa";
		
		resultstr = getComprssedString(inputstr1);
		
		//Expected result = a3b1c3d4e2a3
		System.out.println("Compressed String = "+resultstr);
		
		
		String inputstr2 = "abc";
		
		resultstr = getComprssedString(inputstr2);
		
		System.out.println("Compressed String = "+resultstr);
		
		
		String inputstr3 = "aaaaaaaaaac";
		
		resultstr = getComprssedString(inputstr3);
		
		System.out.println("Compressed String = "+resultstr);
		
		String inputstr4 = "aaaaaaaaaacbbbbbbbbbbbbb";
		
		resultstr = getComprssedString(inputstr4);
		
		System.out.println("Compressed String = "+resultstr);
		
		String inputstr5 = "x";
		
		resultstr = getComprssedString(inputstr5);
		
		System.out.println("Compressed String = "+resultstr);
		
		String inputstr6 = "aa";
		
		resultstr = getComprssedString(inputstr6);
		
		System.out.println("Compressed String = "+resultstr);
		
		String inputstr7 = "\n\n\n";
		
		resultstr = getComprssedString(inputstr7);
		
		System.out.println("Compressed String = "+resultstr);


	}

}
