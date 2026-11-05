/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interview_preparation.Array;

/**
 *
 * @author VINAYAK PATIL
 */


import java.util.Map;
import java.util.TreeMap;

public class WordFrequency {

    public static void main(String[] args) {

        // Array of words
        String[] words = {
                "java",
                "spring",
                "java",
                "mysql",
                "spring",
                "java"
        };

        /*
         * TreeMap is used to store data in sorted order.
         *
         * Key   -> Word
         * Value -> Frequency of word
         */
        TreeMap<String, Integer> map = new TreeMap<>();


        // Loop through each word in array
        for (String word : words) {

            /*
             * Check if word already exists in map
             */
            if (map.containsKey(word)) {

                /*
                 * If word exists:
                 * Get old frequency
                 * Increase frequency by 1
                 */
                map.put(word, map.get(word) + 1);

            } else {

                /*
                 * If word does not exist:
                 * Add word with frequency 1
                 */
                map.put(word, 1);
            }
        }


        // Print word frequencies
        System.out.println("Word Frequency in Sorted Order:");

        /*
         * entrySet() returns all 
        
        
        
        
        key-value pairs
         */
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            /*
             * entry.getKey()   -> returns word
             * entry.getValue() -> returns frequency
             */
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}