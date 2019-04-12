package DataStructures.Stack;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('{','}');
		map.put('[', ']');
		while(scanner.hasNext()) {
			String s = scanner.next();
			System.out.println(isBalanced(s,map) ? "true":"false");
		}
	}
	
	public static boolean isBalanced(String s, HashMap<Character, Character> map) {
		if(s.length()==0 || s.length()%2 != 0) {
			return false;
		}
		ArrayDeque<Character> deque = new ArrayDeque<Character>();
		for(int i=0; i<s.length(); i++){
            Character temp = s.charAt(i);
            //remove part
            if(temp.equals(deque.peek())){
                deque.pop();
            }
            //start from here
            else if(map.containsKey(temp)){
                deque.push(map.get(temp));
            }
            else{
                return false;
            }
        }
		return deque.isEmpty();
	}
	

}
