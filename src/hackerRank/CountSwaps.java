package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountSwaps {

	// Complete the countSwaps function below.
	static void countSwaps(int[] a) {

		int swapCount = 0;
		int n = a.length;
		int temp = 0;

		int j;

		for (int i = 0; i < n; i++) {

			for (j = 0; j < n - 1; j++) {
				// Swap adjacent elements if they are in decreasing order
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapCount++;
				}
			}

		}

		System.out.println("Array is sorted in " + swapCount + " swaps.");
		System.out.println("First Element: " + a[0] );
		System.out.println("Last Element: " + a[n-1] );

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int[] a = {3,2,1};
		countSwaps(a);
	}
}
