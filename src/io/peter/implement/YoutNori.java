package io.peter.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 윷놀이 
public class YoutNori {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] results = {"E", "A", "B", "C", "D"};
		for(int i=0 ; i<3 ; i++){
			int countZero=0;
			for(String str : br.readLine().trim().split(" ")){
				if(str.equals("0"))
					countZero++;
			}
			System.out.println(results[countZero]);
		}
	}
}
