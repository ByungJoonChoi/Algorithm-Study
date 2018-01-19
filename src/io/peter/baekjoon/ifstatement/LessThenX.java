package io.peter.baekjoon.ifstatement;

import java.util.ArrayList;
import java.util.Scanner;

public class LessThenX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N_X = sc.nextLine();
		String sequence = sc.nextLine();
		
		int X = Integer.parseInt(N_X.split(" ")[1]);
		
		ArrayList<String> list = new ArrayList<>();
		for(String token : sequence.split(" ")){
			if(Integer.parseInt(token) < X)
				list.add(token);
		}
		
		System.out.println(String.join(" ", list));
	}
}
