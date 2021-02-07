package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(powerOf(3,4));
        System.out.println(palindrome("3223"));
        decToBin(15);
    }

    //targil 1
    public static int powerOf(int base, int power) {
        if (power == 1) return base * power;
        return base * powerOf(base, power - 1);
    }

    //targil 2
    public static boolean palindrome(String num) {
        if (num.length() <= 1) return true;
        else {
            if (num.charAt(0) != num.charAt(num.length() - 1)) return false;
            else {
                return palindrome(num.substring(1, num.length() - 1));
            }
        }
    }

    //targil 3
    public static void decToBin(int dec) {
        if (dec < 1) ;
        else {
            decToBin(dec / 2);
            System.out.print(dec % 2);
        }
    }
}