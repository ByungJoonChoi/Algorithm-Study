package io.peter.baekjoon.forloop;

import java.util.Scanner;

public class PrintRevertN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		
		do{
			N = input.nextInt();
		} while(N > 100000 || N <= 0);
		
		for(int i=N ; i>0 ; i--)
			System.out.println(i);
		
		input.close();
	}
}
