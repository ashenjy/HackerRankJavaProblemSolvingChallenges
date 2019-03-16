package hackerRank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class CompareTriplets {

	 // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
        List<Integer>  resultList = new ArrayList<Integer>();
        
        int sumOfAlice = 0;
        int sumOfBob = 0;
        
        for(int i = 0; i < a.size(); i++) {

            System.out.println("Alice element :" + a.get(i));
            
            for(int z = 0; z < b.size(); z++) {
                
                System.out.println("Bob's element :" + b.get(z));

                if(a.get(i) < b.get(z)) {
                    sumOfBob++;
                    b.remove(z);
                    break;
                }else if(a.get(i) > b.get(z)) {
                    sumOfAlice++;
                    b.remove(z);
                    break;
                }else {
                	b.remove(z);
                    break;
                }
            }
            
        }
        
        resultList.add(sumOfAlice);
        resultList.add(sumOfBob);
        
        return resultList;

    }

	

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
	}
}
