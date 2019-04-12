package DataStructures.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> alist = new ArrayList<ArrayList<Integer>>();
		int N = Integer.parseInt(scanner.next());
		for(int i=0; i<N; i++) {
			int n = Integer.parseInt(scanner.next());
			alist.add(new ArrayList<Integer>());
			for(int j=0; j<n;j++) {
				int num = Integer.parseInt(scanner.next());
				alist.get(i).add(num);
			}
		}
		
		int K = scanner.nextInt();
		for(int i=0; i<K; i++) {
			int a = Integer.parseInt(scanner.next());
			int b = Integer.parseInt(scanner.next());
			if(a > alist.size() || b > alist.get(a-1).size()){
				System.out.println("ERROR!");
			}
			else {
				System.out.println(alist.get(a-1).get(b-1));
			}
		}
		

	}

}
