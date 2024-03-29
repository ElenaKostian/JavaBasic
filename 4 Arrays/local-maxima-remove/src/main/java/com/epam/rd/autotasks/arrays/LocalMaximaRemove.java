package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

    	int[] arrayCopy = new int[array.length];
    	int counter = 0;
    	if (array[0] <= array[1]) {
			arrayCopy[0] = array[0];
			counter++;
		}
    	    	
        for(int i =1; i < array.length-1; i ++) {
        	if (array[i]<= array[i+1] | array[i]<= array[i-1] ) {
        		arrayCopy[counter] = array[i];
    			counter++;
        	}
        }
        if (array[array.length-1] <= array[array.length-2]) {
			arrayCopy[counter] = array[array.length-1];
			counter++;
        }
        int[] arrayCopyWithoutZero = Arrays.copyOf(arrayCopy, counter);
        
        return arrayCopyWithoutZero ;
      //  throw new UnsupportedOperationException();
}}
