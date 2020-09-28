package com.company;
//problem 10- summation of primes
//Date: Sept. 27th. 2020
//Notes: The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//Find the sum of all the primes below two million

public class Main {

    //helper function used to check if the number is indeed prime
    public static boolean prime(int num){

        if(num == 2){
            return true;
        }

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
	    //max number is 2 million
        int MAX = 2000000;
        int num = 2;
        int primeNum = 0;

        while(num < MAX){
            if(prime(num)){
                primeNum+=num;
            }
            num++;
        }

        System.out.println("The summation of all primes from 1 - 2 million is: "+ primeNum);
    }
}
