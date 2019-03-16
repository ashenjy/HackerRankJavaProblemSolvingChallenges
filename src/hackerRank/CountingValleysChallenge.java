package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleysChallenge {

	// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

    	int valleyCount = 0;
    	int seaLevel = 0;
    	 
    	boolean belowSea = false;
    	
    	for(int i = 0; i < n; i++) {
    		
    		if(s.charAt(i) == 'D') {
    			seaLevel--;
    		}else if(s.charAt(i) == 'U') {
    			seaLevel++;
    		}
    		
    		if(!belowSea && seaLevel < 0) {
    			valleyCount++;
    			belowSea = true;
    		}
    		
    		if(seaLevel >= 0) {
    			belowSea = false;
    		}
    	}
    	
    	System.out.println("valley count :" + valleyCount);
    	
    	return valleyCount;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	countingValleys(8, "UDDDUDUU");
    }
}
