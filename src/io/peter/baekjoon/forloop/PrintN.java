package io.peter.baekjoon.forloop;

import java.util.Scanner;

public class PrintN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		
		do{
			N = input.nextInt();
		} while(N > 100000 || N <= 0);
		
		for(int i=0 ; i<N ; i++)
			System.out.println(i+1);
		
		input.close();
	}
}
