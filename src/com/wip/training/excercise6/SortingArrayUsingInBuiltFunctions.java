package com.wip.training.excercise6;

import java.util.Arrays;

public class SortingArrayUsingInBuiltFunctions {

    public static void main(String[] args) {
        
        String[] countriesArray = {"us","india", "japan", "china"};                                          
        
        System.out.println("Before sorting:");
        
        for(String original : countriesArray){
            System.out.print(original + ", ");         
        }
        
        Arrays.sort(countriesArray);
        System.out.println("\n\nAfter sorting:");
        for(String sorted : countriesArray){
            System.out.print(sorted + ", ");              
        }
    }
}
