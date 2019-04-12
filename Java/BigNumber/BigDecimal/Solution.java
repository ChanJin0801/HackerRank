package BigNumber.BigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String[] s = new String[N+2];
		for(int i=0; i<N; i++) {
			s[i] = scanner.next();
		}
		
		for(int i=0; i<N; i++) {
			BigDecimal max = new BigDecimal(s[i]);
			int idx = i;
			for(int j=i+1; j<N; j++) {
				BigDecimal curr = new BigDecimal(s[j]);
				if(curr.compareTo(max)==1) {
					max=curr;
					idx = j;
				}
			}
			String temp = s[i];
			s[i] = s[idx];
			s[idx] = temp;
		}
		
		for(int i=0; i<N; i++) {
			System.out.println(s[i]);
		}
		

	}

}
