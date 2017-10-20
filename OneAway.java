/* Here in this problem, we are considering only 3 operations insert, delete, replace and they can be called only once.
 * Check if the strings are 1 edit away or more. 
 * pale--->ple 1 edit
 * pales--->pale 1 edit
 * pale--->bale 1 edit
 * pale--->bae more that 1 edit
 */


import java.util.Scanner;

public class OneAway {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 String.");
		String s1 = scan.nextLine();
		System.out.println("Enter 2 String.");
		String s2 = scan.nextLine();
		if (Math.abs(s1.length() - s2.length()) > 1) {
			System.out.println("Not one away.");
		} else {
			if (s1.length() == s2.length()) {
				if(Replace(s1, s2)) System.out.println("One Away.");
				else System.out.println("Not One Away");
			} else {
				if (s1.length() > s2.length()) {
					if(operation(s1, s2)) System.out.println("One Away.");
					else System.out.println("Not One Away");
				} else {
					if(operation(s2, s1)) System.out.println("One Away.");
					else System.out.println("Not One Away");
				}
			}

		}
		scan.close();

	}

	private static boolean operation(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while (index1 < s1.length() && index2 < s2.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}
				index1++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}
  
	private static boolean Replace(String s1, String s2) {
		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i)){
            	count++;
            	if(count>1){
            		return false;
            	}
            }
		}
		return true;
	}

}
