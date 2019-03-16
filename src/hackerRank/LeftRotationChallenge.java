package hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class LeftRotationChallenge {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {

		int i , temp;

		//for loop to rotate d times
		for(int b = 0; b < d; b++){

			temp = a[0];

			for( i = 0; i < a.length -1; i++) {
				a[i] = a[i + 1];
			}

			a[i] = temp;
		}

		for(int z = 0; z < a.length; z++){
			System.out.println(a[z] + " ");
		}

		return a;

	}

	public static void main(String[] args)  
	{ 	           
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		rotLeft(arr, 2);
	} 
}
