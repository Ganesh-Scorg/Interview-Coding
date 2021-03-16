// Efficient Java program to remove 
// duplicates from input.txt and 
// save output to output.txt 

import java.io.*; 
import java.util.HashSet; 

public class FileOperation 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		// PrintWriter object for output.txt 
		PrintWriter pw = new PrintWriter("output.txt"); 
		
		// BufferedReader object for input.txt 
		BufferedReader br = new BufferedReader(new FileReader("DebitAddRq_MerchandisePurchase.pfl"));
					
		String line = br.readLine();
		
		
		
		// set store unique values 
		HashSet<String> hs = new HashSet<String>(); 
		
		// loop for each line of input.txt 
		while(line != null) 
		{ 
			String[] temp =line.split(":");
			String field = temp[0].trim();
			
			// write only if not 
			// present in hashset 
			if(!hs.add(field)) 
				pw.println(field); 
			
			line = br.readLine(); 
			
		} 
		
		pw.flush(); 
		
		// closing resources 
		br.close(); 
		pw.close(); 
		
		System.out.println("File operation performed successfully"); 
	} 
} 
