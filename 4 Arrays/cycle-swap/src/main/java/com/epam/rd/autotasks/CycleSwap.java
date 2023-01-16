package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
    	if(array.length>0) {
    		int lastValue = array[array.length-1];
    		for (int i =array.length-1; i > 0; i--) {
    			array[i] = array[i-1];
    		}
    		array[0] = lastValue;
    	}
    }

    static void cycleSwap(int[] array, int shift) {
    	if(shift >0 & array.length>0) {
    	
    		int[] arrayShift = Arrays.copyOfRange(array, array.length-shift, array.length);  
    	//	System.out.println(Arrays.toString(arrayShift)); //
    		for (int i =array.length-1; i >= shift; i--) {
    			array[i] = array[i-shift];
    		}
    	//	System.out.println(Arrays.toString(array) + " ---2"); //
    		
    		for(int i = 0; i < arrayShift.length; i++ ) {
    			array[i] = arrayShift[i];
    		}
    	}
    }
}
