package com.company;

//Problem #3 - Largest palindrome product
//Date: Sept.20.2020
//Note: A palindromic number reads the same both ways. The largest palindrome
// made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.
//correct answer: 997799

import java.util.*;

import static java.lang.StrictMath.pow;

public class Main {
    //helper function to check if the number is a palindrome
    public static boolean isPalindrome(int n){
        int nTemp = n;
        int nReverse = 0;
        int i = 0;

        if(n < 10){
            return true;
        }

        while(nTemp != 0){
            nReverse += (nTemp%10)*pow(10,i);
            nTemp = Math.floorDiv(nTemp,10);
            i++;
        }

        if(nReverse == n){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        //first number (starts from 3 digits)
        int firstNumber = 100;
        //second number (starts from 3 digits)
        int secondNumber = 100;
        //records largest Palindrome
        int largestPalindrome = 0;
        //Temporary Palindrome used for keeping comparison
        int tempPalindrome = 0;
        //MAX value that can be reached by first + second number
        int MAX = 1000;

        //pairwise comparison
        while (firstNumber < 1000) {
            while (secondNumber < 1000){
                tempPalindrome = firstNumber*secondNumber;
                if(isPalindrome(tempPalindrome)==true){
                    largestPalindrome = tempPalindrome;
                }
                secondNumber++;
            }
            secondNumber = 100;
            firstNumber++;
        }

        System.out.println(largestPalindrome);
    }
}