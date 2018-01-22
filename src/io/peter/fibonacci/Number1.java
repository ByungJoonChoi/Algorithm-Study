package io.peter.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(a(n));
	}
	
	public static int a(int n){
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else
			return a(n-1) + a(n-2);
	}
}
