package DataStructures.HashSet;

import java.text.*;
import java.math.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		String[] pair_left = new String[N];
		String[] pair_right = new String[N];
		
		for(int i=0; i<N; i++) {
			pair_left[i] = scanner.next();
			pair_right[i] = scanner.next();
		}

		HashSet<String> set = new HashSet<>();
		for(int i=0; i<N; i++) {
			set.add(pair_left[i] + " " + pair_right[i]);
			System.out.println(set.size());
		}
		
	}

}
