package io.peter.baekjoon.operation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		addtion_2();
	}
	
	public static void multiplier() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(Character.getNumericValue(str.charAt(0)) * Character.getNumericValue(str.charAt(2)));
	}
	
	public static void mixed() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] token = str.split(" ");
		int A = Integer.parseInt(token[0]);
		int B = Integer.parseInt(token[1]);
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
	}
	
	public static void modulo_distributiveLaw() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] token = str.split(" ");
		int A = Integer.parseInt(token[0]);
		int B = Integer.parseInt(token[1]);
		int C = Integer.parseInt(token[2]);
		System.out.println((A+B)%C);
		System.out.println((A%C+B%C)%C);
		System.out.println((A*B)%C);
		System.out.println((A%C*B%C)%C);
	}
	
	public static void addtion_2(){
		Scanner input = new Scanner(System.in);
		int A = Integer.parseInt(input.nextLine());
		int B = Integer.parseInt(input.nextLine());
		System.out.println(A+B);
		
		input.close();
	}
}
