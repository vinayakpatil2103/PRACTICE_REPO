/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation;

/**
 *
 * @author VINAYAK PATIL
 */

 class mobile{
     int price;
     String model;
     
      mobile(int p, String m){
           price=p;
           model=m;
   }
      
      void display(){
          System.out.println("Model: "+model+"| price: "+price);
      }
 }
   

public class ConstructorInJava {
    public static void main(String []args){
        mobile m1=new mobile(100,"Oppo");
        mobile m2=new mobile(111,"Lava");
        
        m1.display();
        m2.display();
    }
    
}
