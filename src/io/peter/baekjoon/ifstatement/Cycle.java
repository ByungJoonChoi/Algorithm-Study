package io.peter.baekjoon.ifstatement;

import java.util.Scanner;

public class Cycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int newN = N;
		int cycle = 0;
		do{
			if(newN < 10)
				newN *= 11;
			else
				newN = (newN % 10) * 10 + ( newN / 10 + newN % 10) % 10;
			cycle++;
		} while(N != newN);
		System.out.println(cycle);
		sc.close();
		
	}
}
