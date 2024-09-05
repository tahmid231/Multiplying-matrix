/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrixmul;

/**
 *
 * @author hp
 */
public class MatrixMul {
    public static void main(String[] args) {
        int[][] matrixA = {
            {5, 8, 2},
            {7, 6, 3}
        };

        int[][] matrixB = {
            {4, 9},
            {55, 87},
            {13, 21}
        };

        int[][] result = multiplyMatrices(matrixA, matrixB);

        System.out.println("Matrix X:");
        printMatrix(matrixA);
        System.out.println("Matrix Y:");
        printMatrix(matrixB);
        System.out.println("Result:");
        printMatrix(result);
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        if (colsA != rowsB) {
            throw new ArithmeticException("Matrices cannot be multiplied");
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
