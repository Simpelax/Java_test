package org.example;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your age: ");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("You was born");
                break;
            case 7:
                System.out.println("You go to school");
                break;
            case 18 :
                System.out.println("You end the school");
                break;
            default:
                System.out.println("Incorrect age.");
        }
    }
}
