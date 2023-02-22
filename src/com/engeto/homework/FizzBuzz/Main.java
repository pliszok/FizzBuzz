package com.engeto.homework.FizzBuzz;

public class Main {

    public static void main(String[] args) {

        int number;
        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";

        System.out.println("Funkce vypíš celá čísla od 1 do 100.\nMísto čísel dělitelných 3 vypíše \"Fizz\",\n" +
                "místo čísel dělitelných 5 vypíše \"Buzz\"\na místo čísel dělitelných zároveň 3 a 5 vypíše \"FizzBuzz\".");

        number = 0;
        int divisionBy3;
        int divisionBy5;
        for (int i = 0; i < 100; i++) {
            number += 1;
            divisionBy3 = number % 3;
            divisionBy5 = number % 5;
            switch (number){
                case divisionBy3 = 0:
                    System.out.println(fizz);
                    break;
                case divisionBy5 = 0:
                    System.out.println(buzz);
                    break;
                case (divisionBy3=0)&&(divisionBy5=0):
                    System.out.println(fizzBuzz);
                default:
                    System.out.println(number);
            }
            System.out.println(number);
        }
    }
}
