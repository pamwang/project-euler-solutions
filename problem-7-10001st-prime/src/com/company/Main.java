package com.company;
//Problem #7 - 10001st Prime
//Sept. 23rd. 2020
//NOTES: By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//What is the 10 001st prime number?

public class Main{

    //helper function to verify if a number is prime
    public static boolean primeNum(long num){
        //iterate from 2 to the current number
        for(int i = 2; i < num; i++){
            //if the modulus division ==0 then return false b/c it's not prime
            if(num%i==0){
                return false;
            }
        }

        //otherwise, return true because it is prime
        return true;
    }

    public static void main(String[] args) {
        //Max prime number
        long MAX = 10001;
	    //determining if we have reached our max prime value of 10001
        boolean isMax = false;
        //counter to keep track of the # of primes
        long primeCounter = 0, i=0;
        //the prime number
        long prime = 0;
        //keep iterating forwards
        long counter = 1;

        //loop to iterate to 10001st prime
        while(isMax == false){

            //check if it is prime
            if(primeNum(counter)==true){
                //if it is prime, set prime number = to current number
                prime = counter;
                //count another prime
                primeCounter++;
            }
            //keep counting
            counter++;

            //if the # of primes = MAX then max is true
            if(primeCounter == MAX+1){
                //break while loop
                isMax = true;
            }
        }

        System.out.println("Prime #: " + (primeCounter-1));
        System.out.println("10001st prime: " + prime);

    }
}
