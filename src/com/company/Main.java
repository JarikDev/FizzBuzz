package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
                continue;
            }else if(i%3==0&&i%5!=0){
                System.out.println("Fizz");
                continue;
            }else if(i%3!=0&&i%5==0){
                System.out.println("Buzz");
                continue;
            }else{
                System.out.println(i);
            }

        }
    }
}
