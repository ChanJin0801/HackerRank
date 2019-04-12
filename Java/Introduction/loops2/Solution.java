package Introduction.loops2;

import java.util.*;
import java.io.*;

public class Solution {
	
	static int getValue(int a, int b, int n) {
		
		int sum = a;
		for(int z=n;z>=0;z--) {
			sum = sum + (int)(Math.pow(2, z)) * b;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=0; i<=N; i++) {
			
			int a = sc.nextInt();
			int b = Integer.parseInt(sc.next());
			int n = Integer.parseInt(sc.next());
			
		for(int j=0; j<n; j++){
		                
		    System.out.print (getValue(a,b,j)+ " ");
		                
		            }
            System.out.println();
			
			
		}


	}

}
