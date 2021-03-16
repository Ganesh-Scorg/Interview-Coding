package com.basic;

import java.util.Map;
import java.util.TreeMap;

public class ParkingSpace {

	static int minParkingSpaces(int[][] parkingStartEndTimes) 
	{
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < parkingStartEndTimes.length; i++) 
		{
			if (map.containsKey(parkingStartEndTimes[i][0]))
			{
				map.put(parkingStartEndTimes[i][0], map.get(parkingStartEndTimes[i][0]) + 1);
			}
			else 
			{
				map.put(parkingStartEndTimes[i][0], 1);
			}
			
			if (map.containsKey(parkingStartEndTimes[i][1]))
			{
				map.put(parkingStartEndTimes[i][1], map.get(parkingStartEndTimes[i][1]) - 1);
			}
			else 
			{
				map.put(parkingStartEndTimes[i][1], -1);
			}
		}
		
		int minimumspcerequired = 0, allotedspacecount = 0;
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
		{
			allotedspacecount += entry.getValue(); 
			minimumspcerequired = Math.max(minimumspcerequired, allotedspacecount);
		}
		
		return minimumspcerequired;
	}

	public static void main(String[] args) {
		
		int [][] parkingStartEndTimes = {{35,45}, {0,20},{25,40}, {0,20}, {5,10},{30,35}};

		int result = minParkingSpaces(parkingStartEndTimes);
		
		System.out.println("Minimum Parking Spaces required = "+result);

	}

}
