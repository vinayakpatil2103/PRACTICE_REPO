/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation;

/**
 *
 * @author VINAYAK PATIL
 */
class Adder{
    static int add(int a, int b){
        return a+b;
    }
    
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
public class MethodOverloding {  
    public static void main(String args[]){
       System.out.println(Adder.add(10,11));
       System.out.println(Adder.add(10,11,12));
       
        
    }
    
}
