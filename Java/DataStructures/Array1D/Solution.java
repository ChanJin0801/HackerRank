package DataStructures.Array1D;

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
		
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}

	}

}
