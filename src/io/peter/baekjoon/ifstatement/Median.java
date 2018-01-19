package io.peter.baekjoon.ifstatement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Median {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer tokenizer = new StringTokenizer(sc.nextLine());
		
		int A = Integer.parseInt(tokenizer.nextToken());
		int B = Integer.parseInt(tokenizer.nextToken());
		int C = Integer.parseInt(tokenizer.nextToken());
		
		if(A <= B){
			if( B<= C)
				System.out.println(B);
			else if(A < C)
				System.out.println(C);
			else
				System.out.println(A);			
		} else {
			if( B > C)
				System.out.println(B);
			else if( A > C)
				System.out.println(C);
			else
				System.out.println(A);
		}
	}
	
	public static void sol2(){
		Scanner sc = new Scanner(System.in);
		StringTokenizer tokenizer = new StringTokenizer(sc.nextLine());
		
		int A = Integer.parseInt(tokenizer.nextToken());
		int B = Integer.parseInt(tokenizer.nextToken());
		int C = Integer.parseInt(tokenizer.nextToken());
		
		List<Integer> list = new ArrayList<>();
		list.add(A);
		list.add(B);
		list.add(C);
		
		Collections.sort(list);
		System.out.println(list.get(1));
	}
}
