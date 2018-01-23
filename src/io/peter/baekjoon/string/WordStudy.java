package io.peter.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine().toLowerCase();
		int[] countArr = new int[26];
		
		for(int i=0 ; i<word.length() ; i++){
			int index = word.charAt(i) - 'a';
			countArr[index]++;
		}
		int maxIndex = 0;
		int maxCount = 0;
		boolean isMany = false;
		for(int i=0 ; i<countArr.length; i++){
			if(countArr[i] > maxCount){
				maxCount = countArr[i];
				maxIndex = i;
				isMany = false;
			} else if(countArr[i] == maxCount){
				isMany = true;
			}
		}
		System.out.println( isMany ? "?" : (char)('A' + maxIndex));		
	}
}
