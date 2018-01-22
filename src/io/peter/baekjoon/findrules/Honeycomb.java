package io.peter.baekjoon.findrules;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Honeycomb {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if(N==1){
			System.out.println(1);
		}else{
			int cntRoom = 2;
			while( 3 * (cntRoom-2) * (cntRoom-1) + 2 > N || 3 * (cntRoom) * (cntRoom-1) + 1 < N)
				cntRoom++;
			System.out.println(cntRoom);
		}
	}
}
