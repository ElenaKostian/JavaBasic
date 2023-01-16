package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scan = new Scanner(System.in);
        int n;
        int mas[] = new int[20];
        int i = 0;
        
        do {
        	n = scan.nextInt();
        	mas[i] = n;
        	i++;
        	} while (n!=0);
        
       int maxValue=mas[0];
        for(int j=0; j<i-1; j++) {
        	if(mas[j]>maxValue) {
        		maxValue=mas[j];
        	}
        }
        return maxValue;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code


        System.out.println(max());
    }

}
