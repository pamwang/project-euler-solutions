package com.company;

//Problem #6 Sum square difference
//Sept. 22. 2020
//NOTES: Subtract sum of squares from square of sums (what a tongue twister!) for the first 100 natural numbers

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        //sum of Squares
	    long sumSquares = 0;
	    //square of sum
	    long squareSum = 0;
	    //squareSums - sumSquares
	    long diff = 0;
	    //Ceiling value
        int MAX = 100;

	    for(int i = 0; i < MAX+1; i++){
	        sumSquares += i*i;
	        squareSum += i;
        }

	    squareSum *=squareSum;
	    diff = squareSum - sumSquares;

	    System.out.println("Difference: "+ diff);
    }
}
