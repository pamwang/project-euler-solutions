package com.company;
//Problem 12 - highly divisible triangular number
//Date: Sept. 28th. 2020
//NOTES: We can see that 28 is the first triangle number to have over five divisors.
//What is the value of the first triangle number to have over five hundred divisors?
public class Main {

    //helper function to iterate NON RECURSIVELY
    public static long iterator(long current){
        //current total is the number we are at now in the sequence
        long currentTotal=0;

        //while we have not reached the current number
        for(int i = 0; i <= current; i++){
            currentTotal += i;
        }

        return currentTotal;
    }

    //helper function to iterate RECURSIVELY
    public static long iteratorRecursive(long current){
        //BASE CASE: Once we reach the end return the total current
        if(current == 1||current == 0){
            return current;
        }
        //return current number + next number
        return current + iteratorRecursive(current-1);
    }

    //helper function to count number of divisors
    public static int numDivisors(long num){
        //count number of divisors
        int counter = 0;

        for(int i = 1; i <= num; i++){
            if(num%i==0){
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        //counting number of divisors
        int numDivisors = 0;
        //counter for the number we are at
        long counter = 0;
        //current sum of numbers
        long finNum = 0;

        //while the # of divisiors != 500 keep going
        while(numDivisors <= 500){
            //the answer is:
            finNum = iteratorRecursive(counter);
            counter++;

            //check # of divisors in answer
            numDivisors = numDivisors(finNum);
        }

        System.out.println(finNum);

    }
}
