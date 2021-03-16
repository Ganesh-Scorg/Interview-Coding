package com.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringSharingSubString {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

    	//char[] s1chars = s1.con
    	char[] s2chars = s2.toCharArray();
    	
    	//List<Character> s1list = Arrays.asList(s1.);
    	for(int i=0;i<s2.length();i++)
    	{
    		//for(int j=0;j<s2.length();j++)
    		//{
        		//if(s1chars[i]==s2chars[j])
    			if(s1.indexOf(s2chars[i])!=-1)
        		{
        			return "Yes";
        		}
        	//}
    	}
    	return "No";
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
