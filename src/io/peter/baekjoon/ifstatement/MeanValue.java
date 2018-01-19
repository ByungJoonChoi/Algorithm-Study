package io.peter.baekjoon.ifstatement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MeanValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		ArrayList<Integer> scoreList = new ArrayList<>();
		
		for(String token :sc.nextLine().split(" ")){
			scoreList.add(Integer.parseInt(token));
		}
		
		int M = Collections.max(scoreList);
		int sum = 0;
		for(int score : scoreList){
			sum += score;
		}
		
		double total = 100 * sum / (float)(M*N);
		System.out.println(total);
	}
}
