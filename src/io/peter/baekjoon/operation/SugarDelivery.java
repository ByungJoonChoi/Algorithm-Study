package io.peter.baekjoon.operation;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * <문제>
 * 
 * 상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 
 * 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 
 * 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.
 * 상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 
 * 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 
 * 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.
 * 
 * 상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 
 * 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
 * 
 * [입력]
 * 첫째 줄에 N이 주어짐 (3 <= N <= 5000)
 * 
 * [출력]
 * 상근이가 배달하는 봉지의 최소 개수 출력. 만약 정확하게 N킬로그램을 만들 수 없다면 -1 출력.
 * 
 */

/*
 * <해석>
 * 3x+5y=N 를 만족하는 음이아닌 정수 x,y에 대하여 x+y의 최솟값을 구하시오.
 * 
 * 1) 해가 존재하는 지 파악 -> 5y <= N를 만족하는 동안 y에 0부터 순차적으로 대입해서 계산한 x값이 음이아닌 정수인지 확인. 
 * 2-1) 해가 존재하지 않는 경우 -1 출력
 * 2-2) 해가 존재하는 경우 x+y들을 비교해서 가장 작은 값 출력 
 * 
 */

public class SugarDelivery {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		
		ArrayList<Integer> y_List = new ArrayList<>();
		
		for(int y = 0 ; 5*y <= N ; y++){
			if((N - 5*y) % 3 == 0){
				y_List.add(y);
			}
		}
		
		if(y_List.size() == 0){
			System.out.println(-1);
			
		} else {
			int y = y_List.get(y_List.size()-1);
			int x = (N-5*y) / 3 ;
			System.out.println(x+y);
		}
		
		input.close();
	}
}
