/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation.Array;

/**
 *
 * @author VINAYAK PATIL
 */


import java.util.Scanner;

public class SubstractionOfMatrix {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int rows, cols;

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        rows = s.nextInt();

        System.out.print("Enter number of columns: ");
        cols = s.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = s.nextInt();
            }
        }

        // Print first matrix
        System.out.println("First Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = s.nextInt();
            }
        }

        // Print second matrix
        System.out.println("Second Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        // Add matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Print sum matrix
        System.out.println("Sum of matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}