package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int bill = scan.nextInt();
        int countOfFriends = scan.nextInt();
        
        if(bill>=0 & countOfFriends>0) {
        	int partToPay = (int) (Math.round((bill*0.1+bill)/countOfFriends));
        	System.out.println(partToPay);
        }else if (bill<0) {
        	System.out.println("Bill total amount cannot be negative");
        }else if (countOfFriends<=0) {
        	System.out.println("Number of friends cannot be negative or zero");
        }
        
    }
}
