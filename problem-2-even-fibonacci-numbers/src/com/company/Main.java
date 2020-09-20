package com.company;

//Problem #2 - Sum of all even Fibonacci Numbers up to 4 million
//Date: Sept.19.2020

public class Main {
    //function to calculate the fibonacci sequence recursively
    public static int calculateFibonacci(int n){
        //base case #1 if the number given is 0 return 0
        if(n==0) {
            return 0;
        }
        //base case #2 if the number given is 1 or 2 return 1
        else if(n==1 | n==2){
            return 1;
        }
        //otherwise, add the previous number to the one before it
        return calculateFibonacci(n-2)+calculateFibonacci(n-1);
    }

    //Main function
    public static void main(String[] args) {
        //max value (given in the problem to be 4 million)
        int MAX = 4000000;
        //sum of all even fibonacci numbers up to 4 million
        int sum = 0;
        //the placeholder for current fibonacci number
        int fibNum = 0;
        //counter to keep track of position in loop
        int counter = 0;

        //for loop to calculate each fibonacci number
        do{
            counter++;
            //if the number is even then add it to the sum
            if (fibNum % 2 == 0) {
                sum += fibNum;
            }
            //calling helper function to calculate fibonacci number
            fibNum = calculateFibonacci(counter);
        }while(fibNum < MAX);

        System.out.println(sum);

    }

}
