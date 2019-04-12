package DataStructures.List;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> alist = new LinkedList<Integer>();
		int N = Integer.parseInt(scanner.next());
		for(int i=0; i<N; i++) {
			int num = Integer.parseInt(scanner.next());
			alist.add(num);
		}
		int N2 = Integer.parseInt(scanner.next());
		for(int i=0; i<N2; i++) {
			String s = scanner.next();
			switch(s) {
			case "Insert":
				int a = Integer.parseInt(scanner.next());
				int b = Integer.parseInt(scanner.next());
				alist.add(a,b);
				break;
			case "Delete":
				int c = Integer.parseInt(scanner.next());
				alist.remove(c);
				break;
				
			}
			
		}
		for(int num : alist) {
			System.out.print(num + " ");
		}

	}

}
