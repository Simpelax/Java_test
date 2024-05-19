package org.example;

import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {
        System.out.println("__Calculator__");
        System.out.println("Write your expression:");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String[] symbols = input.split(" ");
        boolean isArabicInput = symbols[0].matches("[0-9]+");
        if (isArabicInput) {
            int result = calc(input);  // берём с psS calc(String input)
            System.out.println("The result is: " + result);
        } else {
            RomanCalculator romanCalc = new RomanCalculator();  // создаем объект RomanCalculator
            romanCalc.calculate(input); // вызываем метод calculate для обработки римских чисел
        }
    }
    // Метод для обработки арабских чисел
    public static int calc(String input) {
        String[] symbols = input.trim().split(" ");
        if (symbols.length != 3) {
            System.out.println("Invalid input");
            return 0;
        }

        int firstSymbol = Integer.parseInt(symbols[0]);
        if (firstSymbol > 10) {
            System.out.println("Error: Operand cannot be more than 10.");
            return 0;
        }

        String operation = symbols[1];

        int secondSymbol = Integer.parseInt(symbols[2]);
        if (secondSymbol > 10) {
            System.out.println("Error: Operand cannot be more than 10.");
            return 0;
        }

        int total = 0;
        switch (operation) {
            case "+":
                total = firstSymbol + secondSymbol;
                break;
            case "-":
                total = firstSymbol - secondSymbol;
                break;
            case "*":
                total = firstSymbol * secondSymbol;
                break;
            case "/":
                if (secondSymbol == 0) {
                    System.out.println("Error: Cannot divide by zero");
                    return 0;
                }
                total = firstSymbol / secondSymbol;
                break;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
        return total;
    }
    public static class RomanCalculator {
        private final static String[] romanNumerals = {"I","IV", "V", "IX", "X"};

            // Метод для обработки римских чисел
            public void calculate(String input) {
                Scanner scanner = new Scanner(System.in);
                try {
                    String[] symbols = input.split(" ");
                    int num1 = romanToArabic(symbols[0]);
                    String operation = symbols[1];
                    int num2 = romanToArabic(symbols[2]);

                int result;

                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        if (result<0) {
                            System.out.println("ERROR: result < 0.");
                            break;
                        }else break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/" :
                        result = num1 / num2;
                        break;
                    default: throw new IllegalArgumentException("ERROR: Illegal operation!");
                }
                if (result < 0) {
                    throw new IllegalArgumentException ("ERROR: result cannot be less that 0.");
                }
                    String romanResult = arabicToRoman(result);
                    System.out.println("Result: " + romanResult);
                } catch (Exception E) {
                    System.out.println("ERROR: " + E.getMessage());
                }
            }
        }

    private static int romanToArabic (String roman) {
        int result = 0;
        // Проходим fori по символам римского числа
        for (int i = 0; i <roman.length() ; i++) {
            char c = roman.charAt(i);
            // Обработка случаев для каждого символа римского числа
            if (c == 'I') {
                result += 1;
            } else if (c == 'V') {
                // Дополнительная логика для символа V с учетом предыдущего символа I
                if (i > 0 && roman.charAt(i - 1) == 'I') {
                    result += 4;
                } else {
                    result += 5;
                }
            } else if (c == 'X') {
                // Дополнительная логика для символа X с учетом предыдущего символа I
                if (i > 0 && roman.charAt(i - 1) == 'I') {
                    result += 9;
                } else {
                    result += 10;
                }
        } else {
                // Выбрасываеем исключение, если встречается неверный символ римского числа
            throw new IllegalArgumentException("ERROR: Illegal Roman number: " + c + "!");
            }
        }
        return result;
    }

    private static String arabicToRoman (int number) {
        if (number < 1 || number > 20) {
            throw new IllegalArgumentException("ERROR: Number must be in diapason from 1 to 20!");
        }
        // с оздаем StringBuilder для хранения римского символа
        StringBuilder roman = new StringBuilder();
        // Начинаем с наибольшего римскоо символа (X) и двигаемся к меньшему
        int i = RomanCalculator.romanNumerals.length - 1;
        // Проходим по арабскому числу и добавляем соответствующие римские символы
        while (number > 0) {
            if (number >= romanToArabic(RomanCalculator.romanNumerals[i])) {
                roman.append(RomanCalculator.romanNumerals[i]);
                number -= romanToArabic(RomanCalculator.romanNumerals[i]);
            } else {
                i--;
            }
        }
        // Возвращает строковое представление римского числа
        return roman.toString();
    }
}