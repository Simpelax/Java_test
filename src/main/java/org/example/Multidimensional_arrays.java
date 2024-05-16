package org.example;

public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] number = {1,2,3};
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.println(STR."\{matrix[i][j]} ");
            }
            System.out.println();
        }
        
        int[] number1 = new int[5];

        String [][] strings = new String[2][0];
        strings[0][1] = "hi!!!";
        System.out.println(strings[0][1]);
    }
}
