import java.util.Scanner;

public class uniqueChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to check.");
		String input = scan.nextLine();
		boolean b = duplicatecheck(input);
		if (b == true) {
			System.out.println("Duplicate found");
		} else {
			System.out.println("Duplicate not found");
		}
		scan.close();
	}

	private static boolean duplicatecheck(String input) {
		boolean[] ch = new boolean[128];
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (ch[c] == false) {
				ch[c] = true;
			} else {
				return true;
			}
		}
		return false;
	}

}
