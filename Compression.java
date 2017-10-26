/*This program takes input a String, then calculates frequency of each character and prints that if length of frequency is less  
 * than the frequency of string. 
 * Input = aabcccccaaa(length = 11) -----> a5b1c5(length = 6). So it prints a5b1c5.
 * Time Complexity -----> O(n)
 */

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Compression {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word to be compressed.");
		String str = scan.nextLine();
		scan.close();
		char[] charstr = str.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0;i<charstr.length;i++){
			if(map.containsKey(charstr[i])==false){
				map.put(charstr[i], 1);
			}else{
				map.put(charstr[i], map.get(charstr[i])+1);
			}
			
		}
		 String result = "";
		 for (Entry<Character, Integer> entry : map.entrySet()) {
			  result+=entry.getKey().toString()+entry.getValue();
			}
	
		 
		 if(result.length()<str.length()){
			 System.out.println(result);
		 }else{
			 System.out.println(str);
		 }
		 
	}

}
