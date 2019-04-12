package Advanced.SHA256;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		md.update(str.getBytes());
		byte[] digest = md.digest();
		
		for(byte b : digest) {
			System.out.format("%02x", b);
		}

	}

}
