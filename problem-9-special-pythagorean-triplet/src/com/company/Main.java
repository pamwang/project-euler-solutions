package com.company;

//problem 9- specail pythagorean triple
//Date: Sept. 27th. 2020
//NOTES: There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
	    //maximum number a or b or c can be
        int MAX = 1000;
        double a=0, b=0, c=0;

        //iterate from a -> 1000
        for(a = 0 ; a < 1000; a++){
            //iterate from b (a<b) -> 1000
            for(b=a+1; b<1000; b++){
                //finding c using pythagorean theorem
                c = sqrt(a*a+b*b);
                //if their sum is 1000
                if(a+b+c==MAX){
                    //answer is found
                    System.out.println("Answer is: "+a*b*c);
                }

            }
        }
    }
}
