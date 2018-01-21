package io.peter.baekjoon.function;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SelfNumber {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		for(int i=1 ; i<=10000 ;i++)
			numbers.add(i);
		
		HashSet<Integer> noSelfnumbers = new HashSet<Integer>();
		for(int i=1 ; i<=10000 ;i++)
			noSelfnumbers.add(d(i));
		
		numbers.removeAll(noSelfnumbers);
		
		ArrayList<Integer> selfNumberList = new ArrayList<>(numbers);
		Collections.sort(selfNumberList);
		
		for(int selfNumber : selfNumberList)
			System.out.println(selfNumber);
		
	}
	
	public static int d(int n){
		int sum = n;
		while(n >= 10){
			sum += n % 10;
			n = n / 10;
		}
		sum += n;
		return sum;
	}
}
