package io.peter.baekjoon.forloop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Year2007 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] token = str.split(" ");
		int x = Integer.parseInt(token[0]);
		int y = Integer.parseInt(token[1]);
		
		String[] DayOfTheWeek = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int totalDays = 0;
		
		for(int i=0 ; i<x-1 ;i++)
			totalDays += monthDays[i];
		
		System.out.println(DayOfTheWeek[(totalDays+y-1) % 7]);
	}
}
