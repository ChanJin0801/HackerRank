package DataStructures.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		int N = scanner.nextInt();
		scanner.nextLine();
		
		for(int i=0; i<N; i++) {
			String name = scanner.nextLine();
			int number = scanner.nextInt();
			scanner.nextLine();
			map.put(name, number);
		}
		while(scanner.hasNext()) {
			String fname = scanner.nextLine();
			if(map.containsKey(fname)) {
				System.out.println(fname + "=" + map.get(fname) );
			}
			else {
				System.out.println("Not found");
			}
		
		}
		
	}

}
