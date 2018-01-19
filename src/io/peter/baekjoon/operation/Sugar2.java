package io.peter.baekjoon.operation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Sugar2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	      int N = input.nextInt();
	      int firstValue, secondValue;
	      int min=-1;
	      Set<Integer> min1 = new HashSet<Integer>();
	      for(int i=0;i<=N/2;i++){
	         firstValue=i;
	         secondValue=N-i;
	         if(firstValue%3==0 || firstValue%5==0){
	            if(secondValue%3==0 || secondValue%5==0){
	               //3,15
	               if(firstValue%5==0){
	                  if(secondValue%5==0){
	                     min=0;
	                     min+=firstValue/5;
	                     min+=secondValue/5;
	                     min1.add(min);
	                  }else if(secondValue%3==0){
	                     min=0;
	                     min+=firstValue/5;
	                     min+=secondValue/3;
	                     min1.add(min);
	                  }
	               }else if(firstValue%3==0){
	                  if(secondValue%5==0){
	                     min=0;
	                     min+=firstValue/3;
	                     min+=secondValue/5;
	                     min1.add(min);
	                  }else if(secondValue%3==0){
	                     min=0;
	                     min+=firstValue/3;
	                     min+=secondValue/3;
	                     min1.add(min);
	                  }
	               }
	            }
	         }
	      }
	      List it = new ArrayList<>(min1);
	      Collections.sort(it);
	      if(min != -1)
	         System.out.println(it.get(0));
	      else
	         System.out.println(-1);
	}
}
