package io.peter.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		int[] position = new int[26];
		for(int i=0 ; i<position.length;i++)
			position[i] = -1;
		
		for(int i=0 ; i<S.length() ; i++){
			int ch = S.charAt(i) - 'a';
			if(position[ch] == -1)
				position[ch] = i;
		}
		for(int p : position)
			System.out.print(p+" ");
	}
}
