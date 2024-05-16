package org.example;

import java.util.Scanner;
public class Test_task {
public class Main {
    public static void main(String[] args) {
        System.out.println("__Calculator__");
        System.out.println("Write your expression:");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String result = calc(input); // берём с psS calc(String input)
        System.out.println("The result is: " + result);
    }
}
    public static String calc(String input) {
        String[] symbols = input.split(" "); // выражение в массив посимвольно и разбить пробелами на части
        if (symbols.length != 3) {
            System.out.println("Invalid input");
        }
        int firstSymbol = Integer.parseInt(symbols[0]);
        String operation = symbols[1];
        int secondSymbol = Integer.parseInt(symbols[2]);
        int total = 0;
        if (operation.equals("+")) {
            total = firstSymbol + secondSymbol;
        } else if (operation.equals("-")) {
            total = firstSymbol - secondSymbol;
        } else if (operation.equals("*")) {
            total = firstSymbol * secondSymbol;
        } else if (operation.equals("/")) {
            total = firstSymbol / secondSymbol;
        } else {
            return "Invalid operation";
        }
        return String.valueOf(total);
    }
}
