package com.company;

//Problem #3 - Largest Prime factor of 600851475143
//Date: Sept.20.2020
//Note Playing catchup because I missed two days.


public class Main {

    public static void main(String[] args) {
        //number of which we are finding the prime factor of
        long num = 600851475143L;
        //factors
        long factors = 2L;

	    //iterate until num is reached
        while(factors < num){
            //if the number can be divided by current factor
            if(num%factors==0){
                //divide num by current factor
                num/=factors;
            }
            //otherwise iterate to next factor
            else{
                factors++;
            }
        }

        //the largest factor will be the remainder of num after dividing out by all other possible numbers
        System.out.println(num);
    }
}
