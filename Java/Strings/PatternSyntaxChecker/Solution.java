package Strings.PatternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		while(N>0) {
			String pattern = scanner.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			}
			catch(PatternSyntaxException e) {
				System.out.println("Invalid");
			}
			N--;

		}
		

	}

}
