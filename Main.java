package nita.com.Task1;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;


	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] marks = new int[n];
	        int total = 0;
	        for (int i = 0; i < n; i++) {
	            marks[i] = sc.nextInt();
	            total += marks[i];
	        }
	        ArrayList<String> result = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            for (int j = i; j < n; j++) {
	                int groupTotal = 0;
	                for (int k = i; k <= j; k++) {
	                    groupTotal += marks[k];
	                }
	                int groupSize = j - i + 1;
	                double groupAvg = (double) groupTotal / groupSize;
	                double remainingAvg = (double) (total - groupTotal) / (n - groupSize);
	                if (groupAvg > remainingAvg) {
	                    result.add((i+1) + " " + (j+1));
	                }
	            }
	        }
	        System.out.println(result.size());
	        for (String s : result) {
	            System.out.println(s);
	        }
	    }
	}

	    


