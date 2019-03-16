package hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingChallenge {

	/*
	 * Complete the gradingStudents function below.
	 */
	static int[] gradingStudents(int[] grades) {

		int students = grades[0];

		System.out.println("students :"+ students);

		int[] roundedGrades = new int[4];

		for(int i=0; i < grades.length; i++){
			if(grades[i] >= 38){

				System.out.println("Grade element :"+ grades[i]);

				int diff = 0;

				while((grades[i] + diff) % 5 != 0) {
					diff++;
				}

				System.out.println("diff :"+ diff);

				if(diff < 3) {
					grades[i] += diff;

					System.out.println("grad+diff :"+ grades[i]);

					roundedGrades[i] = grades[i];

					System.out.println("roundedGrades :"+ roundedGrades);

				}else{
					roundedGrades[i] = grades[i];
				}
			}else{
				roundedGrades[i] = grades[i];
			}
		}

		return roundedGrades;
	}

	

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int[] grades = {73, 67, 38, 33};
		gradingStudents(grades);
	}
}
