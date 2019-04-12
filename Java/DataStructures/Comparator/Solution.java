package DataStructures.Comparator;

import java.util.*;

class Checker implements Comparator{
	public int compare(Object o1, Object o2) {
		Player p1 = (Player) o1;
		Player p2 = (Player) o2;
		if(p1.score == p2.score) {
			return(p1.name.compareTo(p2.name));
		}
		else if(p1.score < p2.score) {
			return 1;
		}
		else {
			return -1;
		}
	}
}

class Player{
	String name;
	int score;
	
	Player(String name, int score){
		this.name = name;
		this.score = score;
	}
}
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Player[] player = new Player[N];
		Checker checker = new Checker();
		for(int i=0; i<N; i++) {
			player[i] = new Player(scanner.next(), scanner.nextInt());
		}
		Arrays.sort(player, checker);
		for(int i=0; i<player.length; i++) {
			System.out.printf("%s%s\n", player[i].name, player[i].score);
			
		}
	}

	}


