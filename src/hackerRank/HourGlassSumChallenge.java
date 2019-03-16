package hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HourGlassSumChallenge {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {

		int maxSum = Integer.MIN_VALUE;
		int rows = arr.length;
		int cols = arr[0].length;
		
		if(rows < 3 || cols < 3) {
			return -1;
		}

		for(int a = 0; a < rows -2 ; a++) {
			for(int b = 0; b < cols - 2; b++) {
				int sum = (arr[a][b] + arr[a][b+1] + arr[a][b+2] +
						arr[a+1][b+1] + 
						arr[a+2][b] + arr[a+2][b+1] + arr[a+2][b+2]);

				maxSum = Math.max(maxSum, sum);
			}
		}

		return maxSum;
	}

	public static void main(String[] args)  
	{ 	           
		int [][]mat = {{1, 2, 3, 0, 0}, 
				{0, 0, 0, 0, 0}, 
				{2, 1, 4, 0, 0}, 
				{0, 0, 0, 0, 0}, 
				{1, 1, 0, 1, 0}}; 
		int res = hourglassSum(mat); 
		if (res == -1) 
			System.out.println("Not possible"); 
		else
			System.out.println("Maximum sum of hour glass = "
					+ res); 

	} 
}
