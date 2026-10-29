/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation;

/**
 *
 * @author VINAYAK PATIL
 */

class Bank{
    int RateOfInterest(){
        return 0;
    }
}
class Axis extends Bank{
    int RateOfInterest(){
        return 7;
    }
}
class ICICI extends Bank{
    int RateOfInterest(){
        return 9;
    }
}
class BOI extends Bank{
    int RateOfInterest(){
        return 8;
    }
}

public class MethodOverriding {
    public static void main(String args[]){
        
        BOI b=new BOI();
        Axis a=new Axis();
        ICICI c=new ICICI();
       
        System.out.println("BOI ROI - "+b.RateOfInterest());
        System.out.println("ICICI ROI - "+c.RateOfInterest());
        System.out.println("Axis ROI - "+a.RateOfInterest());
        
    }
    
}