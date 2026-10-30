/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation;

/**
 *
 * @author VINAYAK PATIL
 */
interface printable{
    void print();
}
interface runnable{
    void show();
}
class example implements printable, runnable{
   public void print(){
        System.out.println("Printable interface");
    }
   public void show(){
       System.out.println("Runnable interface");
   }
   
}
public class InterfaceMultipleInheritance {
    public static void main(String [] args ){
        example ex=new example();
        ex.print();
        ex.show();
    }
}
