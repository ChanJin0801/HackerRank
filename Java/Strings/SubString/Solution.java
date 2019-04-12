package Strings.SubString;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(s.substring(a, b));

	}

}
