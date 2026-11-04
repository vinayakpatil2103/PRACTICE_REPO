/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation;

/**
 *
 * @author VINAYAK PATIL
 */
class car {

    int num;
    String name;

    void records(int n, String no) {
        num = n;
        name = no;
    }

    void display() {
        System.out.println("Car Name: " + name + " | Car Number: " + num);
    }
}

public class InitializeObjectByMethod {

    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();

        c1.records(2000, "Audi");
        c2.records(2003, "BMW");

        c1.display();
        c2.display();
    }
}
