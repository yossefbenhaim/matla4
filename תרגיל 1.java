package com.company;

public class Main {


        public static void main(String[] args) {
            System.out.println(primeN(4));
            prime();
            firstPrimes();
            System.out.println(PerfectN(28));
            PerfectN(6);
        }

        //שאלה 1
        public static boolean primeN(int num) {
            if (num == 1 || num == 0) {
                return false;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        //שאלה 2
        public static void prime() {
            int i;
            for (i = 2; i < 1000000; i++) {
                if (primeN(i) == true) {
                    System.out.println(i);
                }
            }

        }


        //שאלה 3
        public static void firstPrimes() {
            int i, cnt = 0;
            for (i = 2; i < 1000000; i++) {
                if (primeN(i)) {
                    cnt++;
                    System.out.println(i);
                }
                if (cnt == 100) {
                    break;
                }
            }
        }
        //שאלה 4

    public static boolean PerfectN(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            return true;
        }
        else {
            return false;
        }

    }
        //שאלה 5

    public static void perfect(){
        for (int i = 0; i < 1000000; i++) {
            if ( PerfectN(i) == true){
                System.out.println(i);
            }
        }
    }


}



