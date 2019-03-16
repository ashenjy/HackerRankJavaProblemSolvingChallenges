package hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DiagonalDifference {

	/*Given a square matrix, calculate the absolute difference between the sums of its diagonals.
	 * 
	 * Complete the diagonalDifference function below.
	 */
    static int diagonalDifference(int[][] arr) {
    // Initialize sums of diagonals 
            int d1 = 0, d2 = 0; 
        
            for (int i = 0; i < arr.length; i++) 
            { 
                d1 += arr[i][i]; 
                d2 += arr[i][arr.length-i-1]; 
            } 
        
            // Absolute difference of the sums 
            // across the diagonals 
            return Math.abs(d1 - d2); 
    }

	 public static void main(String[] args)  
	    { 	           
	        int arr[][] = 
	        { 
	            {11, 2, 4}, 
	            {4 , 5, 6}, 
	            {10, 8, -12} 
	        }; 
	       
	        System.out.print(diagonalDifference(arr)); 
	         
	    } 
}
