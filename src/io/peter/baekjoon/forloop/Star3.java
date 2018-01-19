package io.peter.baekjoon.forloop;

import java.util.Scanner;

public class Star3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		do{ N = input.nextInt(); } while( !(1<= N && N <= 100));
		
		for(int n=N ; n>0 ; n--){
			for(int i=0 ; i<n ; i++)
				System.out.print("*");
			System.out.println();
		}
		input.close();
	}
}
