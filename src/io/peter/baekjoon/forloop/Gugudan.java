package io.peter.baekjoon.forloop;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N;
		do{
			N = input.nextInt();
		} while( N < 1 || N > 9);
		
		for(int i=1 ; i<10 ; i++)
			System.out.println(N + " * " + i + " = " + N*i);
		
		input.close();
	}
}