package DataStructures.Array1DPart2;

import java.util.Scanner;

public class Solution {
	
	public static boolean canWin(int[] array, int leap, int i) {
		if(i<0 || array[i]==1) {
			return false;
		}
		else if(i+1 > array.length || i+leap > array.length) {
			return true;
		}
		
		array[i]=1;
		
		return canWin(array, leap, i+1)||
			   canWin(array, leap, i-1)||
			   canWin(array, leap, i+leap);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		while(N-->0) {
			int n = scanner.nextInt();
			int leap = scanner.nextInt();
			
			int[] game = new int[n];
			for(int i=0; i<n; i++) {
				game[i] = scanner.nextInt();
			}
			
			System.out.println(canWin(game, leap, 0) ? "Yes":"No");
			
		}
		
		

	}

}
