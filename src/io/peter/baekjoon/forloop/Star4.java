package io.peter.baekjoon.forloop;

import java.util.Scanner;

public class Star4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		do{ N = input.nextInt(); } while( !(1<= N && N <= 100));
		
		for(int n=N ; n>0 ; n--){
			for(int i=0 ; i<N-n ; i++)
				System.out.print(" ");
			for(int j=0 ; j<n ; j++)
				System.out.print("*");
			System.out.println();
		}
		input.close();
	}
}
