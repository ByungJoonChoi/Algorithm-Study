package io.peter.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sangsu {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(new StringBuffer(tokenizer.nextToken()).reverse().toString());
		int B = Integer.parseInt(new StringBuffer(tokenizer.nextToken()).reverse().toString());
		System.out.println(A > B ? A : B);
	}
}
