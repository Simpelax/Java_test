package org.example;

import java.util.Scanner;
public class Test_task {
public class Main {
    public static void main(String[] args) {
        System.out.println("__Calculator__");
        System.out.println("Write your expression:");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String result = calc(input);
        System.out.println("The result is: " + result);
    }
}
    public static String calc(String input) {
        String[] symbols = input.split(" ");
        return input;
    }
}
