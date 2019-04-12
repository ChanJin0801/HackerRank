package Strings.StringTokens;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String delims = " !,?_'0";
		
		StringTokenizer st = new StringTokenizer(s, delims);
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
