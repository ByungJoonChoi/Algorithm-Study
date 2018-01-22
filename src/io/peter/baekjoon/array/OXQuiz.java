package io.peter.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXQuiz {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numTestCase = Integer.parseInt(br.readLine());
		for(int i=0 ; i<numTestCase ; i++){
			String str = br.readLine();
			int[] scores = new int[str.length()];
			for(int j=0 ; j<str.length(); j++){
				char ch = str.charAt(j);
				if(ch == 'O'){ 
					if(j!=0)
						scores[j] = scores[j-1] + 1;
					else
						scores[j] = 1;
				} else{
					scores[j] = 0;
				}
			}
			int sum = 0;
			for(int score : scores)
				sum += score;
			System.out.println(sum);
		}
	}
}
