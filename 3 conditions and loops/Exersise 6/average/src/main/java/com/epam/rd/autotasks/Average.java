package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int mas[] = new int[20];
        int counter=0;
        do {
        	n=scanner.nextInt();
        	mas[counter] = n;
        	counter++;
        }while(n!=0);

        int sum = 0;
        for(int j =0; j<(counter-1); j++) {
        	sum = sum + mas[j];
        }
        int average = (int)Math.round(sum/(counter-1));
        System.out.println(average);
        
        
    }

}