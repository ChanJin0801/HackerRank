package DataStructures.Array2D;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
	
	static int R = 6;
	static int C = 6;
	static int findMaxSum(int[][] mat) {
		if(R<3 ||C<3) {
			return -1;
		}
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i<R-2; i++) {
			for(int j=0; j<C-2; j++) {
				int sum = mat[i][j] + mat[i][j+1] + mat[i][j+2] +
					  mat[i+1][j+1] + mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2];
				maxSum = Math.max(sum, maxSum);
			}
		}
		
		return maxSum;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = findMaxSum(arr);
        if(result == -1){
            System.out.println("Not possible");
        }
        else{
            System.out.println(result);
        }

}
}
