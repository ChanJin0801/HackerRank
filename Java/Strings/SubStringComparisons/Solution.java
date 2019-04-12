package Strings.SubStringComparisons;

import java.util.Scanner;

public class Solution {
	
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = " ";
		String largest = " ";
		
		for(int i=0; i<s.length()-k+1; i++) {
			String subString = s.substring(i, i+k);
			if(i==0) {
				smallest = subString;
				largest = subString;
			}
			else if(subString.compareTo(smallest) < 0) {
				smallest = subString;
			}
			else if(subString.compareTo(largest) > 0) {
				largest = subString;
			}
			
		}
		return smallest + "\n" + largest;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int N = scanner.nextInt();
		
		System.out.println(getSmallestAndLargest(s, N));

	}

}
