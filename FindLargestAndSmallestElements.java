/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation.Array;

/**
 *
 * @author VINAYAK PATIL
 */
public class FindLargestAndSmallestElements {
    public static void main(String args[]){
        int arr[]={3,4,55,67,54,36,86,33,455,1};
        int maxNum=arr[0];
        int minNum=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(maxNum<=arr[i]){
                maxNum=arr[i];
            }else if(minNum>arr[i]){
                minNum=arr[i];
            }
        }
        System.out.println("Maximum Number in an Array is: "+maxNum);
        System.out.print("Minimum Number in an Array is: "+minNum);
    }   
}
