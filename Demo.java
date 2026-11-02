/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation;

/**
 *
 * @author VINAYAK PATIL
 */
public class Demo {
    public static void main(String args[]) {

        String s = "java development java programming";

        int total_count = s.length();

        int total_count_afterRemoval = s.replace("a", "").length();

        int count = total_count - total_count_afterRemoval;

        System.out.println("Number of occurrences of a is: " + count);
    }
}










//***********Reverse String ****************
//        String str="Vinayak Patil";
//        String rev="";
//        int len=str.length();
//        
//        for(int i=len-1; i>=0;i--){
//        rev=rev+str.charAt(i);
//    }
//        System.out.println(rev);


//*************Reverse The Number*******************
//int n=1234;
//        int rev=0;
//        
//        while(n!=0){
//          rev=rev*10+n%10;
//          n=n/10;
//          
//        }
//        System.out.print(rev);



//***************PALINDROME NUMBER**************
//        int num=2022;
//        int org_num=num;
//        int rev=0;
//        
//        while(num!=0){
//        rev=rev*10+num%10;
//        num=num/10;
//    }
//        System.out.println("Reversed Number: "+rev);
//        if(rev== org_num){
//            System.out.println("Number is palindrome.");
//        }else{
//            System.out.println("Number is not palindrome.");
//        }

    

//***************PALINDROME STRING*********************
//       String str="nayan";
//           String rev="";
//           int len=str.length();
//           
//           for(int i=len-1;i>=0;i--){
//               rev=rev+str.charAt(i);
//               
//           }
//           System.out.println("Reversed String: "+rev);
//           if(str.equals(rev)){
//               System.out.println("String is Palindrome");
//           }
//           else{
//               System.out.println("String is not palindrome");           
//           }

    
    
//    ************REMOVE WHITE SPACE***************
//    String str="I am       the     best !!";
//    str=str.replaceAll("\\s+", " ");
//    System.out.print(str);
//    }
