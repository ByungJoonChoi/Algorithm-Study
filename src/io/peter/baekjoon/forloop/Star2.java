package io.peter.baekjoon.forloop;

import java.util.Scanner;

public class Star2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		do{ N = input.nextInt(); } while( !(1<= N && N <= 100));
		
		for(int i=0 ; i<N ; i++){
			// i+1번째 줄
			for(int j=0 ; j<N-i-1 ; j++)
				System.out.print(" ");
			for(int k=0 ; k<i+1 ;k++)
				System.out.print("*");
			System.out.println();
		}
		
		input.close();
	}
}