package DataStructures.Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		HashSet<Integer> map = new HashSet<>();
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		int max=0;
		for(int i=0; i<a; i++) {
			int num = scanner.nextInt();
			map.add(num);
			dq.add(num);
			if(dq.size()==b) {
				max = Math.max(map.size(), max);
				int item = dq.remove();
				if(!dq.contains(item)) {
					map.remove(item);
				}
			}
		}
		System.out.println(max);

	}

}
