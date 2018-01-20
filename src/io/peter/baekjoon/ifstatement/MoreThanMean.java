package io.peter.baekjoon.ifstatement;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MoreThanMean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = Integer.parseInt(sc.nextLine());
		double[] rates = new double[C];

		for(int i=0; i<C; i++){
			StringTokenizer tokenizer = new StringTokenizer(sc.nextLine());
			int N = Integer.parseInt(tokenizer.nextToken());
			int[] scores = new int[N];
			int index = 0; 
			double mean = 0;
			while(tokenizer.hasMoreTokens()){
				scores[index] = Integer.parseInt(tokenizer.nextToken());
				mean += scores[index++];
			}
			mean = mean/(double)N;
			
			int count = 0; // 평균을 넘는 학생 수.
			for(int score : scores){
				if(score > mean) count++;
			}
			
			rates[i] = Math.round(count/(double)N * 100000) / (double)1000;
		}
		
		for(double rate : rates)
			System.out.printf("%.3f%%\n", rate);
		
		sc.close();
	}
}
