package io.peter.baekjoon.forloop;

import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		do{ N = input.nextInt(); } while( !(1<= N && N <= 100));
		
		for(int i=0 ; i<N ; i++){
			for(int j=0 ; j<i+1 ;j++)
				System.out.print("*");
			System.out.println();
		}
		
		input.close();
	}
}