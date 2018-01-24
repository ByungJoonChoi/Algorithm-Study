package io.peter.baekjoon.findrules;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fraction {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int n=1;
		while( (n*(n+1))/2 < X)
			n++;
		int a = X - (n * (n-1))/2;
		int b = (n+1) - a;
		
		if(n % 2 == 1){ 
			System.out.println(b+"/"+a);
		} else { 
			System.out.println(a+"/"+b);
		}
	}
}
