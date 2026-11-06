/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation.Array;

/**
 *
 * @author VINAYAK PATIL
 */
public class Find_Duplicate_Elements {
    public static void main(String args []){
       int arr []={2,4,5,6,7,8,4,3,5,3};
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr [i]==arr[j]){
                   System.out.println("Duplicate Elements : "+arr[i]);
               }
           }
       }
        
    }
    
}
