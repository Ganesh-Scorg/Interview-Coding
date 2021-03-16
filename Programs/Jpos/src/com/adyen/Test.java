package com.adyen;

/*----------------------------------------------------------------------------*\
 *                                                                            *
 * Postilion                                                                  *
 * 3500 Lenox Road, Suite 200                                                 *
 * Atlanta, GA 30326 U.S.A                                                    *
 * T +1 404.923.3500 F +1 404.923.6727                                        *
 * TOLL FREE +1 888.457.2237                                                  *
 *                                                                            *
 * Copyright (C) 2007                                                         *
 * This software may not be copied or distributed in any form without the     *
 * written permission of Postilion.                                           *
 *                                                                            *
\*----------------------------------------------------------------------------*/
import java.util.ArrayList;

public class Test {
	public int solution(int[] A, int Y) {
		ArrayList<Integer> nailCount = new ArrayList<Integer>();
		ArrayList<Integer> sumNailCount = new ArrayList<Integer>();

		// calculate number of nails of each type
		// Input = {1, 1, 3, 3, 3, 4, 5, 5, 5, 5};
		// uniqueNails [1=2, 3=3, 4=1, 5=4]

		int count = 1;
		for (int i = 0; i < A.length;) {
			int temp = A[i];
			i++;

			while (i < A.length && A[i] == temp) {
				count++;
				i++;
			}
			nailCount.add(count);
			count = 1;
		}

		// covert uniqueNails map to array
		// uniqueNails [1=2, 3=4, 4=1, 5=4]
		// nailCount [2, 4, 1, 4]

		// calculate number nails of higher lengths
		// nailCount [2, 4, 1, 4]
		// sumNailCount [9, 5, 4, 0]

		for (int i = 0; i < nailCount.size(); i++) {
			int sum = 0;
			for (int j = i + 1; j < nailCount.size(); j++) {
				sum = nailCount.get(j) + sum;
			}
			sumNailCount.add(sum);
		}

		int max = 0;
		for (int i = 0; i < nailCount.size(); i++) {
			int hammerNail = nailCount.get(i) + Y;

			if (hammerNail <= sumNailCount.get(i) && hammerNail > max) {
				max = hammerNail;
			}
			else if (hammerNail >= sumNailCount.get(i) && nailCount.get(i) + sumNailCount.get(i)>max)
			{
				max = nailCount.get(i) + sumNailCount.get(i);
			}
		}
		return max;
	}

	public static int solution1(int[] A, int y) {
		int max = 0;
		for (int i = 0; i < A.length;) {

			int count = 1;
			int temp = A[i];
			i++;

			while (i < A.length && A[i] == temp) {
				count++;
				i++;
			}

			int remaining = A.length - i;

			if (remaining != 0 && remaining < y && count + (y - remaining) > max) {
				max = count + (y - remaining);
			}

			else if (remaining >= y && (count + y) > max)
				max = count + y;

			else if (remaining == 0 && max < count)
				return count;

		}
		return max;
	}

	public static void main(String[] args) {
		int A[] = new int[] { 1,2,3,4};
		Test solution = new Test();
		System.out.println(solution.solution1(A, 5));
	}
}
