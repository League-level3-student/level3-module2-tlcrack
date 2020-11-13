package _02_More_Algorithms;

import java.util.Collection;
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
		for(int i = 0; i < message.size(); i++) {
			if(message.get(i).equals(" ... --- ... ")) {
				return true;
			}
			
		}
		return false;
	}
	
	public static List<Double> sortScores(List<Double> results) {
			Collections.sort(results);
			return results;
	}
	
	public static List<String> sortDNA(List<String> DNASequence){	
		String swapper = "";
		boolean sorted = false;
		//back to the for loop!
		while(sorted==false) {
		sorted=true;
			for(int i = 0; i < DNASequence.size()-1; i++) {
				if(DNASequence.get(i).length() > DNASequence.get(i+1).length()) {
				swapper=DNASequence.get(i);
				DNASequence.set(i, DNASequence.get(i+1));
				DNASequence.set(i+1, swapper);
				sorted=false;
				}
			}
		}
		return DNASequence;
	}
	
	public static List<String> sortWords(List<String> words) {
		Collections.sort(words);
		return words;
	}
	
}
