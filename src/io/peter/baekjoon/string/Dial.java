package io.peter.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String letters = br.readLine();
		int[] times = {3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10};
		int totalTime = 0;
		for(int i=0; i<letters.length() ; i++){
			totalTime += times[letters.charAt(i) - 'A'];
		}
		System.out.println(totalTime);
	}
}
