package org.example;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Write something from keyboard: ");
        String string = s.nextLine();
        System.out.println("Your text is :"+string);
    }
}
