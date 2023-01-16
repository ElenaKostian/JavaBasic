package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

// (ax² + bx + c = 0)
/*"x₁ x₂" (two roots in any order separated by space) if there are two roots
"x" (just the value of the root) if there is the only root
"no roots" (just a string value "no roots") if there is no root*/
        if (a!=0) {
        	double desc = b*b - (4*a*c);
        	double x1 = (-b+ Math.sqrt(desc))/(2*a);
        	double x2 = (-b- Math.sqrt(desc))/(2*a);
        	
        	if (Double.isNaN(x1) | Double.isNaN(x2)) {
        		System.out.println("no roots");
        	}else if (x1==x2) {
        		System.out.println(x1);
        	}else {
        		System.out.println(x2 + " " + x1);	
        	}
        }else {
        	System.out.println("no roots");
        }
    }

}