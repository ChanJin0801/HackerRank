package DataStructures.SubArray;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int count = 0;
		for(int i=0; i<N; i++) {
			int sum = 0;
			for(int j=i; j<N; j++) {
				sum = sum + arr[j];
				if(sum<0)
					count++;
			}
		}
		System.out.println(count);
		
	}

}
