package _02_More_Algorithms;

import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		  for(int i = 0; i < eggs.size(); i++) {
			  if(eggs.get(i).equals("cracked")) {
				  return i;
			  }
				  
			  }
		return 0;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		return oysters.indexOf(true);
	}
	
	
	public static double findTallest(List<Double> peeps) {
		return Collections.max(peeps);
	}
	
	
	public static String findLongestWord(List<String> words) {	
		String n = "";
		for(int i = 0; i < words.size(); i++) {
			if(words.get(i).length()>n.length()) {
				n=words.get(i);
			}
		}
		return n;
	}
	
	public static boolean containsSOS(List<String> message) {
		return false;
	}
}
