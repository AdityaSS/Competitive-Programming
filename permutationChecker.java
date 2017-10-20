/*
import java.util.Scanner;

public class permutationChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 String.");
		String s1 = scan.nextLine();
		System.out.println("Enter 2 String.");
		String s2 = scan.nextLine();
		boolean b = permutationcheck(s1,s2);
        if(b==false){
        	System.out.println("Not permutation");
        }else{
        	System.out.println("Permutation.");
        }
        scan.close();
	}

	private static boolean permutationcheck(String s1, String s2) {
		if(s1.length()!=s2.length()) return false;
		int[] characters = new int[128];
		for(int i = 0;i<s1.length();i++){
			characters[i]++;
		}
		for(int i = 0;i<s2.length();i++){
			characters[i]--;
			if(characters[i]<0)
				return false;
		}
		return true;
	}
}
*/
import java.util.Arrays;
import java.util.Scanner;

public class permutationChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 String.");
		String s1 = scan.nextLine();
		System.out.println("Enter 2 String.");
		String s2 = scan.nextLine();
		boolean b = permutationcheck(s1,s2);
        if(b==false){
        	System.out.println("Not permutation");
        }else{
        	System.out.println("Permutation.");
        }
        scan.close();
	}

	private static boolean permutationcheck(String s1, String s2) {
		if(s1.length()!=s2.length()) 
			return false;
		else{
			return sort(s1).equals(sort(s2));
			}
		}

	private static Object sort(String s1) {
		char[] ch = s1.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
	}

