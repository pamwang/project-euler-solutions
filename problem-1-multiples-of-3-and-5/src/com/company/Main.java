package com.company;

//Sept. 17th. 2020
//Project Euler #1

//Question: If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//Find the sum of all the multiples of 3 or 5 below 1000.
public class Main {

    public static void main(String[] args) {
        //declaring variables, three and five are constants
        int THREE = 3, FIVE = 5;
        //max_val is the ceiling number given in the problem
        int max_val = 1000;
        //sum is the sum of all number that are multiples of 3 or 5
        int sum=0;

        //using a loop to iterate until max_val
        for(int i = 0; i<max_val; i++){
            //if the current number (i) is divisible by three
            if(i%THREE==0){
                //add i to the total
                sum+=i;
            }
            //if the current number (i) is divisible by five
            //using else if to account for numbers that are divisible by BOTH 3 and 5
            else if(i%FIVE==0){
                //add i to the total
                sum+=i;
            }
        }

        System.out.println(sum);
    }
}
