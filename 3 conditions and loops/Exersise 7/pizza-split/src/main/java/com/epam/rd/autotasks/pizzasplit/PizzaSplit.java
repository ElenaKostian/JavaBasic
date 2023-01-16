package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
    	Scanner scan = new Scanner(System.in);
    	int numberPeople = scan.nextInt();
    	int piecesPerPizza = scan.nextInt();
    	int n = piecesPerPizza;
    	int countOfPizza=1;
    	while(piecesPerPizza%numberPeople != 0) {
    		countOfPizza++;
    		piecesPerPizza = piecesPerPizza + n;
    	}
    	System.out.println(countOfPizza);


    }
}
