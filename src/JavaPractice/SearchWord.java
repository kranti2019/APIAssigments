package JavaPractice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class SearchWord {

	public static void main(String[] args) {
		 String str1="sdfvsdf68fsdfsf8999fsdf09";
		   String numberOnly= str1.replaceAll("[^0-9]", "");
		   String alpha= str1.replaceAll("[^a-z]", "");
		   System.out.println(alpha);
		  // Given String containing duplicate words
	      String input = "Java is a programming language. Python is also a programming language.";
	      // Converting given String to lowerCase
	      input = input.toLowerCase();
	      /* Split the Input String into words using 
	      built-in split() method */
	      String[] strArray = input.split(" ");
	      /* Declare List of String that will 
	      contain repeated words*/
	      List<String> repeatedWords = new ArrayList<>();
	      /* Declare HashSet of String that will 
	      contain unique words */
	      HashSet<String> uniqueWords = new HashSet<>();
	      for(String str : strArray)
	      {
	          if (!uniqueWords.add(str))
	            repeatedWords.add(str);
	      }
	      System.out.println(repeatedWords);
	    }
	}