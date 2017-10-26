
/* Calculates the permutation of a String 
 * Time Complexity ----> O(n.n!)
 */

import java.util.Scanner;

public class Permutation {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to be permuted.");
		String str = scan.nextLine();
		System.out.println("Permuted values are" );
		permute("", str);
		scan.close();
	}

	private static void permute(String temp, String str) {
		if (str.isEmpty()) {
			
			System.out.println(temp);
		} else {
			for (int i = 0; i < str.length(); i++) {
              permute(temp+str.charAt(i),str.substring(0, i)+str.substring(i+1,str.length()));
			}
		}
	}
}
