package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {
    	int columnsMatrix = matrix[0].length;
    	int rowsMatrix = matrix.length;
        int[][] transposedMatrix = new int[columnsMatrix][rowsMatrix];

        for(int i = 0; i < rowsMatrix; i++) {
        	for(int j = 0; j < columnsMatrix; j++) {
        		transposedMatrix[j][i] = matrix[i][j];
        	}
        }
        return transposedMatrix;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2},
                {7, -13}};

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
