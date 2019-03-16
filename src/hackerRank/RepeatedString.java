package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	
    	long count = 0;
    	long repetitions = 0;
    	
    	for(int i = 0; i < s.toCharArray().length; i++) {
    		System.out.println(s.charAt(i));
    		
    		if(s.charAt(i) == 'a') {
    			count++;
    		}
    	}
    	
		repetitions = (n / s.length());
		count = repetitions * count;
		
		for(int z=0; z < n % s.length(); z++) {
			if(s.charAt(z) == 'a') {
				count++;
			}
		}
        
    	System.out.println("Count 'a' " + count);
    	System.out.println("repetitions 'a' " + repetitions);


    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        repeatedString("aba", 10);
    }
}
