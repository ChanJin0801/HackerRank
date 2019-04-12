package DataStructures.BitSet;

import java.util.BitSet;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		BitSet b1 = new BitSet(N);
		BitSet b2 = new BitSet(N);
		
		while(M-->0) {
			String str = scanner.next();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			switch(str) {
			case "AND":
				if(a==1)
					b1.and(b2);
				else
					b2.and(b1);
				break;
			case "SET":
				if(a==1)
					b1.set(b);
				else
					b2.set(b);
				break;
			case "FLIP":
				if(a==1)
					b1.flip(b);
				else
					b2.flip(b);
				break;
			case "OR":
				if(a==1)
					b1.or(b2);
				else
					b2.or(b1);
				break;
				
				
			}
			System.out.println(b1.cardinality() + " " + b2.cardinality());
		}
	}

}
