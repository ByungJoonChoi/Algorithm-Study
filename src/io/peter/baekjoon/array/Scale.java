package io.peter.baekjoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scale {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tokens = br.readLine().trim().split(" ");
		
		if(tokens[0].equals("1")){
			int num = 2; 
			for(int i=1 ; i<tokens.length ;i++){
				if(!tokens[i].equals(num+"")){
					System.out.println("mixed");
					return;
				}
				num++;
			}
			System.out.println("ascending");
		} else if(tokens[0].equals("8")){
			int num = 7; 
			for(int i=1 ; i<tokens.length ;i++){
				if(!tokens[i].equals(num+"")){
					System.out.println("mixed");
					return;
				}
				num--;
			}
			System.out.println("descending");
			
		} else {
			System.out.println("mixed");	
		}
	}
}
