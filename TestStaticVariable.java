/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation;

/**
 *
 * @author VINAYAK PATIL
 */

class student
{
    int id;
    String name;
    static String clg ="ymimk";
    
    student(int i , String n){
        id=i;
        name=n;
    }
    
    void display(){
        System.out.println(id+" "+ name+ " "+clg);
    }
}
public class TestStaticVariable {
    public static void main(String []args){
        student s1=new student(111,"vinu");
        student s2=new student(123,"sandy");
        
        s1.display();
        s2.display();
    }
    
}
