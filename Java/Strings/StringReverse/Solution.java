package Strings.StringReverse;

import java.io.*;
import java.util.*;

public class Solution {
	
	public static boolean isPalindrome (String text){
		String clean = text.replaceAll("\\s+", "").toLowerCase();
		int length = clean.length();
		int forward = 0;
		int backward = length-1;
		
		while(backward>0) {
			char forwardChar = clean.charAt(forward++);
			char backwardChar = clean.charAt(backward--);
			if(forwardChar != backwardChar)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		boolean result = isPalindrome(s);
		
		System.out.println(result);
	}

}
