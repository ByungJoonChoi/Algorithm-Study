package io.peter.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountWords {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String sentence = bufferedReader.readLine();
		System.out.println(new StringTokenizer(sentence).countTokens());
		
//		String sentence = bufferedReader.readLine().trim();
//		if(sentence.equals(""))
//			System.out.println(0);
//		else
//			System.our.println(sentence.split(" ").length);
	}
}

/* 공백을 하나 입력한 상태에서 trim을 하면 ""이 남음. 따라서 이 경우 0을 리턴하도록 해야 함. 
 * (StringTokenizer를 이용하는 경우, 위 경우는 자연스럽게 해결해줌)
 */

 