package com;

public class Factorial {

    /*Normal approach- iterative approach*/
    public static void main(String[] args) {

       int fact=1;
       int number=7;
       for(int i=1;i<=7;i++){
           fact=fact*i;
       }

        /*---------------------------------*/
        if (number == 0 || number == 1) {
            System.out.println("1");
        } else {
            System.out.println(fact);
        }


    }

    /* -----------Recursive Approach-----------*/

//    public static long factorial(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//
//        } else {
//            return n * factorial(n - 1);
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int i = 7;
//        long number = factorial(i);
//        System.out.println(number);
//    }

}
