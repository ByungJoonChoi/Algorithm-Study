package io.peter.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountNumbers {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine().trim());
		int B = Integer.parseInt(br.readLine().trim());
		int C = Integer.parseInt(br.readLine().trim());
		
		String str = String.valueOf(A*B*C);
		int[] count = new int[10];
		
		for(int i=0 ; i<str.length(); i++)
			count[Integer.parseInt(str.charAt(i)+"")]++;
		
		for(int i:count)
			System.out.println(i);
	}
}
