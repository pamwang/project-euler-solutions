package com.company;

//Problem #5 - Smallest Multiple
//Date: Sept. 21. 2020
//NOTES:2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Main {

    //Brute force solution. It definitely takes a long time and is NOT Scaleable beyond 20 will implement
    //more elegant solution soon...
    public static void main(String[] args) {
        //array that contains all the numbers from 1 - 20
        //int[] allNums = new int[]{ 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //range of numbers that the smallest multiple needs to be divisible by
        int MAX = 20;
        //placeholder value for the smallest multiple
        int smallestMultiple = 1;
        //check if the number is evenly divisible
        boolean evenlyDivisible = false;
        //keep track of how many numbers are divisible
        int counter =0;
        int i=0;

        while(!evenlyDivisible){
            for(i = 1; i < MAX; i++){
                if(smallestMultiple%i==0){
                    counter++;
                }
            }
            if(counter == 20){
                evenlyDivisible=true;
            }
            i=0;
            counter = 0;
            smallestMultiple++;
        }

        System.out.println(smallestMultiple);
    }
}
