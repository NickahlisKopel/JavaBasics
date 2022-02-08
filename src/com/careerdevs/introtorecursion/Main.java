package com.careerdevs.introtorecursion;

public class Main {
    public static void main(String[] args) {
        countDown(10);
        System.out.println(sum(5));
        System.out.println(countDownRec(10));
    }

    public static void countDown(int num){
        for(int i = num; i >= 0; i--){
            System.out.println(i);
        }
    }

    public static int sum(int n) {
        if (n >= 1) {
            return sum(n - 1) + n;
        }
        return n;
    }

    public static int countDownRec(int num){
        if(num >= 1){
            System.out.println(num);
            return countDownRec(num-1);
        }
        return num;
    }
}
