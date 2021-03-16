package com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/***
 * Harold is a kidnapper who wrote a ransom note, but now he is worried it will
 * be traced back to him through his handwriting. He found a magazine and wants
 * to know if he can cut out whole words from it and use them to create an
 * untraceable replica of his ransom note. The words in his note are
 * case-sensitive and he must use only whole words available in the magazine. He
 * cannot use substrings or concatenation to create the words he needs.
 * 
 * Given the words in the magazine and the words in the ransom note, print Yes
 * if he can replicate his ransom note exactly using whole words from the
 * magazine; otherwise, print No.
 * 
 * For example, the note is "Attack at dawn". The magazine contains only "attack
 * at dawn". The magazine has all the right words, but there's a case mismatch.
 * The answer is .
 * 
 * Function Description
 * 
 * Complete the checkMagazine function in the editor below. It must print if the
 * note can be formed using the magazine, or .
 * 
 * checkMagazine has the following parameters:
 * 
 * magazine: an array of strings, each a word in the magazine note: an array of
 * strings, each a word in the ransom note Input Format
 * 
 * The first line contains two space-separated integers, and , the numbers of
 * words in the and the .. The second line contains space-separated strings,
 * each . The third line contains space-separated strings, each .
 * 
 * Constraints
 * 
 * . Each word consists of English alphabetic letters (i.e., to and to ). Output
 * Format
 * 
 * Print Yes if he can use the magazine to create an untraceable replica of his
 * ransom note. Otherwise, print No.
 * 
 * @author Ganesh Shinde
 *
 */
public class RansomNoteFromMagzine {

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {

		HashMap<String, Integer> htmagzine = new HashMap<>();

		for (int i = 0; i < magazine.length; i++) {
			if (htmagzine.containsKey(magazine[i])) {
				htmagzine.put(magazine[i], htmagzine.get(magazine[i]) + 1);
			} else {
				htmagzine.put(magazine[i], 1);
			}
		}

		for (int i = 0; i < note.length; i++) {
			if (htmagzine.containsKey(note[i]) && htmagzine.get(note[i]) >= 1) {
				htmagzine.put(note[i], htmagzine.get(note[i]) - 1);
			} else {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}
}
