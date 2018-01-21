package io.peter.baekjoon.array;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println(sentence.split(" ").length);
		sc.close();
	}
}
