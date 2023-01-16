package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        seconds = seconds%(24*60*60);
        
        int sec, hour, minut;
        hour = (int) (Math.floor(seconds/(60*60)));
        minut =  (int) Math.floor((seconds - hour*60*60)/60); 
        sec = seconds -minut*60 - hour*60*60 ;
        
        System.out.print(hour+":");

        if (minut<10) {
        	System.out.print("0"+minut+":");
        }else {
        	System.out.print(minut+":");
        }
        if (sec<10) {
        	System.out.print("0"+sec);
        }else {
        	System.out.print(sec);
        }        
    }
}
