package com.company;

//Problem 14- longest collatz sequence
//Date: September. 30th. 2020
//Notes: It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
// Although it has not been proved yet
// (Collatz Problem), it is thought that all starting numbers finish at 1.
//Which starting number, under one million, produces the longest chain?

public class Main {

    public static void main(String[] args) {
	    //ceiling value
        int MAX = 1000000;
        //stores length of the sequence
        int sequenceLength = 0;
        //stores the initial number of sequence
        int startingNumber = 0;
        //sequence
        int sequence;
        //stores members of the sequence
        int[] cache = new int[MAX + 1];

        //Initialise cache
        for (int i = 0; i < cache.length; i++) {
            cache[i] = -1;
        }
        cache[1] = 1;

        for (int i = 2; i <= MAX; i++) {
            sequence = i;
            int k = 0;
            while (sequence != 1 && sequence >= i) {
                k++;
                if ((sequence % 2) == 0) {
                    sequence = sequence / 2;
                } else {
                    sequence = sequence * 3 + 1;
                }
            }
            //Store result in cache
            cache[i] = k + cache[sequence];

            //Check if sequence is the best solution
            if (cache[i] > sequenceLength) {
                sequenceLength = cache[i];
                startingNumber = i;
            }
        }


    }
}
