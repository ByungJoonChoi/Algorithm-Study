package io.peter.baekjoon.forloop;

import java.util.Scanner;

public class Sum2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		String numbers = input.next();
		input.close();
		
		int sum = 0;
		for(String token : numbers.split("")){
			sum += Integer.parseInt(token);
		}
		System.out.println(sum);
	}
}
