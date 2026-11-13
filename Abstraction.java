/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation;

/**
 *
 * @author VINAYAK PATIL
 */

abstract class Shape{
    abstract void draw();
}
class circle extends Shape{
    void draw(){
        System.out.println("cirlce drawing.......");
    }
}
class rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle drawing.....");
    }
}

public class Abstraction {
    public static void main(String []agrs){
        Shape s=new circle();
        Shape s2=new rectangle();
        s2.draw();
        s.draw();
        
    }
    
}
