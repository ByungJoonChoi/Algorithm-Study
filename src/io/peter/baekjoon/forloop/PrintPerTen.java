package io.peter.baekjoon.forloop;

import java.util.Scanner;

public class PrintPerTen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int n = input.length();
		
		for(int i=1 ; i<= n/10 ; i++){
			System.out.println(input.substring(10*(i-1), 10*i));
		}
		
		if(n % 10 != 0)
			System.out.println(input.substring((n/10) * 10, n));		
	}
}
