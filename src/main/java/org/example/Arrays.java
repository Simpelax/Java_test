package org.example;

public class Arrays {
    public static void main(String[] args) {
        int number = 10; // primitive type of data
        int [] numbers = new int[5]; // numbers -> [array] link-type of data
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i*10;
        }
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

        int[] numbers1 = {1, 2 , 3, 5, 4, 7};
        for (int i = 0; i < numbers1.length ; i++) {
            System.out.println(numbers1[i]);
        }
    }
}
