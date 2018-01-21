package io.peter.baekjoon.function;

import java.util.Scanner;

public class Hansu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if( N >= 100){
			int count = 99;
			for(int k=100 ; k<=N ;k++){
				if(k == 1000)
					break;
				if( ((k/10) % 10) - (k / 100)  == (k % 10) - ((k / 10) % 10))
					count++;
			}
			N = count;
		}
		System.out.println(N);
		sc.close();
	}
}
