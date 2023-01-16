package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
    	int a,b,h;
    	Scanner scan = new Scanner(System.in);
    	a = scan.nextInt();
    	b = scan.nextInt();
    	h = scan.nextInt();
    	int roud = a;
    	int day = 1;
    	if ((a-b)>0) {	
    		for(int i = 1; roud<h; i++) {
    			roud = roud + a - b ;
    			day++;
    		}
    		System.out.println(day);
    	}else if (a>=h){
    		System.out.println(1);
    	}else
    	{
    		System.out.println("Impossible");
    	}
    	
    	
    	
    }
}
