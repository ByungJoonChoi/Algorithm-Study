package io.peter.baekjoon.forloop;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println( (n * (n+1)) >> 1);
	}
}
