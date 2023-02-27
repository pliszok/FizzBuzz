package com.engeto.homework.FizzBuzz;

public class Main {

    public static void main(String[] args) {
        String output;
        int number1 = 3;
        int number2 = 5;
        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";

        System.out.println("Funkce vypíš celá čísla od 1 do 100.\nMísto čísel dělitelných 3 vypíše \"Fizz\",\n" +
                "místo čísel dělitelných 5 vypíše \"Buzz\"\na místo čísel dělitelných zároveň 3 a 5 vypíše \"FizzBuzz\".");

        for (int i = 1; i <= 100; i++) {

            if(i%number1==0&&i%number2==0){
                output=fizzBuzz;
            }
            else if (i%number2==0){
                output=buzz;
                }
            else if (i%number1==0) {
                output = fizz;
                }
            else {
                output = ""+i;
            }
            System.out.println(output);
        }
    }
}
