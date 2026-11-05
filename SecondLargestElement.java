/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation.Array;

/**
 *
 * @author VINAYAK PATIL
 */
public class SecondLargestElement {
    public static void main(String args[]){
        int arr[]={3,5,6,7,6,4,49};
        
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           
           if(arr[i]>largest){
               second_largest=largest;
               largest=arr[i];
               
           }else if(arr[i]>second_largest && arr[i]!=largest){
               second_largest=arr[i];
           }
       }
        System.out.println("Largest Number: " + largest);
        System.out.println("Second Largest Number: " + second_largest);
    }
    
}
