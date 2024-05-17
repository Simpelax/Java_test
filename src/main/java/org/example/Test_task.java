package org.example;

import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        System.out.println("__Calculator__");
        System.out.println("Write your expression:");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int result = calc(input);  // берём с psS calc(String input)
        System.out.println("The result is: "+result);
    }

    public static int calc(String input) {
        String[] symbols = input.split(" "); // выражение в массив посимвольно и разбить по пробелам на части
        if (symbols.length != 3) {
            System.out.println("Invalid input");
            return 0; // проверка на 2 оператора и 1 операнд
        }
        int firstSymbol = Integer.parseInt(symbols[0]); // перевод строки на входе с консоли в числа
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
            if (secondSymbol == 0 && firstSymbol == 0) {
                System.out.println("Cannot divide by zero");
                return 0; // деление на ноль
            }
            total = firstSymbol / secondSymbol;
        } else {
            System.out.println("Invalid operation");
            return 0; // Return a default value as an error indicator
        }
        return total;
    }
}
