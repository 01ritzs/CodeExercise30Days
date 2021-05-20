package com.company.codingExercise30Days.day11;

public class Array2D {
    public static void main(String[] args) {
        int rowSize = 2;
        int colSize = 4;
        int[][] myArray = new int[rowSize][colSize];
        int count = 0;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                myArray[i][j] = count;
                System.out.println(myArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
