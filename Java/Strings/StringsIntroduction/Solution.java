package Strings.StringsIntroduction;

import java.io.*;
import java.util.*;

public class Solution {
	
	static String convert(String str) {
		char[] ch = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			if(i==0 && ch[i] != ' ' || ch[i] != ' ' && ch[i-1] == ' ' ) {
				if(ch[i] >= 'a' && ch[i]<= 'z') {
					ch[i] = (char)(ch[i] - 'a' + 'A');
				}
			}
			else if(ch[i] >= 'A' && ch[i] <= 'Z') {
				ch[i] = (char)(ch[i] + 'a' - 'A');
			}
		}
		String st = new String(ch);
		return st;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		String b = scanner.next();
		
		int result = a.length() + b.length();
		System.out.println(result);
		
		if(a.compareTo(b) > 0) {
			System.out.println("Yes");
		}
		else if(a.compareTo(b) <= 0) {
			System.out.println("No");
		}
		
		System.out.println(convert(a) + " " + convert(b));
		
	}

}
