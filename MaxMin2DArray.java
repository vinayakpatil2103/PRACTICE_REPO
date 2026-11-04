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

public class MaxMin2DArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int rows, cols;

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        rows = s.nextInt();

        System.out.print("Enter number of columns: ");
        cols = s.nextInt();

        int[][] arr = new int[rows][cols];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        // Print array
        System.out.println("Array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Assume first element is max and min
        int max = arr[0][0];
        int min = arr[0][0];

        // Find max and min
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        // Display result
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);

        s.close();
    }
}